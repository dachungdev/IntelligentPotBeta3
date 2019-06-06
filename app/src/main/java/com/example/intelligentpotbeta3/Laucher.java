package com.example.intelligentpotbeta3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/**
 * DACHUNG
 * Activity启动器
 */

public class Laucher {

    public static void launchActivity(Context context, Class<?> cls){
        Intent intent = new Intent(context,cls);
        context.startActivity(intent);
    }

}
