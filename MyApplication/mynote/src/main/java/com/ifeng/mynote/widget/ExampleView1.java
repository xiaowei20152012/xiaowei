package com.ifeng.mynote.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

import com.freedom.xiaowei.recyclerview.util.LogUtil;

/**
 * Created by liwei5 on 2015/12/17.
 */
public class ExampleView1 extends View {
    private static final String tag = ExampleView1.class.getSimpleName();
    public ExampleView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        LogUtil.i(tag,"ExampleView1  context   attrs");
    }
    public ExampleView1(Context context) {
        super(context);
        LogUtil.i(tag, "ExampleView1  context");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        LogUtil.i(tag,"ExampleView1 above onMeasure  widthMeasureSpec="+widthMeasureSpec+",heightMeasureSpec="+heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        LogUtil.i(tag, "ExampleView1 below onMeasure  widthMeasureSpec="+widthMeasureSpec+",heightMeasureSpec="+heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        LogUtil.i(tag,"ExampleView1 above onLayout  changed="+changed+",left="+left+",top="+top+",right="+right+",bottom="+bottom);
        super.onLayout(changed, left, top, right, bottom);
        LogUtil.i(tag,"ExampleView1 below onLayout  changed="+changed+",left="+left+",top="+top+",right="+right+",bottom="+bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        LogUtil.i(tag,"ExampleView1 above onDraw  ");
        super.onDraw(canvas);
        LogUtil.i(tag,"ExampleView1 below onDraw  ");
    }
}