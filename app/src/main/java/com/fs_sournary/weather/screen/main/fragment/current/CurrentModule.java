package com.fs_sournary.weather.screen.main.fragment.current;

import android.support.v4.app.Fragment;

import com.fs_sournary.weather.data.WeatherRepository;
import com.fs_sournary.weather.data.source.remote.WeatherRemoteDataSource;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.ConvertTimeUtils;
import com.fs_sournary.weather.utils.scope.FragmentScope;
import com.fs_sournary.weather.widget.dialog.DialogManager;
import com.fs_sournary.weather.widget.dialog.progress.ProgressDialogImpl;

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
    DialogManager provideDialogManager() {
        return new ProgressDialogImpl(mFragment.getActivity());
    }

    @FragmentScope
    @Provides
    CurrentViewModel provideCurrentViewModel(WeatherRepository weatherRepository,
                                             ConvertTimeUtils convertTimeUtils,
                                             DialogManager dialogManager) {
        return new CurrentViewModel(weatherRepository, convertTimeUtils, dialogManager);
    }

}
