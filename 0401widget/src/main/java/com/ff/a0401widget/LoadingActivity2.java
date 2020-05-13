package com.ff.a0401widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class LoadingActivity2 extends Activity implements View.OnClickListener{

    TextView buttonNewUser;

    TextView buttonLogin;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading2);
        getWidget();
    }

    private void getWidget() {
        getButton();
    }

    private void getButton() {
        getButtonNewUser();
        getButtonLogin();
    }

    private void getButtonLogin() {
        buttonLogin=this.findViewById(R.id.loading_activity2_button_login);
        //设置监听
        buttonLogin.setOnClickListener(this);
    }

    private void getButtonNewUser() {
        //获得新用户按钮
        buttonNewUser = this.findViewById(R.id.loading_activity2_button_new_user);
        buttonNewUser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.loading_activity2_button_new_user:
                actionNewUser();
                break;
            case R.id.loading_activity2_button_login:
                actionLogin();
                break;
        }

    }

    private void actionLogin() {
        Intent intent = new Intent(LoadingActivity2.this,LoginActivity.class);
        startActivity(intent);
    }

    private void actionNewUser() {
        Intent intent = new Intent(LoadingActivity2.this,RegisterActivity.class);
        startActivity(intent);
        
    }
}
