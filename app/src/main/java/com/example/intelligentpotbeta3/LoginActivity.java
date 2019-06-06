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
    private Button loginRegiterBtn;
    private Button loginLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginRegiterBtn = (Button) findViewById(R.id.login_register_btn);
        loginLoginBtn = (Button) findViewById(R.id.login_login_btn);
        loginRegiterBtn.setOnClickListener(this);
        loginLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.login_register_btn:
                Laucher.launchActivity(MyApplication.getContext(),MainActivity.class);
                break;
            case R.id.login_login_btn:
                Laucher.launchActivity(MyApplication.getContext(),MainActivity.class);
            default:
                break;
        }
    }

    @Override
    public void onStop(){
        super.onStop();
        finish();
    }
}
