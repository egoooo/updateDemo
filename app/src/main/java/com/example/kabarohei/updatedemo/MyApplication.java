package com.example.kabarohei.updatedemo;

import android.app.Application;

/**
 * Created by kabarohei on 17/4/8.
 */

public class MyApplication extends Application {
    private  static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static  MyApplication getInstance(){
        return  instance;
    }
}
