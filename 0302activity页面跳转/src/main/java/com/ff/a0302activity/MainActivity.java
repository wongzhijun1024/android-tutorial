package com.ff.a0302activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * 跳转按钮
     */
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
                //Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);

                startActivity(intent);
            }
        });
    }


}
