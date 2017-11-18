package com.fs_sournary.weather.screen.main;

import com.fs_sournary.weather.screen.BaseViewModel;
import com.fs_sournary.weather.utils.Constant;

/**
 * Created by fs-sournary.
 * Date on 11/17/17.
 * Description:
 */

public class MainViewModel implements BaseViewModel {

    private MainPagerAdapter mMainPagerAdapter;

    MainViewModel(MainPagerAdapter mainPagerAdapter) {
        mMainPagerAdapter = mainPagerAdapter;
    }

    @Override
    public void onDestroy() {

    }

    public MainPagerAdapter getMainPagerAdapter() {
        return mMainPagerAdapter;
    }

    public int getOffset() {
        return Constant.COUNT_OFFSET_FRAGMENT_RETAIN;
    }

}
