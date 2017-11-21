package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class CurrentWeather extends BaseDataWeather {

    @SerializedName("nearestStormDistance")
    @Expose
    private int mNearestStormDistance;
    @SerializedName("nearestStormBearing")
    @Expose
    private int mNearestStormBearing;
    @SerializedName("precipIntensity")
    @Expose
    private int mPrecipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private int mPrecipProbability;
    @SerializedName("temperature")
    @Expose
    private double mTemperature;
    @SerializedName("apparentTemperature")
    @Expose
    private double mApparentTemperature;

    public int getNearestStormDistance() {
        return mNearestStormDistance;
    }

    public void setNearestStormDistance(int nearestStormDistance) {
        mNearestStormDistance = nearestStormDistance;
    }

    public int getNearestStormBearing() {
        return mNearestStormBearing;
    }

    public void setNearestStormBearing(int nearestStormBearing) {
        mNearestStormBearing = nearestStormBearing;
    }

    public int getPrecipIntensity() {
        return mPrecipIntensity;
    }

    public void setPrecipIntensity(int precipIntensity) {
        mPrecipIntensity = precipIntensity;
    }

    public int getPrecipProbability() {
        return mPrecipProbability;
    }

    public void setPrecipProbability(int precipProbability) {
        mPrecipProbability = precipProbability;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getApparentTemperature() {
        return mApparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        mApparentTemperature = apparentTemperature;
    }

}
