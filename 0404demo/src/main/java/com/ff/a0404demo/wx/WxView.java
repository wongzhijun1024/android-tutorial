package com.ff.a0404demo.wx;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.ff.a0404demo.R;
import com.ff.a0404demo.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class WxView extends RelativeLayout {
    Context context;

    public WxView(Context context) {
        super(context);
        this.context=context;
        View.inflate(context, R.layout.wx_view, this);
        init();
    }

    public WxView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        View.inflate(context, R.layout.wx_view, this);
        init();
    }

    /**
     * 列表组件
     */
    ListView listView;

    /**
     * 适配器
     */
    WxAdapter wxAdapter;

    private void init() {
        getData();
        getWidget();
    }

    private void getData() {

        int imgs[] = {R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3, R.drawable.icon_4, R.drawable.icon_5, R.drawable.icon_6, R.drawable.icon_7, R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3};
        ArrayList<User> list = new ArrayList<User>();

        for(int i=0;i<imgs.length;i++){
               User user = new User(imgs[i],"姓名"+i,"信息"+i,"星期"+i%7);
            list.add(user);
        }

        wxAdapter = new WxAdapter(context, list);
    }

    private void getWidget() {
        listView = this.findViewById(R.id.wx_view_list_view);
        listView.setAdapter(wxAdapter);
    }
}
