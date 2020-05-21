package com.ff.a0404demo.wx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0404demo.R;
import com.ff.a0404demo.pojo.User;

public class UserView extends RelativeLayout {
    public UserView(Context context) {
        super(context);
        View.inflate(context, R.layout.user_view, this);
        init();
    }

    public UserView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.user_view, this);
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
    }

    public void setUser(User user){
        icon.setBackgroundResource(user.getImg());
        name.setText(user.getName());
        infor.setText(user.getInfor());
        time.setText(user.getTime());
    }

}
