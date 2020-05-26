package com.ff.a0404demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ChatActivity extends Activity implements View.OnClickListener{

    //返回按钮
    TextView buttonBack;

    //标题
    TextView textTitle;

    int id;
    String name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);
        id=getIntent().getIntExtra("id",0);
        name = getIntent().getStringExtra("name");
        getWidget();
    }

    private void getWidget() {

        getWidgetTextTitle();
        getWidgetButtonBack();
    }

    private void getWidgetTextTitle() {
        textTitle = this.findViewById(R.id.chat_activity_text_title);
        textTitle.setText(name);
    }

    private void getWidgetButtonBack() {
        buttonBack = this.findViewById(R.id.chat_activity_button_back);
        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.chat_activity_button_back:
                actionBack();
                break;
        }

    }

    private void actionBack() {
        this.finish();
    }
}
