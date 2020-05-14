package com.ff.a0303activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button extraButton;

    Button bundleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得按钮
        extraButton = this.findViewById(R.id.extraButton);
        //设置监听
        extraButton.setOnClickListener(this);

        bundleButton=this.findViewById(R.id.bundleButton);
        bundleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.extraButton:
                actionExtraButton();
                break;
            case R.id.bundleButton:
                actionBundleButton();
                break;
        }

    }

    private void actionBundleButton() {
        Intent intent=  new Intent(MainActivity.this,BundleActivity.class);
        //创建Bundle对象，用于存储数据
        Bundle bundle = new Bundle();
        bundle.putString("name","小刚");
        bundle.putInt("age",18);
        //设置bundle对象
        intent.putExtras(bundle);
        //实现页面跳转
        startActivity(intent);
    }

    private void actionExtraButton() {
        Intent intent=  new Intent(MainActivity.this,ExtraActivity.class);
        intent.putExtra("name","小刚");
        intent.putExtra("age",19);

        startActivity(intent);
    }
}
