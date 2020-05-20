package com.ff.a0404demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.ff.a0404demo.widget.MyMenu;
import com.ff.a0404demo.widget.OnMenuClickListener;

public class MainActivity extends Activity implements OnMenuClickListener {

    MyMenu myMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWidget();
    }

    private void getWidget() {

        getWidgetMenu();
    }

    private void getWidgetMenu() {
        myMenu = this.findViewById(R.id.myMenu);
        myMenu.setOnMenuClickListener(this);
    }

    @Override
    public void onClick(View view, int state) {

    }
}
