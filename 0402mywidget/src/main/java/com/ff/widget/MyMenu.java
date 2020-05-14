package com.ff.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0402mywidget.R;

public class MyMenu extends RelativeLayout implements View.OnClickListener{

    OnMenuClickListener onMenuClickListener;

    /**
     * 单词
     */
    final int STATE_BOOK=0;
    /**
     * 训练
     */
    final int STATE_TRAINING=STATE_BOOK+1;

    /**
     * 查找
     */
    final int STATE_SEARCH=STATE_TRAINING+1;

    /**
     * 商城
     */
    final int STATE_SHOP=STATE_SEARCH+1;

    /**
     * 我的
     */
    final int STATE_MINE=STATE_SHOP+1;

    int state = STATE_BOOK;


    /**
     * 单词
     */
    RelativeLayout layoutBook;
    TextView iconBook;
    TextView textBook;

    /**
     * 训练
     */
    RelativeLayout layoutTraining;
    TextView iconTraining;
    TextView textTraining;

    /**
     * 查找
     */
    RelativeLayout layoutSearch;
    TextView iconSearch;
    TextView textSearch;

    /**
     * 商城
     */
    RelativeLayout layoutShop;
    TextView iconShop;
    TextView textShop;

    /**
     * 我的
     */
    RelativeLayout layoutMine;
    TextView iconMine;
    TextView textMine;


    public MyMenu(Context context) {
        super(context);
        View.inflate(context, R.layout.my_menu,null);
        init();
    }

    public MyMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context,R.layout.my_menu,this);
        init();
    }

    private void init() {
        getWidget();
    }

    private void getWidget() {
        getButtonBook();
        getButtonTraining();
        getButtonSearch();
        getButtonShop();
        getButtonMine();
    }

    /**
     * 获得我的按钮
     */
    private void getButtonBook() {
        //获得各个组件
        layoutBook = this.findViewById(R.id.my_menu_layout_book);
        iconBook=this.findViewById(R.id.my_menu_icon_book);
        textBook=this.findViewById(R.id.my_menu_text_book);
        //设置监听
        layoutBook.setOnClickListener(this);
    }

    /**
     * 获得训练
     */
    private void getButtonTraining() {
        //获得各个组件
        layoutTraining = this.findViewById(R.id.my_menu_layout_training);
        iconTraining=this.findViewById(R.id.my_menu_icon_training);
        textTraining=this.findViewById(R.id.my_menu_text_training);
        //设置监听
        layoutTraining.setOnClickListener(this);
    }

    /**
     * 获得查找
     */
    private void getButtonSearch() {
        //获得各个组件
        layoutSearch = this.findViewById(R.id.my_menu_layout_search);
        iconSearch=this.findViewById(R.id.my_menu_icon_search);
        textSearch=this.findViewById(R.id.my_menu_text_search);
        //设置监听
        layoutSearch.setOnClickListener(this);
    }

    /**
     * 获得商城按钮
     */
    private void getButtonShop() {
        //获得各个组件
        layoutShop = this.findViewById(R.id.my_menu_layout_shop);
        iconShop=this.findViewById(R.id.my_menu_icon_shop);
        textShop=this.findViewById(R.id.my_menu_text_shop);
        //设置监听
        layoutShop.setOnClickListener(this);
    }

    /**
     * 获得我的按钮
     */
    private void getButtonMine() {
        //获得各个组件
        layoutMine = this.findViewById(R.id.my_menu_layout_mine);
        iconMine=this.findViewById(R.id.my_menu_icon_mine);
        textMine=this.findViewById(R.id.my_menu_text_mine);
        //设置监听
        layoutMine.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.my_menu_layout_book:
                actionLayoutBook();
                break;
            case R.id.my_menu_layout_training:
                actionLayoutTraining();
                break;
            case R.id.my_menu_layout_search:
                actionLayoutSearch();
                break;
            case R.id.my_menu_layout_shop:
                actionLayoutShop();
                break;
            case R.id.my_menu_layout_mine:
                actionLayoutMine();
                break;
        }
        this.onMenuClickListener.onClick(this,state);

    }

    @SuppressLint("ResourceAsColor")
    private void resetButton(){
        switch(state){
            case STATE_BOOK:
                iconBook.setBackgroundResource(R.drawable.book2);
                textBook.setTextColor(R.color.oNselectMenu);
                break;
            case STATE_TRAINING:
                iconTraining.setBackgroundResource(R.drawable.training2);
                textTraining.setTextColor(R.color.oNselectMenu);
                break;
            case STATE_SEARCH:
                iconSearch.setBackgroundResource(R.drawable.search2);
                textSearch.setTextColor(R.color.oNselectMenu);
                break;
            case STATE_SHOP:
                iconShop.setBackgroundResource(R.drawable.shop2);
                textShop.setTextColor(R.color.oNselectMenu);
                break;
            case STATE_MINE:
                iconMine.setBackgroundResource(R.drawable.mine2);
                textMine.setTextColor(R.color.oNselectMenu);
                break;
        }
    }

    @SuppressLint("ResourceAsColor")
    private void actionLayoutBook() {
        resetButton();
        iconBook.setBackgroundResource(R.drawable.book1);
        textBook.setTextColor(R.color.selectMenu);
        //更改状态值
        state=STATE_BOOK;
    }

    @SuppressLint("ResourceAsColor")
    private void actionLayoutTraining() {
        resetButton();
        iconTraining.setBackgroundResource(R.drawable.training);
        textTraining.setTextColor(R.color.selectMenu);
        //更改状态值
        state=STATE_TRAINING;
    }

    @SuppressLint("ResourceAsColor")
    private void actionLayoutSearch() {
        resetButton();
        iconSearch.setBackgroundResource(R.drawable.search1);
        textSearch.setTextColor(R.color.selectMenu);
        //更改状态值
        state=STATE_SEARCH;
    }

    @SuppressLint("ResourceAsColor")
    private void actionLayoutShop() {
        resetButton();
        iconShop.setBackgroundResource(R.drawable.shop1);
        textShop.setTextColor(R.color.selectMenu);
        //更改状态值
        state=STATE_SHOP;
    }

    @SuppressLint("ResourceAsColor")
    private void actionLayoutMine() {
        resetButton();
        iconMine.setBackgroundResource(R.drawable.mine1);
        textMine.setTextColor(R.color.selectMenu);
        //更改状态值
        state=STATE_MINE;
    }

    public void setOnClickListener(OnMenuClickListener onMenuClickListener) {
        this.onMenuClickListener=onMenuClickListener;
    }
}
