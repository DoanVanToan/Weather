package com.fs_sournary.weather.screen.main.fragment.current;

import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.source.remote.WeatherRemoteDataSource;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@Module
class CurrentModule {

    @FragmentScope
    @Provides
    WeatherRemoteDataSource provideWeatherRemoteDataSource(WeatherApi weatherApi) {
        return new WeatherRemoteDataSource(weatherApi);
    }

    @FragmentScope
    @Provides
    WeatherRepository provideWeatherRepository(WeatherRemoteDataSource remoteDataSource) {
        return new WeatherRepository(remoteDataSource);
    }

    @FragmentScope
    @Provides
    CurrentViewModel provideCurrentViewModel(WeatherRepository weatherRepository) {
        return new CurrentViewModel(weatherRepository);
    }

}
