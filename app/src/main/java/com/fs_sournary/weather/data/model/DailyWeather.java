package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class DailyWeather extends BaseDataWeather {

    @SerializedName("sunriseTime")
    @Expose
    private double mSunriseTime;
    @SerializedName("sunsetTime")
    @Expose
    private double mSunsetTime;
    @SerializedName("moonPhase")
    @Expose
    private double mMoonPhase;
    @SerializedName("precipIntensity")
    @Expose
    private double mPrecipIntensity;
    @SerializedName("precipIntensityMax")
    @Expose
    private double mPrecipIntensityMax;
    @SerializedName("precipIntensityMaxTime")
    @Expose
    private double mPrecipIntensityMaxTime;
    @SerializedName("precipProbability")
    @Expose
    private double mPrecipProbability;
    @SerializedName("precipType")
    @Expose
    private String mPrecipType;
    @SerializedName("temperatureHigh")
    @Expose
    private double mTemperatureHigh;
    @SerializedName("temperatureHighTime")
    @Expose
    private double mTemperatureHighTime;
    @SerializedName("temperatureLow")
    @Expose
    private double mTemperatureLow;
    @SerializedName("temperatureLowTime")
    @Expose
    private double mTemperatureLowTime;
    @SerializedName("apparentTemperatureHigh")
    @Expose
    private double mApparentTemperatureHigh;
    @SerializedName("apparentTemperatureHighTime")
    @Expose
    private double mApparentTemperatureHighTime;
    @SerializedName("apparentTemperatureLow")
    @Expose
    private double mApparentTemperatureLow;
    @SerializedName("apparentTemperatureLowTime")
    @Expose
    private double mApparentTemperatureLowTime;
    @SerializedName("windGustTime")
    @Expose
    private double mWindGustTime;
    @SerializedName("uvIndexTime")
    @Expose
    private double mUvIndexTime;
    @SerializedName("temperatureMin")
    @Expose
    private double mTemperatureMin;
    @SerializedName("temperatureMinTime")
    @Expose
    private double mTemperatureMinTime;
    @SerializedName("temperatureMax")
    @Expose
    private double mTemperatureMax;
    @SerializedName("temperatureMaxTime")
    @Expose
    private double mTemperatureMaxTime;
    @SerializedName("apparentTemperatureMin")
    @Expose
    private double mApparentTemperatureMin;
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private double mApparentTemperatureMinTime;
    @SerializedName("apparentTemperatureMax")
    @Expose
    private double mApparentTemperatureMax;
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private double mApparentTemperatureMaxTime;
    @SerializedName("precipAccumulation")
    @Expose
    private double mPrecipAccumulation;

    public double getSunriseTime() {
        return mSunriseTime;
    }

    public void setSunriseTime(double sunriseTime) {
        mSunriseTime = sunriseTime;
    }

    public double getSunsetTime() {
        return mSunsetTime;
    }

    public void setSunsetTime(double sunsetTime) {
        mSunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return mMoonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        mMoonPhase = moonPhase;
    }

    public double getPrecipIntensity() {
        return mPrecipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        mPrecipIntensity = precipIntensity;
    }

    public double getPrecipIntensityMax() {
        return mPrecipIntensityMax;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        mPrecipIntensityMax = precipIntensityMax;
    }

    public double getPrecipIntensityMaxTime() {
        return mPrecipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(double precipIntensityMaxTime) {
        mPrecipIntensityMaxTime = precipIntensityMaxTime;
    }

    public double getPrecipProbability() {
        return mPrecipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        mPrecipProbability = precipProbability;
    }

    public String getPrecipType() {
        return mPrecipType;
    }

    public void setPrecipType(String precipType) {
        mPrecipType = precipType;
    }

    public double getTemperatureHigh() {
        return mTemperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        mTemperatureHigh = temperatureHigh;
    }

    public double getTemperatureHighTime() {
        return mTemperatureHighTime;
    }

    public void setTemperatureHighTime(double temperatureHighTime) {
        mTemperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return mTemperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        mTemperatureLow = temperatureLow;
    }

    public double getTemperatureLowTime() {
        return mTemperatureLowTime;
    }

    public void setTemperatureLowTime(double temperatureLowTime) {
        mTemperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return mApparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        mApparentTemperatureHigh = apparentTemperatureHigh;
    }

    public double getApparentTemperatureHighTime() {
        return mApparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(double apparentTemperatureHighTime) {
        mApparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return mApparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        mApparentTemperatureLow = apparentTemperatureLow;
    }

    public double getApparentTemperatureLowTime() {
        return mApparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(double apparentTemperatureLowTime) {
        mApparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public double getWindGustTime() {
        return mWindGustTime;
    }

    public void setWindGustTime(double windGustTime) {
        mWindGustTime = windGustTime;
    }

    public double getUvIndexTime() {
        return mUvIndexTime;
    }

    public void setUvIndexTime(double uvIndexTime) {
        mUvIndexTime = uvIndexTime;
    }

    public double getTemperatureMin() {
        return mTemperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        mTemperatureMin = temperatureMin;
    }

    public double getTemperatureMinTime() {
        return mTemperatureMinTime;
    }

    public void setTemperatureMinTime(double temperatureMinTime) {
        mTemperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public double getTemperatureMaxTime() {
        return mTemperatureMaxTime;
    }

    public void setTemperatureMaxTime(double temperatureMaxTime) {
        mTemperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return mApparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        mApparentTemperatureMin = apparentTemperatureMin;
    }

    public double getApparentTemperatureMinTime() {
        return mApparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(double apparentTemperatureMinTime) {
        mApparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return mApparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        mApparentTemperatureMax = apparentTemperatureMax;
    }

    public double getApparentTemperatureMaxTime() {
        return mApparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(double apparentTemperatureMaxTime) {
        mApparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public double getPrecipAccumulation() {
        return mPrecipAccumulation;
    }

    public void setPrecipAccumulation(double precipAccumulation) {
        mPrecipAccumulation = precipAccumulation;
    }

}
