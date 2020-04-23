package com.ff.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        createButton();
        createTextView();
    }

    private void createTextView() {
        textView = this.findViewById(R.id.textView);
    }

    private void createButton() {
        button =this.findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //获得被点击按钮
        int id = v.getId();
        switch(id){
            case R.id.button:
                buttonAction();
                break;
        }
    }

    private void buttonAction() {
        textView.setText("新页面");
    }
}
