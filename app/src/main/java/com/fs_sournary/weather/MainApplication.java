package com.fs_sournary.weather;

import android.app.Application;

import com.fs_sournary.weather.data.source.RepositoryModule;
import com.fs_sournary.weather.data.source.remote.NetWorkModule;

/**
 * Created by fs-sournary.
 * Date on 11/16/17.
 * Description:
 */

public class MainApplication extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public ApplicationComponent getComponent() {
        if (mComponent == null) {
            mComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .repositoryModule(new RepositoryModule())
                    .netWorkModule(new NetWorkModule())
                    .build();
        }
        return mComponent;
    }

}
