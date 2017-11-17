package com.fs_sournary.weather.screen.main;

import com.fs_sournary.weather.ApplicationComponent;
import com.fs_sournary.weather.utils.scope.ActivityScope;

import dagger.Component;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
interface MainComponent {

    void inject(MainActivity activity);

}
