package com.example.intelligentpotbeta3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * DACHUNG
 * 登录界面
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button launchRegiterBtn;
    private Button launchLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        launchRegiterBtn = (Button) findViewById(R.id.launch_register_btn);
        launchLoginBtn = (Button) findViewById(R.id.launch_login_btn);
        launchRegiterBtn.setOnClickListener(this);
        launchLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.launch_register_btn:
                Laucher.LaunchActivity(MyApplication.getContext(),MainActivity.class);
                break;
            case R.id.launch_login_btn:
                Laucher.LaunchActivity(MyApplication.getContext(),MainActivity.class);
            default:
                break;
        }
    }
}
