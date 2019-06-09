package com.example.intelligentpotbeta3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.intelligentpotbeta3.baike.BaikeFragment;
import com.example.intelligentpotbeta3.daren.DarenFragment;
import com.example.intelligentpotbeta3.huapeng.HuapengFragment;
import com.example.intelligentpotbeta3.zhongxin.ZhongxinFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * DACHUNG
 * APP主界面
 */
public class MainActivity extends AppCompatActivity {
    private List<Fragment> fragments = new ArrayList<>(4);
    private ViewPager mainViewPager;
    private RadioGroup mainRadioGroup;
    private ViewPageManager mViewPageManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewPager = (ViewPager) findViewById(R.id.main_viewpager);
        mainRadioGroup = (RadioGroup) findViewById(R.id.main_radioGroup);
        initData();
    }

    /**
     * “初始化”界面
     * 实例化btn管理类
     * 并设置初始载入我的盆栽选项
     */
    private void initData(){
        fragments.add(new HuapengFragment());
        fragments.add(new BaikeFragment());
        fragments.add(new DarenFragment());
        fragments.add(new ZhongxinFragment());
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPageManager = new ViewPageManager(mainViewPager,mainRadioGroup,fragments,fragmentManager);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        mViewPageManager.WhenLeave();
    }
}
