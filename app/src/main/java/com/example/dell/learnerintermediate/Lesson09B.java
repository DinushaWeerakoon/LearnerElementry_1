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
public class Lesson09B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fr_less_09_b, container, false);

       final TextView tx1= (TextView) view.findViewById(R.id.txtLine21);
       final TextView tx2= (TextView) view.findViewById(R.id.txtLine31);
        final Button rb = (Button) view.findViewById(R.id.button);


        final ColorStateList oldColors =  tx1.getTextColors(); //save original colors

        tx1.setTag("dis");
        tx2.setTag("ir");

        TextView tx4= (TextView) view.findViewById(R.id.txtLine4);
        TextView tx5= (TextView) view.findViewById(R.id.txtLine5);
        TextView tx6= (TextView) view.findViewById(R.id.txtLine6);
        TextView tx7= (TextView) view.findViewById(R.id.txtLine7);
        TextView tx8= (TextView) view.findViewById(R.id.txtLine8);
        TextView tx9= (TextView) view.findViewById(R.id.txtLine9);
        TextView tx10= (TextView) view.findViewById(R.id.txtLine10);
        TextView tx11= (TextView) view.findViewById(R.id.txtLine11);

        //processDrag(view,tx1);

        final Processor DragAndDropAns =new Processor();



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

        View.OnClickListener firstlistener = new View.OnClickListener(){
            public void onClick(View v) {

                tx1.setText("............");
                tx1.setTextColor(oldColors);
                tx2.setText("............");
                tx2.setTextColor(oldColors);
                tx1.setTag("dis");
                tx2.setTag("ir");

            }};

        tx4.setOnLongClickListener(ChoiceTouchLisner);
        tx5.setOnLongClickListener(ChoiceTouchLisner);
        tx6.setOnLongClickListener(ChoiceTouchLisner);
        tx7.setOnLongClickListener(ChoiceTouchLisner);
        tx8.setOnLongClickListener(ChoiceTouchLisner);
        tx9.setOnLongClickListener(ChoiceTouchLisner);
        tx10.setOnLongClickListener(ChoiceTouchLisner);
        tx11.setOnLongClickListener(ChoiceTouchLisner);


        tx1.setOnDragListener(ChoiceDragLisner);
        tx2.setOnDragListener(ChoiceDragLisner);

        rb.setOnClickListener(firstlistener);





        return view;

}

}
