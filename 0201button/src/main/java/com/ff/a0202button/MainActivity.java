package com.ff.a0202button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //当前类的对象调用findViewById方法，通过ID（键）来获得按钮
        Button button = this.findViewById(R.id.button);
        //设置按钮的监听
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("测试","按钮监听");
//            }
//        });


        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //获得当前被点击的view
        int id = view.getId();
        switch(id){
            case R.id.button:
                Log.e("调试","按钮信息");
                break;
        }

    }
}
