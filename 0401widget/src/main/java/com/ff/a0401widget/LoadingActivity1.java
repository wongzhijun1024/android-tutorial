package com.ff.a0401widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;

public class LoadingActivity1 extends Activity implements View.OnClickListener{

    RelativeLayout layoutLoading;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading1);
        //获得布局文件
        layoutLoading = this.findViewById(R.id.loading_activity_loading);
        layoutLoading.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.loading_activity_loading:
                actionLoading();
                break;
        }

    }

    private void actionLoading() {
        Intent intent = new Intent(LoadingActivity1.this,LoadingActivity2.class);
        startActivity(intent);
    }
}
