package com.ff.a0404demo.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0404demo.R;
import com.ff.a0404demo.pojo.Contact;
import com.ff.a0404demo.pojo.User;

import java.util.ArrayList;

public class ContactView extends RelativeLayout {

    /**
     * 列表组件
     */
    private ListView listView;

    /**
     * 编辑框
     */
    EditText editText;

    /**
     * 适配器
     */
    ContactViewAdapter contactViewAdapter;

    /**
     * 上下文
     */
    Context context;
    public ContactView(Context context) {
        super(context);
        View.inflate(context, R.layout.contact_view, this);
        this.context=context;
        init();
    }

    public ContactView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.contact_view, this);
        this.context=context;
        init();
    }

    private void init() {
        getData();
        getWidget();
    }

    private void getData() {
        getListData();
    }

    private void getListData() {

        int imgs[]={R.drawable.contact_tab_view_new,R.drawable.contact_tab_view_chat,R.drawable.contact_tab_view_tag,R.drawable.contact_tab_view_public,R.drawable.contact_tab_view_company};

        String names[]={"新的朋友","群聊","标签","公众号","企业微信联系人"};
        ArrayList<Contact> list = new ArrayList<>();

        for(int i=0;i<imgs.length;i++){
            Contact contact = new Contact(imgs[i],names[i]);
            list.add(contact);
        }

        contactViewAdapter = new ContactViewAdapter(context,list);
    }

    //获得组件v
    private void getWidget() {
        getEditView();
        getListView();
    }

    private void getEditView() {
        editText = this.findViewById(R.id.contact_view_edit_view);
    }

    /**
     * 获得列表组件
     */
    private void getListView() {
        listView = this.findViewById(R.id.contact_view_list_view);
        listView.setAdapter(contactViewAdapter);
    }


}