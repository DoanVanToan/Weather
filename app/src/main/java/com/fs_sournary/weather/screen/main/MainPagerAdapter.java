package com.fs_sournary.weather.screen.main;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fs_sournary.weather.R;
import com.fs_sournary.weather.screen.main.fragment.current.CurrentWeatherFragment;
import com.fs_sournary.weather.screen.main.fragment.forecast.ForecastFragment;
import com.fs_sournary.weather.screen.main.fragment.history.HistoryFragment;
import com.fs_sournary.weather.utils.Constant;
import com.fs_sournary.weather.utils.definition.FragmentOrder;

/**
 * Created by fs-sournary.
 * Date on 11/22/17.
 * Description:
 */

public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;
    private CurrentWeatherFragment mCurrentWeatherFragment;
    private ForecastFragment mForecastFragment;
    private HistoryFragment mHistoryFragment;

    MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case FragmentOrder.FIRST:
                return mCurrentWeatherFragment;
            case FragmentOrder.SECOND:
                return mForecastFragment;
            case FragmentOrder.THIRD:
                return mHistoryFragment;
            default:
                return mCurrentWeatherFragment;
        }
    }

    @Override
    public int getCount() {
        return Constant.COUNT_FRAGMENT_MAIN;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case FragmentOrder.FIRST:
                return mContext.getString(R.string.title_current);
            case FragmentOrder.SECOND:
                return mContext.getString(R.string.title_forecast);
            case FragmentOrder.THIRD:
                return mContext.getString(R.string.title_history);
            default:
                return mContext.getString(R.string.title_current);
        }
    }

    void setCurrentWeatherFragment(CurrentWeatherFragment currentWeatherFragment) {
        mCurrentWeatherFragment = currentWeatherFragment;
    }

    void setForecastFragment(ForecastFragment forecastFragment) {
        mForecastFragment = forecastFragment;
    }

    void setHistoryFragment(HistoryFragment historyFragment) {
        mHistoryFragment = historyFragment;
    }
}
