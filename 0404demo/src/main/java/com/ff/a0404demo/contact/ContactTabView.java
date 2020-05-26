package com.ff.a0404demo.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ff.a0404demo.R;
import com.ff.a0404demo.pojo.Contact;

public class ContactTabView extends RelativeLayout implements View.OnClickListener {
    View view;
    public ContactTabView(Context context) {
        super(context);
         view=View.inflate(context, R.layout.contact_tab_view, this);
        init();
    }

    public ContactTabView(Context context, AttributeSet attrs) {
        super(context, attrs);
         view=View.inflate(context, R.layout.contact_tab_view, this);
        init();
    }

    TextView icon;
    TextView name;
    private void init(){
        icon = this.findViewById(R.id.contact_tab_view_icon);
        name=this.findViewById(R.id.contact_tab_view_name);

        view.setOnClickListener(this);
    }

    public void setInfor(Contact contact){
        icon.setBackgroundResource(contact.getImg());
        name.setText(contact.getName());
    }

    @Override
    public void onClick(View view) {
        Log.e("点击事件","跳转信息");

    }
}
