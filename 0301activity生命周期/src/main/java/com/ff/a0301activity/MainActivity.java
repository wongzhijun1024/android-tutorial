package com.ff.a0301activity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("life","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("life","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("life","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("life","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("life","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("life","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("life","onDestroy");
    }
}
