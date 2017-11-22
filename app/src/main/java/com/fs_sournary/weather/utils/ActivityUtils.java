package com.fs_sournary.weather.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by fs-sournary.
 * Date on 11/18/17.
 * Description:
 */

public class ActivityUtils {

    public static void addFragmentToActivity(FragmentManager fragmentManager, int placeHolder,
                                             Fragment fragment, String tag) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(placeHolder, fragment, tag);
        transaction.commit();
    }

}
