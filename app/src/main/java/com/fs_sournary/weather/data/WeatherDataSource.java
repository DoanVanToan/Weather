package com.fs_sournary.weather.data;

import com.fs_sournary.weather.data.model.GenerateWeather;

import io.reactivex.Observable;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public interface WeatherDataSource {

    interface RemoteDataSource {

        Observable<GenerateWeather> getCurrentWeather(String key, String location);

    }

}
