package com.fs_sournary.weather.widget.dialog.progress;

import android.app.ProgressDialog;
import android.content.Context;

import com.fs_sournary.weather.R;
import com.fs_sournary.weather.widget.dialog.DialogManager;

/**
 * Created by fs-sournary.
 * Date on 11/19/17.
 * Description:
 */

public class ProgressDialogImpl implements DialogManager {

    private Context mContext;
    private ProgressDialog mProgressDialog;

    public ProgressDialogImpl(Context context) {
        mContext = context;
    }

    @Override
    public void showDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(mContext);
            mProgressDialog.setMessage(mContext.getString(R.string.title_please_wait));
            mProgressDialog.setCanceledOnTouchOutside(false);
        }
        mProgressDialog.show();
    }

    @Override
    public void dismissDialog() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }
}
