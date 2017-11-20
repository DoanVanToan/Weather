package com.fs_sournary.weather.screen.main.fragment.forecast;

import com.fs_sournary.weather.BuildConfig;
import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.model.DailyResponse;
import com.fs_sournary.weather.data.model.GenerateWeather;
import com.fs_sournary.weather.screen.BaseViewModel;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

public class ForecastViewModel implements BaseViewModel {

    private ForecastAdapter mForecastAdapter;
    private WeatherRepository mWeatherRepository;
    private CompositeDisposable mCompositeDisposable;

    ForecastViewModel(ForecastAdapter forecastAdapter,
                      WeatherRepository weatherRepository) {
        mForecastAdapter = forecastAdapter;
        mWeatherRepository = weatherRepository;
        mCompositeDisposable = new CompositeDisposable();
    }

    void showCurrentWeather(String location) {
        Disposable disposable = mWeatherRepository.getCurrentWeather(BuildConfig.API_KEY, location)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<GenerateWeather>() {
                    @Override
                    public void onNext(GenerateWeather generateWeather) {
                        DailyResponse response = generateWeather
                                .getDailyResponse();
                        mForecastAdapter.setDataDailyList(response.getDataDailies());
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

    public ForecastAdapter getForecastAdapter() {
        return mForecastAdapter;
    }

    @Override
    public void onDestroy() {
        mCompositeDisposable.clear();
    }
}
