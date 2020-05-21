package com.ff.a0404demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ff.a0404demo.widget.MyMenu;
import com.ff.a0404demo.widget.OnMenuClickListener;
import com.ff.a0404demo.wx.WxView;

public class MainActivity extends Activity implements OnMenuClickListener {

    /**
     * 标题布局
     */
    RelativeLayout layoutTitle;
    /**
     * 容器布局
     */
    RelativeLayout layoutBox;
    /**
     * 菜单
     */
    MyMenu myMenu;

    /**
     * 屏幕宽度
     */
    private  int width;

    /**
     * 屏幕高度
     */
    private int height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        getWidget();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        width = point.x;
        height = point.y;
    }

    private void getWidget() {
        getWidgeTitle();
        getWidgetBox();
        getWidgetMenu();
    }


    private void getWidgeTitle() {
        layoutTitle = this.findViewById(R.id.layout_title);

        RelativeLayout.LayoutParams params= (RelativeLayout.LayoutParams) layoutTitle.getLayoutParams();
        params.height=height/10;
    }

    private void getWidgetBox() {
        //获得显示容器：用来装中间切换的内容
        layoutBox =this.findViewById(R.id.layout_box);
        //获得布局的属性
        RelativeLayout.LayoutParams params= (RelativeLayout.LayoutParams) layoutBox.getLayoutParams();
        params.height=height/10*8;

        WxView wxView = new WxView(this);

        layoutBox.addView(wxView);

    }
    private void getWidgetMenu() {
        myMenu = this.findViewById(R.id.myMenu);
        myMenu.setOnMenuClickListener(this);
        RelativeLayout.LayoutParams params= (RelativeLayout.LayoutParams) myMenu.getLayoutParams();
        params.height=height/10;
    }

    @Override
    public void onClick(View view, int state) {

    }
}
