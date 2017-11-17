package com.fs_sournary.weather;

import android.content.Context;

import com.fs_sournary.weather.utils.scope.ApplicationScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by fs-sournary.
 * Date on 11/16/17.
 * Description:
 */

@Module
public class ApplicationModule {

    private Context mContext;

    public ApplicationModule(Context context) {
        mContext = context;
    }

    @ApplicationScope
    @Provides
    Context provideApplicationContext() {
        return mContext;
    }

}
