package com.fs_sournary.weather.screen.main;

import android.Manifest;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.ActivityMainBinding;
import com.fs_sournary.weather.screen.BaseActivity;
import com.fs_sournary.weather.utils.Constant;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    MainViewModel mViewModel;

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            initComponents();
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    Constant.RC_LOCATION);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        switch (requestCode) {
            case Constant.RC_LOCATION:
                if (permissions.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    initComponents();
                }
                break;
        }
    }

    private void initComponents() {
        mBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        DaggerMainComponent.builder()
                .applicationComponent(((MainApplication) getApplication()).getComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        mBinding.setViewModel(mViewModel);
        mBinding.setView(this);
    }

    public ViewPager getViewPager() {
        return mBinding.pagerPlaceHolder;
    }

}
