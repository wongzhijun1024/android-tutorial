package com.ff.a0303activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import org.w3c.dom.Text;

public class BundleActivity extends Activity {

    /**
     * 显示组件
     */
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        textView=this.findViewById(R.id.textView);
        //获得对象
        Intent intent = getIntent();
        //获得bundle对象
        Bundle bundle=intent.getExtras();
        //获得数据
        String name= bundle.getString("name");
        int age = bundle.getInt("age");
        textView.setText("姓名："+name+";年龄:"+age);
    }
}
