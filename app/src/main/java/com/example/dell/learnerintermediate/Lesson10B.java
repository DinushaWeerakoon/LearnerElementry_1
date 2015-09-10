package com.example.dell.learnerintermediate;

import android.content.ClipData;
import android.content.res.ColorStateList;
import android.graphics.Color;
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
public class Lesson10B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      final View view = inflater.inflate(R.layout.fr_less_10_b, container, false);


        final TextView tx1= (TextView) view.findViewById(R.id.txtLine3);
        final TextView tx2= (TextView) view.findViewById(R.id.txtLine4);
        final TextView tx3= (TextView) view.findViewById(R.id.txtLine5);
        final TextView tx4= (TextView) view.findViewById(R.id.txtLine6);
        final TextView tx5= (TextView) view.findViewById(R.id.txtLine7);
        final Button rb = (Button) view.findViewById(R.id.button);


        TextView tx6= (TextView) view.findViewById(R.id.txtLine8);
        TextView tx7= (TextView) view.findViewById(R.id.txtLine9);
        TextView tx8= (TextView) view.findViewById(R.id.txtLine10);
        TextView tx9= (TextView) view.findViewById(R.id.txtLine11);
        TextView tx10= (TextView) view.findViewById(R.id.txtLine12);
        TextView tx11= (TextView) view.findViewById(R.id.txtLine11);
      final   TextView tx12= (TextView) view.findViewById(R.id.txtLine15);
        final TextView tx13= (TextView) view.findViewById(R.id.txtLine21);
        TextView tx14= (TextView) view.findViewById(R.id.txtLine17);
        TextView tx15= (TextView) view.findViewById(R.id.txtLine18);
        TextView tx16= (TextView) view.findViewById(R.id.txtLine23);
        TextView tx17= (TextView) view.findViewById(R.id.txtLine24);

        final ColorStateList oldColors =  tx1.getTextColors();


        tx1.setTag("George ");
        tx2.setTag("neither ");
        tx3.setTag("smokes ");
        tx4.setTag("nor ");
        tx5.setTag("drinks ");

        final Processor DragAndDropAns =new Processor();

        View.OnLongClickListener ChoiceTouchLisner =new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("", "");
                DragShadow dragShadow = new DragShadow(v);

                v.startDrag(data, dragShadow, v, 0);
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

        View.OnClickListener firstlistener1 = new View.OnClickListener(){
            public void onClick(View v) {



                tx12.setText("Either ");
                tx12.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };


        View.OnClickListener firstlistener2 = new View.OnClickListener(){
            public void onClick(View v) {



                tx12.setText("Neither ");
                tx12.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };


        View.OnClickListener firstlistener3 = new View.OnClickListener(){
            public void onClick(View v) {



                tx13.setText("Either ");
                tx13.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };


        View.OnClickListener firstlistener4 = new View.OnClickListener(){
            public void onClick(View v) {



                tx13.setText("Neither ");
                tx13.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };


        View.OnClickListener firstlistener = new View.OnClickListener(){
            public void onClick(View v) {

                tx1.setText(".........  ");
                tx1.setTextColor(oldColors);
                tx2.setText(".........  ");
                tx2.setTextColor(oldColors);
                tx3.setText(".........  ");
                tx3.setTextColor(oldColors);
                tx4.setText(".........  ");
                tx4.setTextColor(oldColors);
                tx5.setText(".........  ");
                tx5.setTextColor(oldColors);
                tx1.setTag("neither ");
                tx2.setTag("George ");
                tx3.setTag("smokes ");
                tx4.setTag("drinks ");
                tx5.setTag("nor");

                tx12.setText("''........... ");
                tx12.setTextColor(oldColors);
                tx13.setText("........... ");
                tx13.setTextColor(oldColors);

            }};


        tx6.setOnLongClickListener(ChoiceTouchLisner);
        tx7.setOnLongClickListener(ChoiceTouchLisner);
        tx8.setOnLongClickListener(ChoiceTouchLisner);
        tx9.setOnLongClickListener(ChoiceTouchLisner);
        tx10.setOnLongClickListener(ChoiceTouchLisner);
        tx11.setOnLongClickListener(ChoiceTouchLisner);


        tx1.setOnDragListener(ChoiceDragLisner);
        tx2.setOnDragListener(ChoiceDragLisner);
        tx3.setOnDragListener(ChoiceDragLisner);
        tx4.setOnDragListener(ChoiceDragLisner);
        tx5.setOnDragListener(ChoiceDragLisner);

        tx14.setOnClickListener(firstlistener1);
        tx15.setOnClickListener(firstlistener2);
        tx16.setOnClickListener(firstlistener3);
        tx17.setOnClickListener(firstlistener4);


        rb.setOnClickListener(firstlistener);


        return view;
    }}
