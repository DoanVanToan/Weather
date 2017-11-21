package com.fs_sournary.weather.screen.main.fragment.current;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.v4.widget.SwipeRefreshLayout;

import com.fs_sournary.weather.BR;
import com.fs_sournary.weather.BuildConfig;
import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.model.GenerateWeather;
import com.fs_sournary.weather.screen.BaseViewModel;

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
    private String mTemperate;

    private WeatherRepository mWeatherRepository;
    private CompositeDisposable mCompositeDisposable;

    CurrentViewModel(WeatherRepository repository) {
        mWeatherRepository = repository;
        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void onDestroy() {
        mCompositeDisposable.clear();
    }

    private void showCurrentWeather() {
        // Demo giao xem đã xử lý phần server đúng chưa
        Disposable disposable = mWeatherRepository.getCurrentWeather(BuildConfig.API_KEY,
                "42.3601,-71.0589")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<GenerateWeather>() {
                    @Override
                    public void onNext(GenerateWeather generateWeather) {
                        setTemperate(generateWeather.getTimezone());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        mCompositeDisposable.add(disposable);
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
    public String getTemperate() {
        return mTemperate;
    }

    public void setTemperate(String temperate) {
        mTemperate = temperate;
        notifyPropertyChanged(BR.temperate);
    }

    public SwipeRefreshLayout.OnRefreshListener getOnRefreshListener() {
        return new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                setRefresh(false);
                showCurrentWeather();
                setRefresh(true);
            }
        };
    }

}
