package com.example.intelligentpotbeta3;

import android.view.View;

public class MainHuapengOnClickListener implements View.OnClickListener {
    View view;

    MainHuapengOnClickListener(View view){
        this.view = view;
    }

    public void onClick(View view){
        view.setActivated(true);
    }

    private void notifyManager(){

    }
}
