package com.ff.a0403listview;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnScrollChangeListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.ff.a0403listview.data.User;

import java.util.ArrayList;

public class MainActivity2 extends Activity {

    ListView listView;

    int icons[] = {R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3, R.drawable.icon_4, R.drawable.icon_5, R.drawable.icon_6, R.drawable.icon_7, R.drawable.icon_4, R.drawable.icon_5, R.drawable.icon_6, R.drawable.icon_7};
    private ArrayList<User> list = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = this.findViewById(R.id.list_view2);

        for (int i = 0; i < icons.length; i++) {
            User user = new User(icons[i], "姓名" + i, "信息" + i, "星期" + i);
            list.add(user);
        }

        UserAdapter userAdapter = new UserAdapter(list,this);

        listView.setAdapter(userAdapter);

        HeadView headView= new HeadView(this);
        //在listView上面添加一个自定义组件
        listView.addHeaderView(headView);


        listView.setOnScrollChangeListener(new OnScrollChangeListener(){

            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

            }
        });


    }
}
