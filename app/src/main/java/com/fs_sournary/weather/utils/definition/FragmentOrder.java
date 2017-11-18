package com.fs_sournary.weather.utils.definition;

import android.support.annotation.IntDef;

import static com.fs_sournary.weather.utils.definition.FragmentOrder.FIRST;
import static com.fs_sournary.weather.utils.definition.FragmentOrder.SECOND;
import static com.fs_sournary.weather.utils.definition.FragmentOrder.THIRD;

/**
 * Created by fs-sournary.
 * Date on 11/19/17.
 * Description:
 */

@IntDef({FIRST, SECOND, THIRD})
public @interface FragmentOrder {
    int FIRST = 0;
    int SECOND = 1;
    int THIRD = 2;
}
