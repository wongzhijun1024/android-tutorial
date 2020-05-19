package com.ff.a0403listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ff.a0403listview.data.User;

import java.util.List;

public class UserAdapter extends BaseAdapter {

    List<User> lists;
    Context context;
    private LayoutInflater mInflater;//布局装载器对象
    public UserAdapter(List<User> lists, Context context){
        this.lists=lists;
        this.context=context;
        mInflater = LayoutInflater.from(context);
    }

    /**
     *
     * @return  填充的数据集数
     */
    @Override
    public int getCount() {
        return lists==null?0: lists.size();
    }

    /**
     *
     * @param position
     * @return  数据集中指定索引对应的数据项
     */
    @Override
    public Object getItem(int position) {
        return lists==null?null:lists.get(position);
    }

    /**
     *
     * @param position
     * @return  指定行所对应的ID
     */
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //如果当前显示的view为空，那么就创建view,可以让当前的view进行复用
        if(view==null)
         view= mInflater.inflate(R.layout.user_view,null);

        TextView icon = view.findViewById(R.id.img);
        icon.setBackgroundResource(lists.get(position).getImg());

        TextView name = view.findViewById(R.id.name);
        name.setText(lists.get(position).getName());

        TextView infor = view.findViewById(R.id.infor);
        infor.setText(lists.get(position).getInfor());

        TextView time = view.findViewById(R.id.text_view_time);
        time.setText(lists.get(position).getTime());

        return view;
    }
}
