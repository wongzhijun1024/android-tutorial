package com.ff.a0403listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ff.a0403listview.data.User;

import java.util.List;

public class UserAdapter3 extends BaseAdapter {

    List<User> lists;
    Context context;
    private LayoutInflater mInflater;//布局装载器对象

    public UserAdapter3(List<User> lists, Context context) {
        this.lists = lists;
        this.context = context;
        mInflater = LayoutInflater.from(context);
    }

    /**
     * @return 填充的数据集数
     */
    @Override
    public int getCount() {
        return lists == null ? 0 : lists.size();
    }

    /**
     * @param position
     * @return 数据集中指定索引对应的数据项
     */
    @Override
    public Object getItem(int position) {
        return lists == null ? null : lists.get(position);
    }

    /**
     * @param position
     * @return 指定行所对应的ID
     */
    @Override
    public long getItemId(int position) {
        return position;
    }


    /**
     *   采用两种方式进行优化
     *   1,复用显示的view
     *   2,通过ViewHolder减少findViewById的使用
     *   3,listView设置setOnScrollChangeListener监听，获得滚动监听对象,把监听对象专递到Adapter对象里面来，
     *     当滑动的时候,让当前显示的view停止加载数据，当监听到滑动停止的时候，加载当前显示view的数据
     * @param position
     * @param view
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //如果当前显示的view为空，那么就创建view,可以让当前的view进行复用
        ViewHolder viewHolder = null;
        if (view == null) {
            viewHolder = new ViewHolder();
            viewHolder.userView= new UserView(context);
            //把viewHolder存放到view里面去
            view.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.userView.setData(lists.get(position));
        return view;
    }

    static class ViewHolder {
        UserView userView;
    }
}
