package com.fs_sournary.weather.screen.main.fragment.forecast;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fs_sournary.weather.R;
import com.fs_sournary.weather.data.model.DailyWeather;
import com.fs_sournary.weather.databinding.ItemForecastBinding;
import com.fs_sournary.weather.screen.BaseRecyclerAdapter;

import java.util.List;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

public class ForecastAdapter extends BaseRecyclerAdapter<ForecastAdapter.ForecastViewHolder> {

    private List<DailyWeather> mDataDailyList;
    private BaseRecyclerAdapter.OnItemRecyclerViewClickListener<DailyWeather> mClickListener;

    ForecastAdapter(Context context, List<DailyWeather> dailyList) {
        super(context);
        mDataDailyList = dailyList;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemForecastBinding itemForecastBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_forecast,
                parent,
                false
        );
        return new ForecastViewHolder(itemForecastBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ForecastViewHolder holder, int position) {
        holder.bindView(mDataDailyList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataDailyList.size();
    }

    public void setClickListener(OnItemRecyclerViewClickListener<DailyWeather> clickListener) {
        mClickListener = clickListener;
    }

    public void setDataDailyList(List<DailyWeather> dataDailyList) {
        mDataDailyList = dataDailyList;
        notifyDataSetChanged();
    }

    class ForecastViewHolder extends RecyclerView.ViewHolder {

        private ItemForecastBinding mBinding;

        ForecastViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        void bindView(DailyWeather daily) {
            mBinding.setViewModel(new ItemForecastViewModel(daily, mClickListener));
        }

    }

}
