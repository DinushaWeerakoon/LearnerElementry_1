package com.example.dell.learnerintermediate;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson18C extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view =inflater.inflate(R.layout.fr_less_18_c, container, false);

        TextView answ_1,answ_2,answ_3,answ_4, answ_5, blank_1,blank_2, blank_3,blank_4,blank_5;
        final Processor DragAndDropAns =new Processor();

        // views to drag
        answ_1= (TextView) view.findViewById(R.id.ans_1);
        answ_2= (TextView) view.findViewById(R.id.ans_2);
        answ_3= (TextView) view.findViewById(R.id.ans_3);
        answ_4= (TextView) view.findViewById(R.id.ans_4);
        answ_5= (TextView) view.findViewById(R.id.ans_5);

        //views to drop onto
        blank_1=(TextView) view.findViewById(R.id.blnk_1);
        blank_1.setTag("Distribution and Maintenance");
        blank_2=(TextView)view.findViewById(R.id.blnk_2);
        blank_2.setTag("electrical system");
        blank_3=(TextView)view.findViewById(R.id.blnk_3);
        blank_3.setTag("the 23rd January 2012");
        blank_4=(TextView)view.findViewById(R.id.blnk_4);
        blank_4.setTag("starting at 8.00 a.m.");
        blank_5=(TextView)view.findViewById(R.id.blnk_5);
        blank_5.setTag("understanding and cooperation");

        View.OnLongClickListener ChoiceTouchLisner =new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadow dragShadow = new DragShadow(v);

                v.startDrag(data,dragShadow,v,0);
                return false;
            }
        };

        View.OnDragListener ChoiceDragLisner=new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();

                TextView dragged = (TextView) event.getLocalState();

                DragAndDropAns.processDrag(v, dragEvent, dragged);

                return true;
            }
        };

        answ_1.setOnLongClickListener(ChoiceTouchLisner);
        answ_2.setOnLongClickListener(ChoiceTouchLisner);
        answ_3.setOnLongClickListener(ChoiceTouchLisner);
        answ_4.setOnLongClickListener(ChoiceTouchLisner);
        answ_5.setOnLongClickListener(ChoiceTouchLisner);

        blank_1.setOnDragListener(ChoiceDragLisner);
        blank_2.setOnDragListener(ChoiceDragLisner);
        blank_3.setOnDragListener(ChoiceDragLisner);
        blank_4.setOnDragListener(ChoiceDragLisner);
        blank_5.setOnDragListener(ChoiceDragLisner);

        return view;
}

}


