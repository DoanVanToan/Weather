package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class GenerateWeather {

    @SerializedName("latitude")
    @Expose
    private double mLatitude;
    @SerializedName("longitude")
    @Expose
    private double mLongitude;
    @SerializedName("timezone")
    @Expose
    private String mTimezone;
    @SerializedName("currently")
    @Expose
    private CurrentWeather mCurrentWeather;
    @SerializedName("daily")
    @Expose
    private DailyResponse mDailyResponse;

    public double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public CurrentWeather getCurrentWeather() {
        return mCurrentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        mCurrentWeather = currentWeather;
    }

    public DailyResponse getDailyResponse() {
        return mDailyResponse;
    }

    public void setDailyResponse(DailyResponse dailyResponse) {
        mDailyResponse = dailyResponse;
    }

}
