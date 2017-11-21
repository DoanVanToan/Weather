package com.fs_sournary.weather.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by fs-sournary.
 * Date on 11/18/17.
 * Description:
 */

public class ConvertTimeUtils {

    private SimpleDateFormat mSimpleDateFormat;

    public ConvertTimeUtils() {
        mSimpleDateFormat = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss",
                Locale.getDefault());
    }

    public String getDateString(int time) {
        return mSimpleDateFormat.format(new Date(time * 1000L));
    }

}
