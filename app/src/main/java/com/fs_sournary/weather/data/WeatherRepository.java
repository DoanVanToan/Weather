package com.fs_sournary.weather.data;

import com.fs_sournary.weather.data.model.GenerateWeather;
import com.fs_sournary.weather.data.source.remote.WeatherRemoteDataSource;

import io.reactivex.Observable;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class WeatherRepository {

    private WeatherRemoteDataSource mRemoteDataSource;

    public WeatherRepository(WeatherRemoteDataSource remoteDataSource) {
        mRemoteDataSource = remoteDataSource;
    }

    public Observable<GenerateWeather> getCurrentWeather(String key, String location) {
        return mRemoteDataSource.getCurrentWeather(key, location);
    }

}
