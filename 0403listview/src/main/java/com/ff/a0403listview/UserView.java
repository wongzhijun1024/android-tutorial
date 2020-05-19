package com.ff.a0403listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0403listview.data.User;

public class UserView extends RelativeLayout {
    public UserView(Context context) {
        super(context);
        View.inflate(context, R.layout.user_view, this);
        initWidget();
    }

    public UserView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.user_view, this);
        initWidget();
    }

    TextView icon;
    TextView name;
    TextView infor;
    TextView time;

    private void initWidget() {
        icon = this.findViewById(R.id.img);
        name = this.findViewById(R.id.name);
        infor = this.findViewById(R.id.infor);
        time = this.findViewById(R.id.text_view_time);
    }

    public void setData(User user) {
        icon.setBackgroundResource(user.getImg());
        name.setText(user.getName());
        infor.setText(user.getInfor());
        time.setText(user.getTime());
    }
}
