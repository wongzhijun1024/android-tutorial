package com.ff.a0301activity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       //获得按钮
        button=this.findViewById(R.id.button);
        //设置监听
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建intent
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("name","小刚");
                startActivity(intent);
            }
        });
    }
}
