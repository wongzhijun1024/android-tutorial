package com.ff.a0305activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonTel;

    Button buttonMessage;

    Button buttonIe;

    Button buttonImg;

    Button buttonPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWidget();
    }

    private void getWidget() {
        getButton();
    }

    private void getButton() {
        getButtonTel();
        getButtonMessage();
        getButtonIe();
        getButtonImg();
        getButtonPic();
    }

    private void getButtonPic() {
        buttonPic=this.findViewById(R.id.picButton);
        buttonPic.setOnClickListener(this);
    }

    private void getButtonImg() {
        buttonImg=this.findViewById(R.id.imgButton);
        buttonImg.setOnClickListener(this);
    }

    /**
     * 获得浏览器按钮
     */
    private void getButtonIe() {
        buttonIe = this.findViewById(R.id.ieButton);
        buttonIe.setOnClickListener(this);
    }

    /**
     * 获得短信按钮
     */
    private void getButtonMessage() {
        buttonMessage = this.findViewById(R.id.messageButton);
        buttonMessage.setOnClickListener(this);
    }

    private void getButtonTel() {
        buttonTel = this.findViewById(R.id.tel);
        buttonTel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tel:
                actionTel();
                break;
            case R.id.messageButton:
                actionMessage();
                break;
            case R.id.ieButton:
                actionIe();
                break;
            case R.id.imgButton:
                actionImg();
                break;
            case R.id.picButton:
                actionPic();
                break;
        }
    }

    private void actionPic() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 1);
    }

    private void actionImg() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        startActivityForResult(intent, 2);
    }

    private void actionIe() {
        Uri uri = Uri.parse("https://www.baidu.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void actionMessage() {
        Uri uri = Uri.parse("smsto:10010");
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", "Hello");
        startActivity(intent);
    }

    private void actionTel() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            // 做权限的申请处理
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.CALL_PHONE}, 1);
        } else {
            Uri callUri = Uri.parse("tel:10010");
            Intent intent = new Intent(Intent.ACTION_CALL, callUri);
            // 已经授予了权限，则调用业务逻辑，打电话
            startActivity(intent);
        }


    }
}
