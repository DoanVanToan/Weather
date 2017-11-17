package com.fs_sournary.weather.screen.main.fragment.current;

import android.support.v4.app.Fragment;

import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.source.remote.WeatherRemoteDataSource;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.ConvertTimeUtils;
import com.fs_sournary.weather.utils.scope.FragmentScope;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@Module
class CurrentModule {

    private Fragment mFragment;

    CurrentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @FragmentScope
    @Provides
    GoogleApiClient providesGoogleApiClient() {
        return new GoogleApiClient.Builder(mFragment.getActivity())
                .addApi(LocationServices.API)
                .addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks) mFragment)
                .addOnConnectionFailedListener(
                        (GoogleApiClient.OnConnectionFailedListener) mFragment)
                .build();
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
    ConvertTimeUtils provideConverTimeUtils() {
        return new ConvertTimeUtils();
    }

    @FragmentScope
    @Provides
    CurrentViewModel provideCurrentViewModel(WeatherRepository weatherRepository,
                                             ConvertTimeUtils convertTimeUtils) {
        return new CurrentViewModel(weatherRepository, convertTimeUtils);
    }

}
