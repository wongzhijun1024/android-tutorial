package com.ff.a0401widget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class RegisterActivity extends Activity implements View.OnClickListener{

    TextView buttonBack;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgiter);
        getWidget();
    }

    private void getWidget() {
        getButton();
    }

    private void getButton() {
        getButtonOk();
    }

    private void getButtonOk() {
        buttonBack=  this.findViewById(R.id.activity_register_button_back);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.activity_register_button_back:
                this.finish();
                break;
        }

    }
}
