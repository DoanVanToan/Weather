package com.fs_sournary.weather.data.source.remote;

import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.Constant;
import com.fs_sournary.weather.utils.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@Module
public class NetWorkModule {

    @ApplicationScope
    @Provides
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL_API)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    @ApplicationScope
    @Provides
    public WeatherApi provideWeatherApi(Retrofit retrofit) {
        return retrofit.create(WeatherApi.class);
    }

}
