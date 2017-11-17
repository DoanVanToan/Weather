package com.fs_sournary.weather.data.source.remote;

import com.fs_sournary.weather.data.WeatherDataSource;
import com.fs_sournary.weather.data.model.GenerateWeather;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;

import javax.inject.Inject;

import io.reactivex.Observable;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class WeatherRemoteDataSource implements WeatherDataSource.RemoteDataSource{

    private WeatherApi mWeatherApi;

    @Inject
    public WeatherRemoteDataSource(WeatherApi weatherApi) {
        mWeatherApi = weatherApi;
    }

    @Override
    public Observable<GenerateWeather> getCurrentWeather(String key, String location) {
        return mWeatherApi.getCurrentWeather(key, location);
    }

}
