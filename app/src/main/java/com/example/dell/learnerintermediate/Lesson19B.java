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
public class Lesson19B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fr_less_19_b, container, false);

        final Processor dragAndDrop =new Processor();


        Button reset= (Button)view.findViewById(R.id.rest_btn);

        final TextView txt1= (TextView)view.findViewById(R.id.txt_1);
        final TextView txt2= (TextView)view.findViewById(R.id.txt_2);
        final TextView txt3= (TextView)view.findViewById(R.id.txt_3);
        final TextView txt4= (TextView)view.findViewById(R.id.txt_4);
        final TextView txt5= (TextView)view.findViewById(R.id.txt_5);
        final TextView txt6= (TextView)view.findViewById(R.id.txt_6);
        final TextView txt7= (TextView)view.findViewById(R.id.txt_7);
        final TextView txt8= (TextView)view.findViewById(R.id.txt_8);

        final ColorStateList Oldcolor=txt1.getTextColors();

        txt1.setTag("There's a hole in the bottom of the sea.");
        txt2.setTag("There's a log in the hole in the bottom of the sea.");
        txt3.setTag("There's a branch on the log in the hole in the bottom of the sea.");
        txt4.setTag("There's a bump on the branch on the log in the hole in the bottom of the sea.");
        txt5.setTag("There's a frog on the bump on the branch on the log in the hole in the bottom of the sea.");
        txt6.setTag("There's a tail on the frog on the bump on the branch on the log in the hole in the bottom of the sea.");
        txt7.setTag("There's a speck on the tail on the frog on the bump on the branch on the log in the hole in the bottom of the sea.");
        txt8.setTag("There's fleck on the speck on the tail on the frog on the bump on the brach on the log in the hole in the bottom of the sea.");

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

                dragAndDrop.processDragOrder(v, dragEvent, dragged,Oldcolor);

                return true;
            }
        };

        View.OnClickListener resetLisner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("There's a branch on the log in the hole in the bottom of the sea.");
                txt2.setText("There's a frog on the bump on the branch on the log in the hole in the bottom of the sea.");
                txt3.setText("There's a hole in the bottom of the sea.");
                txt4.setText("There's a speck on the tail on the frog on the bump on the branch on the log in the hole in the bottom of the sea.");
                txt5.setText("There's a log in the hole in the bottom of the sea.");
                txt6.setText("There's fleck on the speck on the tail on the frog on the bump on the brach on the log in the hole in the bottom of the sea.");
                txt7.setText("There's a bump on the branch on the log in the hole in the bottom of the sea.");
                txt8.setText("There's a tail on the frog on the bump on the branch on the log in the hole in the bottom of the sea.");

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
