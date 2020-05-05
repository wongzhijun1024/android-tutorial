package com.ff.a0203log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 普通按钮
     */
    Button button;

    /**
     * 显示文本
     */
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }

    /**
     * 创建显示的组件
     */
    private void getWidget() {
        getTextView();
        getButton();
    }

    /**
     * 获得按钮
     */
    private void getButton() {
        //获得按钮
        button = this.findViewById(R.id.button);
        //设置按钮的监听事件
        button.setOnClickListener(this);
    }

    /**
     * 获得显示组件
     */
    private void getTextView() {
        textView=this.findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        //获得监听组件的ID
        int id = view.getId();
        switch (id){
            case R.id.button:
                actionButton();
                break;
        }

    }

    /**
     * 按钮的事件处理
     */
    private void actionButton() {
        Log.e("错误","文本信息");
        textView.setText("更改数据");
    }
}
