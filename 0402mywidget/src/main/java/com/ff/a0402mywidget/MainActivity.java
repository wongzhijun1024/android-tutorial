package com.ff.a0402mywidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.ff.widget.MyMenu;
import com.ff.widget.OnMenuClickListener;

public class MainActivity extends AppCompatActivity {

    MyMenu myMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMenu = this.findViewById(R.id.menu);
        myMenu.setOnClickListener(new OnMenuClickListener() {

            @Override
            public void onClick(View view, int state) {
                Log.e("点击","第"+state+"值");
            }
        });
    }
}
