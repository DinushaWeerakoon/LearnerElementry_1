package com.example.dell.learnerintermediate;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/**
 * Created by ucsc on 9/3/2015.
 */
public class DragShadow extends View.DragShadowBuilder {
    ColorDrawable greyBox;
    public DragShadow(View view){
        super(view);
        greyBox = new ColorDrawable(Color.LTGRAY);
    }

    @Override
    public void onDrawShadow(Canvas canvas){
        //super.onDrawShadow(canvas);
        greyBox.draw(canvas);
    }

    @Override
    public void onProvideShadowMetrics(Point shadowSize, Point shadowTouchPoint){
        //super.onProvideShadowMetrics(shadowSize,shadowTouchPoint);
        View v = getView();
        int height = (int) v.getHeight()/2;
        int width = (int) v. getWidth()/2;
        greyBox.setBounds(0,0,width,height);
        shadowSize.set(width, height);
        shadowTouchPoint.set((int)width/2,(int)height/2);
    }
}

