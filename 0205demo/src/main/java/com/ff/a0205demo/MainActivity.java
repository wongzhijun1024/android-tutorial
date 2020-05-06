package com.ff.a0205demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RelativeLayout bookLayout;
    TextView bookIcon;
    TextView bookFont;

    RelativeLayout trainingLayout;
    TextView trainingIcon;
    TextView trainingFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得组件
        getWidget();
    }

    /**
     * 获得组件
     */
    private void getWidget() {
        getBookWidget();
        gettrainingWidget();
    }

    private void gettrainingWidget() {
        trainingLayout = this.findViewById(R.id.trainingLayout);
        trainingIcon=this.findViewById(R.id.trainingIcon);
        trainingFont=this.findViewById(R.id.trainingFont);

        trainingLayout.setOnClickListener(this);
    }

    /**
     * 获得单词组件
     */
    private void getBookWidget() {
        bookLayout = this.findViewById(R.id.bookLayout);
        bookIcon=this.findViewById(R.id.bookIcon);
        bookFont=this.findViewById(R.id.bookFont);
        bookLayout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        switch(id){
            case R.id.bookLayout:
                bookAction();
                break;
            case R.id.trainingLayout:
                trainingAction();
                break;
        }

    }
    @SuppressLint("ResourceAsColor")
    private void trainingAction() {
        trainingIcon.setBackgroundResource(R.drawable.training);
        trainingFont.setTextColor(R.color.fontSelect);
    }

    @SuppressLint("ResourceAsColor")
    private void bookAction() {
        bookIcon.setBackgroundResource(R.drawable.book1);
        bookFont.setTextColor(R.color.fontSelect);
    }
}
