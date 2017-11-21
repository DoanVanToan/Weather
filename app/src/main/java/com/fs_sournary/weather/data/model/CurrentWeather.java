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
    private double mNearestStormDistance;
    @SerializedName("nearestStormBearing")
    @Expose
    private double mNearestStormBearing;
    @SerializedName("precipIntensity")
    @Expose
    private double mPrecipIntensity;
    @SerializedName("precipProbability")
    @Expose
    private double mPrecipProbability;
    @SerializedName("temperature")
    @Expose
    private double mTemperature;
    @SerializedName("apparentTemperature")
    @Expose
    private double mApparentTemperature;

    public double getNearestStormDistance() {
        return mNearestStormDistance;
    }

    public void setNearestStormDistance(double nearestStormDistance) {
        mNearestStormDistance = nearestStormDistance;
    }

    public double getNearestStormBearing() {
        return mNearestStormBearing;
    }

    public void setNearestStormBearing(double nearestStormBearing) {
        mNearestStormBearing = nearestStormBearing;
    }

    public double getPrecipIntensity() {
        return mPrecipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        mPrecipIntensity = precipIntensity;
    }

    public double getPrecipProbability() {
        return mPrecipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
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
