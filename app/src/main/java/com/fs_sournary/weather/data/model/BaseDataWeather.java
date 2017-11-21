package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by fs-sournary.
 * Date on 11/20/17.
 * Description:
 */

public class BaseDataWeather {

    @SerializedName("time")
    @Expose
    private int mTime;
    @SerializedName("summary")
    @Expose
    private String mSummary;
    @SerializedName("icon")
    @Expose
    private String mIcon;
    @SerializedName("dewPoint")
    @Expose
    private double mDewPoint;
    @SerializedName("humidity")
    @Expose
    private double mHumidity;
    @SerializedName("pressure")
    @Expose
    private double mPressure;
    @SerializedName("windSpeed")
    @Expose
    private double mWindSpeed;
    @SerializedName("windGust")
    @Expose
    private double mWindGust;
    @SerializedName("windBearing")
    @Expose
    private int mWindBearing;
    @SerializedName("cloudCover")
    @Expose
    private double mCloudCover;
    @SerializedName("uvIndex")
    @Expose
    private int mUvIndex;
    @SerializedName("visibility")
    @Expose
    private int mVisibility;
    @SerializedName("ozone")
    @Expose
    private double mOzone;

    public int getTime() {
        return mTime;
    }

    public void setTime(int time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public double getDewPoint() {
        return mDewPoint;
    }

    public void setDewPoint(double dewPoint) {
        mDewPoint = dewPoint;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPressure() {
        return mPressure;
    }

    public void setPressure(double pressure) {
        mPressure = pressure;
    }

    public double getWindSpeed() {
        return mWindSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        mWindSpeed = windSpeed;
    }

    public double getWindGust() {
        return mWindGust;
    }

    public void setWindGust(double windGust) {
        mWindGust = windGust;
    }

    public int getWindBearing() {
        return mWindBearing;
    }

    public void setWindBearing(int windBearing) {
        mWindBearing = windBearing;
    }

    public double getCloudCover() {
        return mCloudCover;
    }

    public void setCloudCover(double cloudCover) {
        mCloudCover = cloudCover;
    }

    public int getUvIndex() {
        return mUvIndex;
    }

    public void setUvIndex(int uvIndex) {
        mUvIndex = uvIndex;
    }

    public int getVisibility() {
        return mVisibility;
    }

    public void setVisibility(int visibility) {
        mVisibility = visibility;
    }

    public double getOzone() {
        return mOzone;
    }

    public void setOzone(double ozone) {
        mOzone = ozone;
    }

}
