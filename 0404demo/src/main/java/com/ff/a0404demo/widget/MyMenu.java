package com.ff.a0404demo.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;

import com.ff.a0404demo.R;

public class MyMenu extends RelativeLayout implements View.OnClickListener {

    /**
     * 微信
     */
    public static final int STATE_WX = 0;
    /**
     * 通讯录
     */
    public static final int STATE_CONTACT = STATE_WX + 1;
    /**
     * 发现
     */
    public static final int STATE_FIND = STATE_CONTACT + 1;
    /**
     * 我的
     */
    public static final int STATE_MINE = STATE_FIND + 1;

    public int state = STATE_WX;

    /**
     * 微信
     */
    RelativeLayout layoutWx;
    TextView iconWx;
    TextView textWx;

    /**
     * 通讯录
     */
    RelativeLayout layoutContact;
    TextView iconContact;
    TextView textContact;

    /**
     * 发现
     */
    RelativeLayout layoutFind;
    TextView iconFind;
    TextView textFind;

    /**
     * 我的
     */
    RelativeLayout layoutMine;
    TextView iconMine;
    TextView textMine;

    public MyMenu(Context context) {
        super(context);
        View.inflate(context, R.layout.my_menu, this);
        init();
    }

    public MyMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.my_menu, this);
        init();
    }

    public MyMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context, R.layout.my_menu, this);
        init();
    }

    private void init() {
        getWidget();
    }

    OnMenuClickListener onMenuClickListener;

    public void setOnMenuClickListener(OnMenuClickListener onMenuClickListener) {
        this.onMenuClickListener = onMenuClickListener;
    }

    private void getWidget() {
        getLayoutWx();
        getLayoutContact();
        getLayoutFind();
        getLayoutMine();
        setSelectView();
    }

    private void getLayoutWx() {
        layoutWx = this.findViewById(R.id.my_menu_layout_wx);
        iconWx = this.findViewById(R.id.my_menu_icon_wx);
        textWx = this.findViewById(R.id.my_menu_text_wx);
        //设置监听
        layoutWx.setOnClickListener(this);
    }

    private void getLayoutContact() {
        layoutContact = this.findViewById(R.id.my_menu_layout_contact);
        iconContact = this.findViewById(R.id.my_menu_icon_contact);
        textContact = this.findViewById(R.id.my_menu_text_contact);
        //设置监听
        layoutContact.setOnClickListener(this);
    }

    private void getLayoutFind() {
        layoutFind = this.findViewById(R.id.my_menu_layout_find);
        iconFind = this.findViewById(R.id.my_menu_icon_find);
        textFind = this.findViewById(R.id.my_menu_text_find);
        //设置监听
        layoutFind.setOnClickListener(this);
    }

    private void getLayoutMine() {
        layoutMine = this.findViewById(R.id.my_menu_layout_mine);
        iconMine = this.findViewById(R.id.my_menu_icon_mine);
        textMine = this.findViewById(R.id.my_menu_text_mine);
        //设置监听
        layoutMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        resetLayout();
        int id = view.getId();
        switch (id) {
            case R.id.my_menu_layout_wx:
                actionWx();
                break;
            case R.id.my_menu_layout_contact:
                actionContact();
                break;
            case R.id.my_menu_layout_find:
                actioinFind();
                break;
            case R.id.my_menu_layout_mine:
                actionMine();
                break;
        }
        setSelectView();
        this.onMenuClickListener.onClick(view, state);
    }

    @SuppressLint("ResourceAsColor")
    private void actionMine() {
        //更改状态值
        state = STATE_MINE;
    }

    @SuppressLint("ResourceAsColor")
    private void actioinFind() {
        //更改状态值
        state = STATE_FIND;
    }

    @SuppressLint("ResourceAsColor")
    private void actionContact() {
        //更改状态值
        state = STATE_CONTACT;
    }

    @SuppressLint("ResourceAsColor")
    private void actionWx() {
        //更改状态值
        state = STATE_WX;
    }
    @SuppressLint("ResourceAsColor")
    private void setSelectView() {
        switch (state) {
            case STATE_WX:
                iconWx.setBackgroundResource(R.drawable.wx01);
                textWx.setTextColor(R.color.menuSlect);
                break;
            case STATE_CONTACT:
                iconContact.setBackgroundResource(R.drawable.contact01);
                textContact.setTextColor(R.color.menuSlect);
                break;
            case STATE_FIND:
                iconFind.setBackgroundResource(R.drawable.find01);
                textFind.setTextColor(R.color.menuSlect);
                break;
            case STATE_MINE:
                iconMine.setBackgroundResource(R.drawable.mine01);
                textMine.setTextColor(R.color.menuSlect);
                break;

        }
    }

    @SuppressLint("ResourceAsColor")
    private void resetLayout() {
        switch (state) {
            case STATE_WX:
                iconWx.setBackgroundResource(R.drawable.wx02);
                textWx.setTextColor(R.color.menuNoSlect);
                break;
            case STATE_CONTACT:
                iconContact.setBackgroundResource(R.drawable.contact02);
                textContact.setTextColor(R.color.menuNoSlect);
                break;
            case STATE_FIND:
                iconFind.setBackgroundResource(R.drawable.find02);
                textFind.setTextColor(R.color.menuNoSlect);
                break;
            case STATE_MINE:
                iconMine.setBackgroundResource(R.drawable.mine02);
                textMine.setTextColor(R.color.menuNoSlect);
                break;

        }
    }
}
