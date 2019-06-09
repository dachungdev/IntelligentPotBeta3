package com.example.intelligentpotbeta3.baike;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intelligentpotbeta3.R;

import java.util.ArrayList;
import java.util.List;

public class BaikeFragment extends Fragment {

    private List<BaikeFlower> flowerList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.frag_baike,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d("dachung","baikeActivityCreated");

        flowerList = FlowerData.getInstance().getList();
        RecyclerView recyclerView = (RecyclerView)getActivity().findViewById(R.id.baike_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        BaikeFlowerAdapter adapter = new BaikeFlowerAdapter(flowerList);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("dachung","baikefragDestroy");
    }
}
