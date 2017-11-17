package com.fs_sournary.weather.screen.main;

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

    @ActivityScope
    @Provides
    MainViewModel providesMainViewModel() {
        return new MainViewModel();
    }

}
