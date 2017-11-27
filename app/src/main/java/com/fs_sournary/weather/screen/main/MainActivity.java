package com.fs_sournary.weather.screen.main;

import android.Manifest;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.location.Location;
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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements
        GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    @Inject
    MainViewModel mViewModel;

    private GoogleApiClient mGoogleApiClient;

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
                    mGoogleApiClient.connect();
                }
                break;
        }
    }

    @Override
    public void onConnected(Bundle bundle) {
        Location lastLocation = LocationServices
                .FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (lastLocation != null) {
            String location = lastLocation.getLatitude() + "," + lastLocation.getLongitude();
            buildUiComponents(location);
        }
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mGoogleApiClient != null) {
            mGoogleApiClient.connect();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mGoogleApiClient != null && mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

    private void initComponents() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();
    }

    private void buildUiComponents(String location) {
        mBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        DaggerMainComponent.builder()
                .applicationComponent(((MainApplication) getApplication()).getComponent())
                .mainModule(new MainModule(this, location))
                .build()
                .inject(this);
        mBinding.setViewModel(mViewModel);
        mBinding.setView(this);
    }

    public ViewPager getViewPager() {
        return mBinding.pagerPlaceHolder;
    }

}
