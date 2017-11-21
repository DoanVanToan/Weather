package com.fs_sournary.weather.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class DailyResponse {

    @SerializedName("summary")
    @Expose
    private String mSummary;
    @SerializedName("icon")
    @Expose
    private String mIcon;
    @SerializedName("data")
    @Expose
    private List<DailyWeather> mDataDailies;

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

    public List<DailyWeather> getDataDailies() {
        return mDataDailies;
    }

    public void setDataDailies(List<DailyWeather> dataDailies) {
        mDataDailies = dataDailies;
    }

}
