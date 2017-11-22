package com.fs_sournary.weather.utils;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.ImageView;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class BindingUtils {

    @BindingAdapter({"bind:onRefresh"})
    public static void setOnRefreshing(SwipeRefreshLayout layout,
                                       SwipeRefreshLayout.OnRefreshListener listener) {
        layout.setOnRefreshListener(listener);
    }

    @BindingAdapter({"bind:image"})
    public static void loadImage(ImageView imageView, int idImage) {
        imageView.setImageResource(idImage);
    }

}
