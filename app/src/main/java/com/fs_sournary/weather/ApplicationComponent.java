package com.fs_sournary.weather;

import android.content.Context;

import com.fs_sournary.weather.data.source.RepositoryModule;
import com.fs_sournary.weather.data.source.remote.NetWorkModule;
import com.fs_sournary.weather.data.source.remote.api.service.WeatherApi;
import com.fs_sournary.weather.utils.scope.ApplicationScope;

import dagger.Component;

/**
 * Created by fs-sournary.
 * Date on 11/16/17.
 * Description:
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class, RepositoryModule.class, NetWorkModule.class})
public interface ApplicationComponent {

    Context applicationContext();

    WeatherApi weatherApi();

}
