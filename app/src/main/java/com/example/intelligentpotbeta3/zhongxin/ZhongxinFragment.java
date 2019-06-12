package com.example.intelligentpotbeta3.zhongxin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.intelligentpotbeta3.R;

public class ZhongxinFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_zhongxin,container,false);
        return view;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("dachung","zhongxinDestroy");
    }
}
