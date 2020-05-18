package com.ff.a0403listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.ff.a0403listview.data.User;

import java.util.ArrayList;
import java.util.List;

public class TestAcitivity extends Activity {

    ListView listView;

    List<User> list = new ArrayList<>();
       int imgs[]={R.drawable.icon_1,R.drawable.icon_2,R.drawable.icon_3,R.drawable.icon_4,R.drawable.icon_5,R.drawable.icon_6,R.drawable.icon_7};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置显示的页面
        setContentView(R.layout.activity_test);

        //准备数据
        for(int i=0;i<imgs.length;i++){
            User user = new User(imgs[i],"姓名"+i,"信息"+i,"星期"+i);
            list.add(user);
        }
        //创建适配器
        MyAdapter adaper = new MyAdapter(list,this);

        //获得listView组件
        listView = this.findViewById(R.id.test_list_view);
        //让listView和适配器结合起来
        listView.setAdapter(adaper);

    }
}
