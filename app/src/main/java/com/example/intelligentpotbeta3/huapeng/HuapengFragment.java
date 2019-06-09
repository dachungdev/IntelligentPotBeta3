package com.example.intelligentpotbeta3.huapeng;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intelligentpotbeta3.R;

public class HuapengFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_huapeng,container,false);
        return view;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("dachung","huapengDestroy");
    }
}
