package com.fs_sournary.weather.screen.main.fragment.current;

import android.databinding.DataBindingUtil;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fs_sournary.weather.MainApplication;
import com.fs_sournary.weather.R;
import com.fs_sournary.weather.databinding.FragmentMainCurrentBinding;
import com.fs_sournary.weather.screen.BaseFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

import javax.inject.Inject;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class CurrentWeatherFragment extends BaseFragment implements
        GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    @Inject
    CurrentViewModel mCurrentViewModel;

    @Inject
    GoogleApiClient mGoogleApiClient;

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
                .currentModule(new CurrentModule(this))
                .build()
                .inject(this);
        FragmentMainCurrentBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_main_current, container, false);
        binding.setViewModel(mCurrentViewModel);
        return binding.getRoot();
    }

    @Override
    public void onConnected(Bundle bundle) {
        Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        String latitude = "";
        String longitude = "";
        if (lastLocation != null) {
            latitude = String.valueOf(lastLocation.getLatitude());
            longitude = String.valueOf(lastLocation.getLongitude());
        }
        String location = latitude + "," + longitude;
        mCurrentViewModel.showCurrentWeather(location);
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onStart() {
        super.onStart();
        mGoogleApiClient.connect();
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mGoogleApiClient.isConnected()) {
            mGoogleApiClient.disconnect();
        }
    }

}
