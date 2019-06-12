package com.example.intelligentpotbeta3.daren;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.intelligentpotbeta3.R;
import com.example.intelligentpotbeta3.Tool.ViewPageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * DACHUNG
 * “达人”界面
 * 在碎片中嵌套碎片
 */

public class DarenFragment extends Fragment {
    private static List<Fragment> fragments = new ArrayList<>(2);
    private static ViewPager viewPager;
    private static RadioGroup radioGroup;
    private static ViewPageManager viewPageManager;
    private static FragmentManager fragmentManager;

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Log.d("dachung","DarenAttach");
    }

    /**
     * 确保不会多次执行fragment.add
     * 避免集合自增造成空指针
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("dachung","DarenCreate");
        fragments.add(new DongtaiFragment());
        fragments.add(new JingxuanFragment());
        fragmentManager = getChildFragmentManager();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_daren,container,false);
        Log.d("dachung","darenCreatedView");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d("dachung","darenActivityCreated");
        viewPager = (ViewPager) getActivity().findViewById(R.id.daren_vp);
        radioGroup = (RadioGroup) getActivity().findViewById(R.id.daren_top_rg);
        Log.d("dachung","darenFragment:"+fragments.size());
        initData();
    }

    private void initData(){
        viewPageManager = new ViewPageManager(viewPager,radioGroup,fragments,fragmentManager);
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d("dachung","darenDestroyView");
        viewPageManager.WhenLeave();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("dachung","darenDestroy");
    }
}
