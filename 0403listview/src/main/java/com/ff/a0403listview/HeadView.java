package com.ff.a0403listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class HeadView extends RelativeLayout {
    public HeadView(Context context) {
        super(context);
        View.inflate(context,R.layout.head_view,this);
    }

    public HeadView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context,R.layout.head_view,this);
    }

    public HeadView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View.inflate(context,R.layout.head_view,this);
    }
}
