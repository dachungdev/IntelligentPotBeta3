package com.example.intelligentpotbeta3.baike;

public class BaikeFlower {
    private int flowerPic;
    private String flowerName;
    private String flowerDis;

    public BaikeFlower(int flowerPic,String flowerDis,String flowerName){
        this.flowerPic = flowerPic;
        this.flowerName = flowerName;
        this.flowerDis = flowerDis;
    }

    public int getFlowerPic(){
        return flowerPic;
    }

    public String getFlowerName(){
        return flowerName;
    }

    public String getFlowerDis(){
        return flowerDis;
    }
}
