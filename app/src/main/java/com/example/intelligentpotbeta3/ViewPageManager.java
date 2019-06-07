package com.example.intelligentpotbeta3;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.List;

public class ViewPageManager {
    private ViewPager mViewPager;
    private RadioGroup mTabRadioGroup;

    private List<Fragment> mFragments;
    private FragmentManager mFragmentManager;
    private FragmentPagerAdapter mAdapter;

    ViewPageManager(ViewPager mViewPager,RadioGroup mTabRadioGroup,List<Fragment> mFragments,FragmentManager mFragmentManager){
        this.mViewPager = mViewPager;
        this.mTabRadioGroup = mTabRadioGroup;
        this.mFragments = mFragments;
        this.mFragmentManager = mFragmentManager;
        initView();
    }

    private void initView(){
        RadioButton radioButton = (RadioButton) mTabRadioGroup.getChildAt(0);
        radioButton.setChecked(true);
        mAdapter = new MyFragmentPagerAdapter(mFragmentManager,mFragments);
        mViewPager.setAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(mPageChangeListener);
        mTabRadioGroup.setOnCheckedChangeListener(mOnCheckedChangeListener);
    }

    private ViewPager.OnPageChangeListener mPageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            RadioButton radioButton = (RadioButton) mTabRadioGroup.getChildAt(i);
            radioButton.setChecked(true);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    private RadioGroup.OnCheckedChangeListener mOnCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            for (int i = 0 ; i < group.getChildCount() ; i ++){
                if (group.getChildAt(i).getId() == checkedId){
                    mViewPager.setCurrentItem(i);
                    return;
                }
            }
        }
    };

    private class MyFragmentPagerAdapter extends FragmentPagerAdapter{
        private List<Fragment> mList;

        public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> mList){
            super(fm);
            this.mList = mList;
        }

        @Override
        public Fragment getItem(int position){
            return this.mList == null ? null : this.mList.get(position);
        }

        @Override
        public int getCount(){
            return this.mList == null ? 0 : this.mList.size();
        }
    }

    public void WhenLeave(){
        mViewPager.removeOnPageChangeListener(mPageChangeListener);
    }
}
