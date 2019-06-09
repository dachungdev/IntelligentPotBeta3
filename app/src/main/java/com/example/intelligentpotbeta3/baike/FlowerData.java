package com.example.intelligentpotbeta3.baike;

import com.example.intelligentpotbeta3.MyApplication;
import com.example.intelligentpotbeta3.R;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class FlowerData {
    private static FlowerData mFlowerData;
    private List<BaikeFlower> mList;
    private FlowerData(){}
    private String lvluoDis = MyApplication.getContext().getString(R.string.frag_baike_lvluodis);
    private String guasuDis = MyApplication.getContext().getString(R.string.frag_baike_guasudis);
    private String junzilanDis = MyApplication.getContext().getString(R.string.frag_baike_junzilandis);
    private String huazhuDis = MyApplication.getContext().getString(R.string.frag_baike_huazhudis);
    private String lvluoName = MyApplication.getContext().getString(R.string.frag_baike_lvluoname);
    private String guasuName = MyApplication.getContext().getString(R.string.frag_baike_guasuname);
    private String junzilanName = MyApplication.getContext().getString(R.string.frag_baike_junzilanname);
    private String huazhuName = MyApplication.getContext().getString(R.string.frag_baike_huazhuname);

    public static FlowerData getInstance(){
        if (mFlowerData==null){
            synchronized (FlowerData.class){
                if (mFlowerData==null){
                    mFlowerData = new FlowerData();
                }
            }
        }
        return mFlowerData;
    }

    private void initData(){
        mList = new ArrayList<>();
        mList.add(new BaikeFlower(R.drawable.baikelvluo,lvluoDis,lvluoName));
        mList.add(new BaikeFlower(R.drawable.baikeguali,guasuDis,guasuName));
        mList.add(new BaikeFlower(R.drawable.baikejunzilan,junzilanDis,junzilanName));
        mList.add(new BaikeFlower(R.drawable.baikehuazhu,huazhuDis,huazhuName));
    }

    public List<BaikeFlower> getList(){
        initData();
        return mList;
    }
}
