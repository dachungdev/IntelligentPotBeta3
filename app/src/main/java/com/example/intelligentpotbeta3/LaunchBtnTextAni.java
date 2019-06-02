package com.example.intelligentpotbeta3;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.TextView;

/**
 * 添加监听器
 * 动态改变数值以及倒序
 */

public class LaunchBtnTextAni implements ValueAnimator.AnimatorUpdateListener,TypeEvaluator<Integer>{

    private TextView textView;
    private Context context;

    LaunchBtnTextAni(TextView textView){
        this.textView = textView;
    }

    public void onAnimationUpdate(ValueAnimator animator){
        int curValue = (Integer)animator.getAnimatedValue();
        textView.setText(String.valueOf(curValue));
    }

    @Override
    public Integer evaluate(float fraction,Integer startValue,Integer endValue){
        int startInt = startValue;
        return (int) (endValue - fraction * (endValue - startInt));
    }
}
