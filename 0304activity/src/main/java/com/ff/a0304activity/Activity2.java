package com.ff.a0304activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class Activity2 extends Activity implements View.OnClickListener{

    /**
     * 返回按钮
     */
    Button buttonBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        //获得返回按钮
        buttonBack=this.findViewById(R.id.activity2_button_back);
        //设置监听
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.activity2_button_back:
                actionBack();
                break;
        }

    }


    private void actionBack() {
        //创建intent对象,实现页面跳转、传递参数
        Intent intent = new Intent();
        intent.putExtra("name","小明");
        intent.putExtra("age",17);
        //返回数据给前一个页面
        setResult(RESULT_OK,intent);
        //关闭当前页面
        finish();
    }
}
