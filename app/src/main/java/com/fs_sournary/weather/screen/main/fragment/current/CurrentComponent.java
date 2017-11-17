package com.fs_sournary.weather.screen.main.fragment.current;

import com.fs_sournary.weather.ApplicationComponent;
import com.fs_sournary.weather.utils.scope.FragmentScope;

import dagger.Component;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = CurrentModule.class)
public interface CurrentComponent {

    void inject(CurrentWeatherFragment fragment);

}
