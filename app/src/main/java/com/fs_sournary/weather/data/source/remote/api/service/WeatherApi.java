package com.fs_sournary.weather.data.source.remote.api.service;

import com.fs_sournary.weather.data.model.GenerateWeather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public interface WeatherApi {

    @GET("forecast/{key}/{location}?exclude=flags,alerts,hourly")
    Observable<GenerateWeather> getCurrentWeather(@Path("key") String key,
                                                  @Path("location") String location);

}
