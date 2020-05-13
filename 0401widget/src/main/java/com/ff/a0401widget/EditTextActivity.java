package com.ff.a0401widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.ff.a0401widget.R.id.buttonOk;

public class EditTextActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 标题
     */
    TextView textViewTitle;

    /**
     * 编辑
     */
    EditText editTextName;

    /**
     * 确认按钮
     */
    Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        textViewTitle =  this.findViewById(R.id.titleView);
        editTextName= this.findViewById(R.id.editTextName);
        buttonOk=this.findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(this);//设置监听
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.buttonOk:
                actionOk();
                break;
        }
    }
    private void actionOk() {
        //获得编辑框里面的数据
        String text = editTextName.getText().toString();
        //把数据给文本
        textViewTitle.setText(text);

    }
}
