package com.fs_sournary.weather.screen.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.ActivityMainBinding;
import com.fs_sournary.weather.screen.BaseActivity;
import com.fs_sournary.weather.screen.main.fragment.current.CurrentWeatherFragment;
import com.fs_sournary.weather.utils.Constant;
import com.fs_sournary.weather.utils.navigator.ActivityNavigator;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        DaggerMainComponent.builder()
                .applicationComponent(((MainApplication) getApplication()).getComponent())
                .mainModule(new MainModule())
                .build()
                .inject(this);
        binding.setViewModel(mViewModel);
        CurrentWeatherFragment currentWeatherFragment =
                (CurrentWeatherFragment) getSupportFragmentManager()
                .findFragmentByTag(Constant.CURRENT_FRAGMENT_TAG);
        if (currentWeatherFragment == null) {
            currentWeatherFragment = CurrentWeatherFragment.newInstance();
            ActivityNavigator.addFragmentToActivity(getSupportFragmentManager(),
                    R.id.frame_place_holder, currentWeatherFragment, Constant.CURRENT_FRAGMENT_TAG);
        }
    }

}
