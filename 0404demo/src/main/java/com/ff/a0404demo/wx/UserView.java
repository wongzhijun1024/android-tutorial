package com.ff.a0404demo.wx;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0404demo.ChatActivity;
import com.ff.a0404demo.R;
import com.ff.a0404demo.pojo.User;

public class UserView extends RelativeLayout implements View.OnClickListener{
    View view;
    Context context;
    public UserView(Context context) {
        super(context);
        this.context=context;
        view=View.inflate(context, R.layout.user_view, this);
        init();
    }

    public UserView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        view=View.inflate(context, R.layout.user_view, this);
        init();
    }

    private void init() {
        getWidget();
    }

    TextView icon;
    TextView name;
    TextView infor;
    TextView time;

    private void getWidget() {
        icon = this.findViewById(R.id.user_view_icon);
        name = this.findViewById(R.id.user_view_name);
        infor = this.findViewById(R.id.user_view_infor);
        time = this.findViewById(R.id.user_view_time);
        view.setOnClickListener(this);
    }

    User buffer;
    public void setUser(User user){
        icon.setBackgroundResource(user.getImg());
        name.setText(user.getName());
        infor.setText(user.getInfor());
        time.setText(user.getTime());
        buffer=null;
        buffer=user;
    }

    @Override
    public void onClick(View v) {

        //实现页面跳转
        //创建intent
        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra("id",buffer.getId());
        intent.putExtra("name",buffer.getName());
        context.startActivity(intent);

    }
}
