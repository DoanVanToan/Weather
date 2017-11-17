package com.fs_sournary.weather.screen.main.fragment.current;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.FragmentMainCurrentBinding;
import com.fs_sournary.weather.screen.BaseFragment;

import javax.inject.Inject;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class CurrentWeatherFragment extends BaseFragment {

    @Inject
    CurrentViewModel mCurrentViewModel;

    public CurrentWeatherFragment() {
    }

    public static CurrentWeatherFragment newInstance() {
        return new CurrentWeatherFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        DaggerCurrentComponent.builder().applicationComponent(((MainApplication) getActivity()
                .getApplication()).getComponent())
                .currentModule(new CurrentModule())
                .build()
                .inject(this);
        FragmentMainCurrentBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_main_current, container, false);
        binding.setViewModel(mCurrentViewModel);
        View view = binding.getRoot();
        return view;
    }
}
