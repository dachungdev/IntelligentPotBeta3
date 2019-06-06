package com.example.intelligentpotbeta3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * DACHUNG
 * APP主界面
 */
public class MainActivity extends AppCompatActivity {
    private LinearLayout mainBottomItem;
    private LinearLayout huapengLin;
    private LinearLayout baikeLin;
    private LinearLayout darenLin;
    private LinearLayout zhongxinLin;
    private ArrayList<View> views = new ArrayList<>();
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainBottomItem = (LinearLayout) findViewById(R.id.main_bottom_layout);
        huapengLin = (LinearLayout)mainBottomItem.findViewById(R.id.huapeng_lin);
        baikeLin = (LinearLayout)mainBottomItem.findViewById(R.id.baike_lin);
        darenLin = (LinearLayout)mainBottomItem.findViewById(R.id.daren_lin);
        zhongxinLin = (LinearLayout)mainBottomItem.findViewById(R.id.zhongxin_lin);
        initData();
    }

    /**
     * “初始化”界面
     * 实例化btn管理类
     * 并设置初始载入我的盆栽选项
     */
    private void initData(){
        views.add(huapengLin);
        views.add(baikeLin);
        views.add(darenLin);
        views.add(zhongxinLin);
        fragments.add(new HuapengFragment());
        fragments.add(new BaikeFragment());
        fragments.add(new DarenFragment());
        fragments.add(new ZhongxinFragment());
        huapengLin.setActivated(true);
        FragmentManager fragmentManager = getSupportFragmentManager();
        new MainBotBtnManager(fragmentManager,views,fragments,R.id.main_body_fragment);
    }

//    /**
//     * 碎片Fragment切换器
//     */
//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.main_body_fragment,fragment);
//        transaction.commit();
//    }
}
