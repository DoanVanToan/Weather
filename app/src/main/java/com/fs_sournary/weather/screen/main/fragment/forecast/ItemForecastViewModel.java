package com.fs_sournary.weather.screen.main.fragment.forecast;

import android.view.View;

import com.fs_sournary.weather.R;
import com.fs_sournary.weather.data.model.DailyWeather;
import com.fs_sournary.weather.screen.BaseRecyclerAdapter;
import com.fs_sournary.weather.utils.Constant;
import com.fs_sournary.weather.utils.ConvertTimeUtils;
import com.fs_sournary.weather.utils.definition.ImageWeather;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

public class ItemForecastViewModel {

    private DailyWeather mDailyWeather;
    private BaseRecyclerAdapter.OnItemRecyclerViewClickListener<DailyWeather> mClickListener;
    private ConvertTimeUtils mConvertTimeUtils;

    ItemForecastViewModel(DailyWeather dailyWeather,
                          BaseRecyclerAdapter.OnItemRecyclerViewClickListener<DailyWeather>
                                  listener) {
        mDailyWeather = dailyWeather;
        mClickListener = listener;
        mConvertTimeUtils = new ConvertTimeUtils();
    }

    public String getSummary() {
        return mDailyWeather.getSummary();
    }

    public String getTemperature() {
        return String.valueOf(mDailyWeather.getTemperatureHigh());
    }

    public String getLastUpdateTime() {
        return Constant.TITLE_LAST_UPDATE
                + mConvertTimeUtils.getDateString((int) mDailyWeather.getTime());
    }

    public int getIdImageWeather() {
        switch (mDailyWeather.getIcon()) {
            case ImageWeather.CLEAR_DAY:
                return R.drawable.ic_sunny;
            case ImageWeather.CLEAR_NIGHT:
                return R.drawable.ic_clear_night;
            case ImageWeather.RAIN:
                return R.drawable.ic_light_showers;
            case ImageWeather.SNOW:
                return R.drawable.ic_snow;
            case ImageWeather.SLEET:
                return R.drawable.ic_heavy_showers;
            case ImageWeather.WIND:
                return R.drawable.ic_wind;
            case ImageWeather.FOG:
                return R.drawable.ic_fog;
            case ImageWeather.CLOUDY:
                return R.drawable.ic_cloud;
            case ImageWeather.PARTLY_CLOUDY_DAY:
                return R.drawable.ic_partly_cloudy_day;
            case ImageWeather.PARTLY_CLOUDY_NIGHT:
                return R.drawable.ic_partly_cloudy_night;
            default:
                return R.drawable.ic_sunny;
        }
    }

    public void onItemClickListener(View view) {
        if (mClickListener != null) {
            mClickListener.setOnItemRecyclerViewClickListener(mDailyWeather);
        }
    }

}
