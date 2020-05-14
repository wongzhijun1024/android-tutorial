package com.ff.a0304activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public final int REQUEST_CODE_1 = 1;
    public final int REQUEST_CODE_2 = 2;
    /**
     * 标题文本
     */
    TextView titleTextView;

    Button  button1;

    Button  button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }

    /**
     * 获得组件
     */
    private void getWidget() {
        getTextView();
        getButton();
    }

    /**
     * 获得按钮
     */
    private void getButton() {
        getButton1();
        getButton2();
    }


    private void getButton1() {
        button1 = this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    private void getButton2() {
        button2 = this.findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    /**
     * 获得显示视图
     */
    private void getTextView() {
        //获得标题文本
        titleTextView = this.findViewById(R.id.title);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.button1:
                actionButton1();
                break;
            case R.id.button2:
                actionButton2();
                break;
        }

    }

    private void actionButton1() {
        Intent intent=new Intent(MainActivity.this,Activity1.class);
        startActivityForResult(intent,REQUEST_CODE_1);
    }

    private void actionButton2() {
        Intent intent=new Intent(MainActivity.this,Activity2.class);
        startActivityForResult(intent,REQUEST_CODE_2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        String name=  intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        switch (requestCode) {
            case REQUEST_CODE_1: //返回的结果是来自于Activity B
                titleTextView.setText("activity1:的姓名是："+name+";年龄是"+age);
                break;
            case REQUEST_CODE_2: //返回的结果是来自于Activity C
                titleTextView.setText("activity2:的姓名是："+name+";年龄是"+age);
                break;
            default:
                break;
        }
    }
}
