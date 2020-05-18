package com.ff.a0403listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ff.a0403listview.data.User;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    List<User> list;
    LayoutInflater inflater;
    public MyAdapter(List<User> list, Context context){
        this.list=list;
        inflater=  LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return list==null?0:list.size();
    }
    @Override
    public Object getItem(int position) {
        return list==null?null:list.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.user_view2,null);
        TextView img = view.findViewById(R.id.my_adapter_img);
        img.setBackgroundResource(list.get(position).getImg());
        //获取姓名组件
        TextView name=view.findViewById(R.id.my_adapter_name);
        name.setText(list.get(position).getName());
        //获得信息组件
        TextView infor =view.findViewById(R.id.my_adapter_infor);
        infor.setText(list.get(position).getInfor());

        return view;
    }
}
