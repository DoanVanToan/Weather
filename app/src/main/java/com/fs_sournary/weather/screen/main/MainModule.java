package com.fs_sournary.weather.screen.main;

import android.support.v7.app.AppCompatActivity;

import com.fs_sournary.weather.screen.main.fragment.current.CurrentWeatherFragment;
import com.fs_sournary.weather.screen.main.fragment.forecast.ForecastFragment;
import com.fs_sournary.weather.screen.main.fragment.history.HistoryFragment;
import com.fs_sournary.weather.utils.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@Module
class MainModule {

    private AppCompatActivity mActivity;
    private String mLocation;

    MainModule(AppCompatActivity activity, String location) {
        mActivity = activity;
        mLocation = location;
    }

    @ActivityScope
    @Provides
    CurrentWeatherFragment provideCurrentWeatherFragment() {
        return CurrentWeatherFragment.newInstance(mLocation);
    }

    @ActivityScope
    @Provides
    ForecastFragment provideForecastFragment() {
        return ForecastFragment.newInstance(mLocation);
    }

    @ActivityScope
    @Provides
    HistoryFragment provideHistoryFragment() {
        return HistoryFragment.newInstance();
    }

    @ActivityScope
    @Provides
    MainPagerAdapter provideMainPagerAdapter(CurrentWeatherFragment currentWeatherFragment,
                                             ForecastFragment forecastFragment,
                                             HistoryFragment historyFragment) {
        MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(
                mActivity.getSupportFragmentManager(), mActivity);
        mainPagerAdapter.setCurrentWeatherFragment(currentWeatherFragment);
        mainPagerAdapter.setForecastFragment(forecastFragment);
        mainPagerAdapter.setHistoryFragment(historyFragment);
        return mainPagerAdapter;
    }

    @ActivityScope
    @Provides
    MainViewModel providesMainViewModel(MainPagerAdapter mainPagerAdapter) {
        return new MainViewModel(mainPagerAdapter);
    }

}
