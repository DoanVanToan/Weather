package com.fs_sournary.weather.screen.main;

import android.Manifest;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.ActivityMainBinding;
import com.fs_sournary.weather.screen.BaseActivity;
import com.fs_sournary.weather.screen.main.fragment.current.CurrentWeatherFragment;
import com.fs_sournary.weather.utils.ActivityUtils;
import com.fs_sournary.weather.utils.Constant;

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
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            findOrCreateFragment();
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    Constant.RC_LOCATION);
        }
    }

    private void findOrCreateFragment() {
        CurrentWeatherFragment currentWeatherFragment =
                (CurrentWeatherFragment) getSupportFragmentManager()
                        .findFragmentByTag(Constant.CURRENT_FRAGMENT_TAG);
        if (currentWeatherFragment == null) {
            currentWeatherFragment = CurrentWeatherFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    R.id.frame_place_holder, currentWeatherFragment,
                    Constant.CURRENT_FRAGMENT_TAG);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case Constant.RC_LOCATION:
                if (permissions.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    findOrCreateFragment();
                }
                break;
        }
    }
}
