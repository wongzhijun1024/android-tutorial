package com.ff.a0403listview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView listView;
    private String[] datas={"苹果公司" ,"google公司","华为公司","腾讯公司","阿里巴巴","亚马逊","特斯拉","思科","三星","联发科","台积电"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = this.findViewById(R.id.list_view);
        ArrayAdapter<String> adpter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,datas);

        listView.setAdapter(adpter);


    }
}
