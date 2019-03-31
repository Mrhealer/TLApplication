package com.kaity.dev.finalapplication.application;

import android.app.Application;
import android.content.Context;

public class TLApplication extends Application {

    private static Context sContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this.getApplicationContext();
    }


    public static Context getAppContext() {
        return sContext;
    }
}
