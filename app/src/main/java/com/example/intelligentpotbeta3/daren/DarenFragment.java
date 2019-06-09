package com.example.intelligentpotbeta3.daren;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intelligentpotbeta3.R;

public class DarenFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_daren,container,false);
        return view;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("dachung","darenDestroy");
    }
}
