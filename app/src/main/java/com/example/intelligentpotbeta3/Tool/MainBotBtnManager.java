package com.example.intelligentpotbeta3.Tool;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * DACHUNG
 * 为实现解耦，自制MainAc底部btn的响应处理类
 */
public class MainBotBtnManager {
    private ArrayList<View> views;
    private ArrayList<Fragment> fragments;
    private ArrayList<String> titles;
    private int bodyFrame;
    FragmentManager manager;
    private int lastActived = 0;

    public MainBotBtnManager(FragmentManager manager,ArrayList<View> views,ArrayList<Fragment> fragments,int bodyFrame){
        this.views = views;
        this.fragments = fragments;
        this.bodyFrame = bodyFrame;
        this.manager = manager;
        replaceFragment(fragments.get(0));
        for (View a : views){
            setClick(a);
        }
    }

    /**
     * 注册点击事件，点击则设状态为actived
     * 取消view的actived的状态
     * 并设当前下标为下次点击的前一次点击下标
     * @param view
     */
    private void setClick(final View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = views.indexOf(view);
                if (lastActived != index){
                    setNoActived();
                    replaceFragment(fragments.get(index));
                    view.setActivated(true);
                    lastActived = index;
                }
            }
        });
    }

    /**
     * 取消前一个view的actived状态
     */
    private void setNoActived(){
        views.get(lastActived).setActivated(false);
    }

    /**
     * 碎片Fragment切换器
     */
    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(bodyFrame,fragment);
        transaction.commit();
        Log.d("DACHUNG",transaction.toString());
    }
}
