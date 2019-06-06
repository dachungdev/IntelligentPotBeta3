package com.example.intelligentpotbeta3;
    /**
     * DACHUNG 19-5-31
     * 载入界面
     */
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView launchBg;
    private Button launchBtn;
    private TextView launchTv;
    private Boolean launchFlag = true;
    private ValueAnimator valueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        launchBg = (ImageView) findViewById(R.id.launch_bg);
        launchBtn = (Button) findViewById(R.id.launch_btn);
        launchTv = (TextView) findViewById(R.id.launch_tv);

        launchBg.setOnClickListener(this);
        launchBtn.setOnClickListener(this);

        /**
         * 设置动画区间
         */
        valueAnimator = ValueAnimator.ofInt(1,4);
        LaunchBtnTextAni launchBtnTextAni = new LaunchBtnTextAni(launchTv);
        valueAnimator.addUpdateListener(launchBtnTextAni);
        valueAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            /**
             * 动画结束时直接跳转
             */
            @Override
            public void onAnimationEnd(Animator animation) {
                launchActivityWithFlag();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        valueAnimator.setDuration(3000);
        valueAnimator.setEvaluator(launchBtnTextAni);
        valueAnimator.start();
    }

    /**
     * 点击事件
     */
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.launch_bg:
                launchActivityWithFlag();
                break;
            case R.id.launch_btn:
                launchActivityWithFlag();
                break;
        }
    }

    /**
     * 跳转进入登录界面
     * 禁止重复点击
     */
    private void launchActivityWithFlag(){
        if (launchFlag) {
            launchFlag = false;
            Laucher.launchActivity(MyApplication.getContext(),LoginActivity.class);
        }
    }

    /**
     * 自动出栈
     * 移除动画监听器
     */
    @Override
    public void onStop(){
        super.onStop();
        valueAnimator.removeAllUpdateListeners();
        finish();
    }
}
