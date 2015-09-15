package com.example.dell.learnerintermediate;

import android.content.ClipData;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson15D extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fr_less_15_d, container, false);

        final Processor dragAndDrop =new Processor();

        Button reset =(Button) view.findViewById(R.id.reset_btn);

        // targets
        final TextView txt1= (TextView)view.findViewById(R.id.txt_1);
        final TextView txt2= (TextView)view.findViewById(R.id.txt_2);
        final TextView txt3= (TextView)view.findViewById(R.id.txt_3);
        final TextView txt4= (TextView)view.findViewById(R.id.txt_4);
        final TextView txt5= (TextView)view.findViewById(R.id.txt_5);
        final TextView txt6= (TextView)view.findViewById(R.id.txt_6);
        final TextView txt7= (TextView)view.findViewById(R.id.txt_7);
        final TextView txt8= (TextView)view.findViewById(R.id.txt_8);

        final ColorStateList Oldcolor=txt1.getTextColors();

        txt1.setTag("When I'm a man I want to be.");
        txt2.setTag("The captain of a ship at sea.");
        txt3.setTag("I'll wear a suit of blue and gold,");
        txt4.setTag("My men will all be brave and bold.");
        txt5.setTag("I'll keep good watch by day and night.");
        txt6.setTag("In case an iceberg comes in sight.");
        txt7.setTag("And when the thunder starts to peal.");
        txt8.setTag("My men will lash me to the wheel.");

        /*txt1.setTag(8);
        txt2.setTag(7);
        txt3.setTag(5);
        txt4.setTag(1);
        txt5.setTag(3);
        txt6.setTag(2);
        txt7.setTag(6);
        txt8.setTag(4);*/


        View.OnLongClickListener ChoiceTouchLisner =new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(data,shadowBuilder,v,0);
                //return true;*/
                //DragShadow dragShadow = new DragShadow(v);

                //v.startDrag(data,dragShadow,v,0);
                return false;
            }
        };

        View.OnDragListener ChoiceDragLisner=new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();

                TextView dragged = (TextView) event.getLocalState();

                dragAndDrop.processDragOrder(v, dragEvent, dragged,Oldcolor);

                return true;
            }
        };

        View.OnClickListener resetLisner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("My men will lash me to the wheel.");
                txt2.setText("And when the thunder starts to peal.");
                txt3.setText("I'll keep good watch by day and night.");
                txt4.setText("When I'm a man I want to be.");
                txt5.setText("I'll wear a suit of blue and gold,");
                txt6.setText("The captain of a ship at sea.");
                txt7.setText("In case an iceberg comes in sight.");
                txt8.setText("My men will all be brave and bold.");

                txt1.setTextColor(Oldcolor);
                txt2.setTextColor(Oldcolor);
                txt3.setTextColor(Oldcolor);
                txt4.setTextColor(Oldcolor);
                txt5.setTextColor(Oldcolor);
                txt6.setTextColor(Oldcolor);
                txt7.setTextColor(Oldcolor);
                txt8.setTextColor(Oldcolor);
            }
        };

        txt1.setOnLongClickListener(ChoiceTouchLisner);
        txt2.setOnLongClickListener(ChoiceTouchLisner);
        txt3.setOnLongClickListener(ChoiceTouchLisner);
        txt4.setOnLongClickListener(ChoiceTouchLisner);
        txt5.setOnLongClickListener(ChoiceTouchLisner);
        txt6.setOnLongClickListener(ChoiceTouchLisner);
        txt7.setOnLongClickListener(ChoiceTouchLisner);
        txt8.setOnLongClickListener(ChoiceTouchLisner);

        txt1.setOnDragListener(ChoiceDragLisner);
        txt2.setOnDragListener(ChoiceDragLisner);
        txt3.setOnDragListener(ChoiceDragLisner);
        txt4.setOnDragListener(ChoiceDragLisner);
        txt5.setOnDragListener(ChoiceDragLisner);
        txt6.setOnDragListener(ChoiceDragLisner);
        txt7.setOnDragListener(ChoiceDragLisner);
        txt8.setOnDragListener(ChoiceDragLisner);

        reset.setOnClickListener(resetLisner);

        return view;


}}
