package com.ff.a0404demo.wx;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ff.a0404demo.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class WxAdapter extends BaseAdapter {
    Context context;
    ArrayList<User> list;

    public WxAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return this.list==null?0:this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list==null?null:this.list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        UserView userView=null;
        if(convertView==null){
            userView = new UserView(context);
            convertView=userView;
        }else{
            userView = (UserView)convertView;
        }

        userView.setUser(list.get(position));

        return convertView;
    }

}
