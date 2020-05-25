package com.ff.a0404demo.contact;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ff.a0404demo.pojo.Contact;

import java.util.ArrayList;

public class ContactViewAdapter extends BaseAdapter {

    ArrayList<Contact> list;
    Context context;

    public ContactViewAdapter(Context context, ArrayList<Contact> list) {
        this.context = context;
        this.list = list;
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
        if(convertView==null){
            convertView = new ContactTabView(context);
        }
        ContactTabView contactTabView= (ContactTabView)convertView;
        contactTabView.setInfor(list.get(position));
        return convertView;
    }
}
