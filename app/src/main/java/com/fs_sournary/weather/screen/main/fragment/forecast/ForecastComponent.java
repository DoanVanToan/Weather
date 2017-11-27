package com.fs_sournary.weather.screen.main.fragment.forecast;

import com.fs_sournary.weather.ApplicationComponent;
import com.fs_sournary.weather.utils.scope.FragmentScope;

import dagger.Component;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = ForecastModule.class)
public interface ForecastComponent {

    void inject(ForecastFragment fragment);

}
