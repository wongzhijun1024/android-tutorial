package com.ff.a0201activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Log.i("调试","onCreate");
    }

    @Override
    protected void onStart() {
        Log.i("调试","onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.i("调试","onStop");
        super.onStop();
    }

    @Override
    protected void onResume() {
        Log.i("调试","onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("调试","onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.i("调试","onDestroy");
        super.onDestroy();
    }
}
