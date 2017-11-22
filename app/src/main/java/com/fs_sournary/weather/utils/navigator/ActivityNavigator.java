package com.fs_sournary.weather.utils.navigator;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class ActivityNavigator {

    public static void startActivity(Activity activity, Class<? extends Activity> clazz) {
        Intent intent = new Intent(activity, clazz);
        activity.startActivity(intent);
    }

}
