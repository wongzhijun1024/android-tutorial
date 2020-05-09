package com.ff.a0302activity;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
