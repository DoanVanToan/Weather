package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class DailyWeather extends BaseDataWeather{

    @SerializedName("sunriseTime")
    @Expose
    private int mSunriseTime;
    @SerializedName("sunsetTime")
    @Expose
    private int mSunsetTime;
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
    private int mPrecipIntensityMaxTime;
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
    private int mTemperatureHighTime;
    @SerializedName("temperatureLow")
    @Expose
    private double mTemperatureLow;
    @SerializedName("temperatureLowTime")
    @Expose
    private int mTemperatureLowTime;
    @SerializedName("apparentTemperatureHigh")
    @Expose
    private double mApparentTemperatureHigh;
    @SerializedName("apparentTemperatureHighTime")
    @Expose
    private int mApparentTemperatureHighTime;
    @SerializedName("apparentTemperatureLow")
    @Expose
    private double mApparentTemperatureLow;
    @SerializedName("apparentTemperatureLowTime")
    @Expose
    private int mApparentTemperatureLowTime;
    @SerializedName("windGustTime")
    @Expose
    private int mWindGustTime;
    @SerializedName("uvIndexTime")
    @Expose
    private int mUvIndexTime;
    @SerializedName("temperatureMin")
    @Expose
    private double mTemperatureMin;
    @SerializedName("temperatureMinTime")
    @Expose
    private int mTemperatureMinTime;
    @SerializedName("temperatureMax")
    @Expose
    private double mTemperatureMax;
    @SerializedName("temperatureMaxTime")
    @Expose
    private int mTemperatureMaxTime;
    @SerializedName("apparentTemperatureMin")
    @Expose
    private double mApparentTemperatureMin;
    @SerializedName("apparentTemperatureMinTime")
    @Expose
    private int mApparentTemperatureMinTime;
    @SerializedName("apparentTemperatureMax")
    @Expose
    private double mApparentTemperatureMax;
    @SerializedName("apparentTemperatureMaxTime")
    @Expose
    private int mApparentTemperatureMaxTime;
    @SerializedName("precipAccumulation")
    @Expose
    private double mPrecipAccumulation;

    public int getSunriseTime() {
        return mSunriseTime;
    }

    public void setSunriseTime(int sunriseTime) {
        mSunriseTime = sunriseTime;
    }

    public int getSunsetTime() {
        return mSunsetTime;
    }

    public void setSunsetTime(int sunsetTime) {
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

    public int getPrecipIntensityMaxTime() {
        return mPrecipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(int precipIntensityMaxTime) {
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

    public int getTemperatureHighTime() {
        return mTemperatureHighTime;
    }

    public void setTemperatureHighTime(int temperatureHighTime) {
        mTemperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return mTemperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        mTemperatureLow = temperatureLow;
    }

    public int getTemperatureLowTime() {
        return mTemperatureLowTime;
    }

    public void setTemperatureLowTime(int temperatureLowTime) {
        mTemperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return mApparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        mApparentTemperatureHigh = apparentTemperatureHigh;
    }

    public int getApparentTemperatureHighTime() {
        return mApparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(int apparentTemperatureHighTime) {
        mApparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return mApparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        mApparentTemperatureLow = apparentTemperatureLow;
    }

    public int getApparentTemperatureLowTime() {
        return mApparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(int apparentTemperatureLowTime) {
        mApparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public int getWindGustTime() {
        return mWindGustTime;
    }

    public void setWindGustTime(int windGustTime) {
        mWindGustTime = windGustTime;
    }

    public int getUvIndexTime() {
        return mUvIndexTime;
    }

    public void setUvIndexTime(int uvIndexTime) {
        mUvIndexTime = uvIndexTime;
    }

    public double getTemperatureMin() {
        return mTemperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        mTemperatureMin = temperatureMin;
    }

    public int getTemperatureMinTime() {
        return mTemperatureMinTime;
    }

    public void setTemperatureMinTime(int temperatureMinTime) {
        mTemperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return mTemperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        mTemperatureMax = temperatureMax;
    }

    public int getTemperatureMaxTime() {
        return mTemperatureMaxTime;
    }

    public void setTemperatureMaxTime(int temperatureMaxTime) {
        mTemperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return mApparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        mApparentTemperatureMin = apparentTemperatureMin;
    }

    public int getApparentTemperatureMinTime() {
        return mApparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(int apparentTemperatureMinTime) {
        mApparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return mApparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        mApparentTemperatureMax = apparentTemperatureMax;
    }

    public int getApparentTemperatureMaxTime() {
        return mApparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(int apparentTemperatureMaxTime) {
        mApparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public double getPrecipAccumulation() {
        return mPrecipAccumulation;
    }

    public void setPrecipAccumulation(double precipAccumulation) {
        mPrecipAccumulation = precipAccumulation;
    }

}
