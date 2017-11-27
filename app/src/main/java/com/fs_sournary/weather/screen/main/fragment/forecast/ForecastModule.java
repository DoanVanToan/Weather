package com.fs_sournary.weather.screen.main.fragment.forecast;

import android.support.v4.app.Fragment;

import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.model.DailyWeather;
import com.fs_sournary.weather.data.source.remote.WeatherRemoteDataSource;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.scope.FragmentScope;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

@Module
class ForecastModule {

    private Fragment mFragment;

    ForecastModule(Fragment fragment) {
        mFragment = fragment;
    }

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
    ForecastAdapter provideForecastAdapter() {
        List<DailyWeather> dataDailyList = new ArrayList<>();
        return new ForecastAdapter(mFragment.getActivity(), dataDailyList);
    }

    @FragmentScope
    @Provides
    ForecastViewModel provideForecastViewModel(ForecastAdapter forecastAdapter,
                                               WeatherRepository weatherRepository) {
        return new ForecastViewModel(forecastAdapter, weatherRepository);
    }

}
