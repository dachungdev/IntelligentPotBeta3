package com.example.intelligentpotbeta3.baike;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intelligentpotbeta3.R;

import java.util.List;

public class BaikeFlowerAdapter extends RecyclerView.Adapter<BaikeFlowerAdapter.ViewHolder> {
    private List<BaikeFlower> mFlowerList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView flowerImage;
        TextView flowerDiscription;

        public ViewHolder(View view){
            super(view);
            flowerImage = (ImageView) view.findViewById(R.id.baikeflower_image);
            flowerDiscription = (TextView) view.findViewById(R.id.baikeflower_tv);
        }
    }

    public BaikeFlowerAdapter(List<BaikeFlower> mFlowerList){
        this.mFlowerList = mFlowerList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.baikeflower_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        BaikeFlower baikeFlower = mFlowerList.get(position);
        holder.flowerImage.setImageResource(baikeFlower.getFlowerPic());
        holder.flowerDiscription.setText(baikeFlower.getFlowerDis());
    }

    @Override
    public int getItemCount(){
        return mFlowerList.size();
    }
}
