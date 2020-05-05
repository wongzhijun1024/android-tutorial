package com.ff.a0202textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过当前类的对象调用findViewById方法，根据id来获得对应的组件
        TextView textView = this.findViewById(R.id.textView);
        //更改当前文本内容
        textView.setText("新文本");



        //获得文本对象
        TextView button = this.findViewById(R.id.xnsy);
        //设置文本的点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("文本","事件");
            }
        });


    }
}
