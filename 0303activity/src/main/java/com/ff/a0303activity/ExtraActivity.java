package com.ff.a0303activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ExtraActivity extends Activity {

    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        //获得TextView对象
        textView = this.findViewById(R.id.textView);
        //获得intent对象
        Intent intent = getIntent();
        //获得数据
        String name=intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        textView.setText("姓名："+name+";年龄："+age);
    }
}
