package com.guy.class24a_atoz_1;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MobileAds.initialize(this);

    }
}
