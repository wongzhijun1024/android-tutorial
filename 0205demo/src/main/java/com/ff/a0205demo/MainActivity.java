package com.ff.a0205demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //单词选项
    final int STATE_BOOK=1;
    //训练
    final int STATE_TRAINING=STATE_BOOK+1;
    //查找
    final int STATE_SEARCH=STATE_TRAINING+1;
    //商城
    final int STATE_SHOP=STATE_SEARCH+1;
    //我的
    final int STATE_MINE=STATE_SHOP+1;

    //单词相关组件
    RelativeLayout bookLayout;
    TextView bookIcon;
    TextView bookFont;

    //训练相关组件
    RelativeLayout trainingLayout;
    TextView trainingIcon;
    TextView trainingFont;

    //查找相关组件
    RelativeLayout searchLayout;
    TextView searchIcon;
    TextView searchFont;

    //商城组件
    RelativeLayout shopLayout;
    TextView shopIcon;
    TextView shopFont;

    //我的组件
    RelativeLayout mineLayout;
    TextView mineIcon;
    TextView mineFont;



    //创建一个缓冲的容器
    int index=1;

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
        getTrainingWidget();
        getSearchWidget();
        getShopWidget();
        getMineWidget();
    }

    private void getMineWidget() {
        mineLayout=this.findViewById(R.id.mineLayout);
        mineIcon=this.findViewById(R.id.mineIcon);
        mineFont=this.findViewById(R.id.mineFont);

        //设置监听
        mineLayout.setOnClickListener(this);
    }

    /**
     * 获得商城组件
     */
    private void getShopWidget() {
        shopLayout=this.findViewById(R.id.shopLayout);
        shopIcon=this.findViewById(R.id.shopIcon);
        shopFont=this.findViewById(R.id.shopFont);
        //设置监听
        shopLayout.setOnClickListener(this);
    }

    /*
     * 查找组件
     */
    private void getSearchWidget() {
        searchLayout=this.findViewById(R.id.searchLayout);
        searchIcon=this.findViewById(R.id.searchIcon);
        searchFont=this.findViewById(R.id.searchFont);

        //设置监听
        searchLayout.setOnClickListener(this);
    }

    /**
     * 获得训练组件
     */
    private void getTrainingWidget() {
        //获得容器
        trainingLayout = this.findViewById(R.id.trainingLayout);
        //获得图片
        trainingIcon=this.findViewById(R.id.trainingIcon);
        //获得字体
        trainingFont=this.findViewById(R.id.trainingFont);
        //设置监听
        trainingLayout.setOnClickListener(this);
    }

    /**
     * 获得单词组件
     */
    private void getBookWidget() {
        //获得显示容器
        bookLayout = this.findViewById(R.id.bookLayout);
        //获得图片
        bookIcon=this.findViewById(R.id.bookIcon);
        //获得字体
        bookFont=this.findViewById(R.id.bookFont);
        //设置监听
        bookLayout.setOnClickListener(this);
        index=STATE_BOOK;

}

    @Override
    public void onClick(View view) {
        reset();
        int id  = view.getId();
        switch(id){
            case R.id.bookLayout:
                bookAction();
                break;
            case R.id.trainingLayout:
                trainingAction();
                break;
            case R.id.searchLayout:
                searchAction();
                break;
            case R.id.shopLayout:
                shopAction();
                break;
            case R.id.mineLayout:
                mineAction();
                break;
        }

    }

    @SuppressLint("ResourceAsColor")
    private void bookAction() {
        bookIcon.setBackgroundResource(R.drawable.book1);
        bookFont.setTextColor(R.color.fontSelect);
        index=STATE_BOOK;
    }

    @SuppressLint("ResourceAsColor")
    private void trainingAction() {
        trainingIcon.setBackgroundResource(R.drawable.training);
        trainingFont.setTextColor(R.color.fontSelect);
        index=STATE_TRAINING;
    }
    @SuppressLint("ResourceAsColor")
    private void searchAction() {
        searchIcon.setBackgroundResource(R.drawable.search1);
        searchFont.setTextColor(R.color.fontSelect);
        index=STATE_SEARCH;
    }

    @SuppressLint("ResourceAsColor")
    private void shopAction() {
        shopIcon.setBackgroundResource(R.drawable.shop1);
        shopFont.setTextColor(R.color.fontSelect);
        index=STATE_SHOP;
    }

    @SuppressLint("ResourceAsColor")
    private void mineAction() {
        mineIcon.setBackgroundResource(R.drawable.mine1);
        mineFont.setTextColor(R.color.fontSelect);
        index=STATE_MINE;
    }



    @SuppressLint("ResourceAsColor")
    private void reset(){
     switch(index){
         case STATE_BOOK:
             bookIcon.setBackgroundResource(R.drawable.book2);
             bookFont.setTextColor(R.color.fontNoSelect);
             break;
         case STATE_TRAINING:
             trainingIcon.setBackgroundResource(R.drawable.training2);
             trainingFont.setTextColor(R.color.fontNoSelect);
             break;
         case STATE_SEARCH:
             searchIcon.setBackgroundResource(R.drawable.search2);
             searchFont.setTextColor(R.color.fontNoSelect);
             break;
         case STATE_SHOP:
             shopIcon.setBackgroundResource(R.drawable.shop2);
             shopFont.setTextColor(R.color.fontNoSelect);
             break;
         case STATE_MINE:
             mineIcon.setBackgroundResource(R.drawable.mine2);
             mineFont.setTextColor(R.color.fontNoSelect);
             break;
     }
    }

}
