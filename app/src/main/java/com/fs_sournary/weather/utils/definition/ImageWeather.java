package com.fs_sournary.weather.utils.definition;

import android.support.annotation.StringDef;

import static com.fs_sournary.weather.utils.definition.ImageWeather.CLEAR_DAY;
import static com.fs_sournary.weather.utils.definition.ImageWeather.CLEAR_NIGHT;
import static com.fs_sournary.weather.utils.definition.ImageWeather.CLOUDY;
import static com.fs_sournary.weather.utils.definition.ImageWeather.FOG;
import static com.fs_sournary.weather.utils.definition.ImageWeather.PARTLY_CLOUDY_DAY;
import static com.fs_sournary.weather.utils.definition.ImageWeather.PARTLY_CLOUDY_NIGHT;
import static com.fs_sournary.weather.utils.definition.ImageWeather.RAIN;
import static com.fs_sournary.weather.utils.definition.ImageWeather.SLEET;
import static com.fs_sournary.weather.utils.definition.ImageWeather.SNOW;
import static com.fs_sournary.weather.utils.definition.ImageWeather.WIND;

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
    String SNOW = "snow";
    String SLEET = "sleet";
    String FOG = "fog";
    String WIND = "wind";
}
