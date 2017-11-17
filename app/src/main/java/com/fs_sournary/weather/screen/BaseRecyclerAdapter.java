package com.fs_sournary.weather.screen;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

/**
 * Created by fs-sournary.
 * Date on 11/16/17.
 * Description:
 */

public abstract class BaseRecyclerAdapter<T extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<T> {

    private Context mContext;

    public BaseRecyclerAdapter(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

}
