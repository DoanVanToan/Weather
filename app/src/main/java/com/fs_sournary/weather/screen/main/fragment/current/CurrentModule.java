package com.fs_sournary.weather.screen.main.fragment.current;

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
    CurrentViewModel provideCurrentViewModel() {
        return new CurrentViewModel();
    }

}
