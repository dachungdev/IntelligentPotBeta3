package com.example.intelligentpotbeta3;

/**
 * DACHUNG
 * 自定义Application
 * 便于全局获取context
 */

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context = getApplicationContext();
    }

    /**
     * @return 单例context
     */
    public static Context getContext(){
        return context;
    }
}
