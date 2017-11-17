package com.fs_sournary.weather.utils.navigator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class ActivityNavigator {

    public static void addFragmentToActivity(FragmentManager fragmentManager, int placeHolder,
                                             Fragment fragment, String tag) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(placeHolder, fragment, tag);
        transaction.commit();
    }

}
