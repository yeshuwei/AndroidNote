package com.ysw.kedaxunfei;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Swy on 2017/3/30.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(App.this, SpeechConstant.APPID+"=58dce383");
    }
}
