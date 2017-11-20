package com.fs_sournary.weather.screen.main.fragment.forecast;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.FragmentForecastBinding;
import com.fs_sournary.weather.screen.BaseFragment;
import com.fs_sournary.weather.utils.Constant;

import javax.inject.Inject;

/**
 * Created by fs-sournary.
 * Date on 11/19/17.
 * Description:
 */

public class ForecastFragment extends BaseFragment {

    @Inject
    ForecastViewModel mForecastViewModel;

    public static ForecastFragment newInstance(String location) {
        ForecastFragment forecastFragment = new ForecastFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constant.ARGUMENT_LOCATION, location);
        forecastFragment.setArguments(bundle);
        return forecastFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DaggerForecastComponent.builder()
                .applicationComponent(
                        ((MainApplication) getActivity().getApplication()).getComponent())
                .forecastModule(new ForecastModule(this))
                .build()
                .inject(this);
        FragmentForecastBinding binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_forecast, container, false);
        binding.setViewModel(mForecastViewModel);
        String location = getArguments().getString(Constant.ARGUMENT_LOCATION);
        mForecastViewModel.showCurrentWeather(location);
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mForecastViewModel.onDestroy();
    }
}
