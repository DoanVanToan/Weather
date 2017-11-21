package com.fs_sournary.weather.utils;

import android.support.annotation.StringDef;

import static com.fs_sournary.weather.utils.ImageWeather.CLEAR_DAY;
import static com.fs_sournary.weather.utils.ImageWeather.CLEAR_NIGHT;
import static com.fs_sournary.weather.utils.ImageWeather.CLOUDY;
import static com.fs_sournary.weather.utils.ImageWeather.FOG;
import static com.fs_sournary.weather.utils.ImageWeather.PARTLY_CLOUDY_DAY;
import static com.fs_sournary.weather.utils.ImageWeather.PARTLY_CLOUDY_NIGHT;
import static com.fs_sournary.weather.utils.ImageWeather.RAIN;
import static com.fs_sournary.weather.utils.ImageWeather.SLEET;
import static com.fs_sournary.weather.utils.ImageWeather.SNOW;
import static com.fs_sournary.weather.utils.ImageWeather.WIND;

/**
 * Created by fs-sournary.
 * Date on 11/18/17.
 * Description:
 */

@StringDef({CLEAR_DAY, CLEAR_NIGHT, RAIN, SNOW, SLEET, WIND, FOG, CLOUDY,
        PARTLY_CLOUDY_DAY, PARTLY_CLOUDY_NIGHT})
public @interface ImageWeather {
    String CLEAR_DAY = "clear-day";
    String CLEAR_NIGHT = "clear-night";
    String RAIN = "rain";
    String CLOUDY = "cloudy";
    String PARTLY_CLOUDY_DAY = "partly-cloudy-day";
    String PARTLY_CLOUDY_NIGHT = "partly-cloudy-night";
    String SNOW = "ic_snow";
    String SLEET = "sleet";
    String FOG = "ic_fog";
    String WIND = "ic_wind";
}
