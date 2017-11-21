package com.fs_sournary.weather.utils;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class BindingUtils {

    @BindingAdapter({"onRefreshing"})
    public static void setOnRefreshing(SwipeRefreshLayout layout,
                                       SwipeRefreshLayout.OnRefreshListener listener) {
        layout.setOnRefreshListener(listener);
    }

    @BindingAdapter({"refreshState"})
    public static void setRefreshState(SwipeRefreshLayout layout, boolean isRefresh) {
        layout.setRefreshing(isRefresh);
    }

}
