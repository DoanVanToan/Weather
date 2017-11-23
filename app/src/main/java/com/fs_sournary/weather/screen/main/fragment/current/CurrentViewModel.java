package com.fs_sournary.weather.screen.main.fragment.current;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v4.widget.SwipeRefreshLayout;

import com.fs_sournary.weather.BR;
import com.fs_sournary.weather.BuildConfig;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.model.CurrentWeather;
import com.fs_sournary.weather.data.model.GenerateWeather;
import com.fs_sournary.weather.screen.BaseViewModel;
import com.fs_sournary.weather.utils.Constant;
import com.fs_sournary.weather.utils.ConvertTimeUtils;
import com.fs_sournary.weather.utils.definition.ImageWeather;
import com.fs_sournary.weather.widget.dialog.DialogManager;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class CurrentViewModel extends BaseObservable implements BaseViewModel {

    private boolean mIsRefresh;
    private CurrentWeather mCurrentWeather;
    private String mTime;
    private int mIcon;

    private WeatherRepository mWeatherRepository;
    private CompositeDisposable mCompositeDisposable;
    private ConvertTimeUtils mConvertTimeUtils;
    private DialogManager mDialogManager;
    private String mLocation;

    CurrentViewModel(WeatherRepository repository, ConvertTimeUtils convertTimeUtils,
                     DialogManager dialogManager) {
        mWeatherRepository = repository;
        mConvertTimeUtils = convertTimeUtils;
        mDialogManager = dialogManager;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void onDestroy() {
        mCompositeDisposable.clear();
    }

    void showCurrentWeather(String location) {
        mDialogManager.showDialog();
        mLocation = location;
        Disposable disposable = mWeatherRepository.getCurrentWeather(BuildConfig.API_KEY, location)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<GenerateWeather>() {
                    @Override
                    public void onNext(GenerateWeather generateWeather) {

                        CurrentWeather currentWeather = generateWeather.getCurrentWeather();
                        String current = Constant.TITLE_LAST_UPDATE
                                + mConvertTimeUtils.getDateString((int) currentWeather.getTime());
                        setCurrentWeather(currentWeather);
                        setTime(current);
                        setIcon(getIdImageWeather(currentWeather.getIcon()));
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onComplete() {
                        mDialogManager.dismissDialog();
                    }
                });
        mCompositeDisposable.add(disposable);
    }

    private int getIdImageWeather(String icon) {
        switch (icon) {
            case ImageWeather.CLEAR_DAY:
                return R.drawable.ic_sunny;
            case ImageWeather.CLEAR_NIGHT:
                return R.drawable.ic_clear_night;
            case ImageWeather.RAIN:
                return R.drawable.ic_light_showers;
            case ImageWeather.SNOW:
                return R.drawable.ic_snow;
            case ImageWeather.SLEET:
                return R.drawable.ic_heavy_showers;
            case ImageWeather.WIND:
                return R.drawable.ic_wind;
            case ImageWeather.FOG:
                return R.drawable.ic_fog;
            case ImageWeather.CLOUDY:
                return R.drawable.ic_cloud;
            case ImageWeather.PARTLY_CLOUDY_DAY:
                return R.drawable.ic_partly_cloudy_day;
            case ImageWeather.PARTLY_CLOUDY_NIGHT:
                return R.drawable.ic_partly_cloudy_night;
            default:
                return R.drawable.ic_sunny;
        }
    }

    @Bindable
    public boolean isRefresh() {
        return mIsRefresh;
    }

    public void setRefresh(boolean refresh) {
        mIsRefresh = refresh;
        notifyPropertyChanged(BR.refresh);
    }

    @Bindable
    public int getIcon() {
        return mIcon;
    }

    public void setIcon(int icon) {
        mIcon = icon;
        notifyPropertyChanged(BR.icon);
    }

    @Bindable
    public CurrentWeather getCurrentWeather() {
        return mCurrentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        mCurrentWeather = currentWeather;
        notifyPropertyChanged(BR.currentWeather);
    }

    @Bindable
    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
        notifyPropertyChanged(BR.time);
    }

    public SwipeRefreshLayout.OnRefreshListener getOnRefreshListener() {
        return new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                setRefresh(true);
                showCurrentWeather(mLocation);
                setRefresh(false);
            }
        };
    }

}
