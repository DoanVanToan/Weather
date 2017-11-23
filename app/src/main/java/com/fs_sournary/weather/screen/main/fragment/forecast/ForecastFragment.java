package com.fs_sournary.weather.screen.main.fragment.forecast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fs_sournary.weather.R;
import com.fs_sournary.weather.screen.BaseFragment;

/**
 * Created by fs-sournary.
 * Date on 11/19/17.
 * Description:
 */

public class ForecastFragment extends BaseFragment {

    public static ForecastFragment newInstance() {
        return new ForecastFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Demo for displaying when use with ViewPager and TabLayout
        // I will fix this later
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        return view;
    }
}
