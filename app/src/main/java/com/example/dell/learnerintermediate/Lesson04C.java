package com.example.dell.learnerintermediate;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Lesson04C extends Fragment {


    @Override
     public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fr_less_04_c, container, false);

        final Processor proc= new Processor();


        final RadioButton rb1 = (RadioButton) view.findViewById(R.id.a);
        final RadioButton rb2 = (RadioButton) view.findViewById(R.id.b);
        final RadioButton rb3 = (RadioButton) view.findViewById(R.id.c);

        final RadioButton rb4 = (RadioButton) view.findViewById(R.id.a2);
        final RadioButton rb5 = (RadioButton) view.findViewById(R.id.b2);
        final RadioButton rb6 = (RadioButton) view.findViewById(R.id.c2);

        rb1.setTag("yes");
        rb5.setTag("yes");


        View.OnClickListener radioListener= new View.OnClickListener(){

            public void onClick(View v){
                  rb1.setTextColor(Color.BLACK);
                  rb2.setTextColor(Color.BLACK);
                  rb3.setTextColor(Color.BLACK);
                  proc.processRadioButton(v);
            }

        };


       /* View.OnClickListener first_radio_listener1 = new View.OnClickListener(){
            public void onClick(View v) {

                rb1.setTextColor(Color.GREEN);
                rb2.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);

            }
        };

        View.OnClickListener first_radio_listener2 = new View.OnClickListener(){
            public void onClick(View v) {

                rb2.setTextColor(Color.RED);
                rb1.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);


            }
        };

        View.OnClickListener first_radio_listener3 = new View.OnClickListener(){
            public void onClick(View v) {
                rb3.setTextColor(Color.RED);
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);

            }
        }; */


        final Button btn1= (Button) view.findViewById(R.id.button1);
        final Button btn2= (Button) view.findViewById(R.id.button2);
        final Button btn3= (Button) view.findViewById(R.id.button3);
        final Button btn4= (Button) view.findViewById(R.id.button4);
        final Button btn5= (Button) view.findViewById(R.id.button5);
        final Button btn6= (Button) view.findViewById(R.id.button6);
        final Button btn7= (Button) view.findViewById(R.id.button7);

        btn1.setTag("what");
        btn2.setTag("will");
        btn3.setTag("you");
        btn4.setTag("wear");
        btn5.setTag("to");
        btn6.setTag("the");
        btn7.setTag("party");

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

                Button dragged = (Button) event.getLocalState();

                proc.processDragOrder(v, dragEvent, dragged);

                return true;
            }
        };

        btn1.setOnLongClickListener(ChoiceTouchLisner);
        btn2.setOnLongClickListener(ChoiceTouchLisner);
        btn3.setOnLongClickListener(ChoiceTouchLisner);
        btn4.setOnLongClickListener(ChoiceTouchLisner);
        btn5.setOnLongClickListener(ChoiceTouchLisner);
        btn6.setOnLongClickListener(ChoiceTouchLisner);
        btn7.setOnLongClickListener(ChoiceTouchLisner);

        btn1.setOnDragListener(ChoiceDragLisner);
        btn2.setOnDragListener(ChoiceDragLisner);
        btn3.setOnDragListener(ChoiceDragLisner);
        btn4.setOnDragListener(ChoiceDragLisner);
        btn5.setOnDragListener(ChoiceDragLisner);
        btn6.setOnDragListener(ChoiceDragLisner);
        btn7.setOnDragListener(ChoiceDragLisner);


        Button reset= (Button) view.findViewById(R.id.reset);
        View.OnClickListener resetListener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);
                RadioGroup rg= (RadioGroup)view.findViewById(R.id.radio);
                rg.clearCheck();

            }
        };



        Button reset2= (Button) view.findViewById(R.id.reset2);
        View.OnClickListener resetListener2= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("party");
                btn1.setTextColor(Color.BLACK);
                btn2.setText("what");
                btn2.setTextColor(Color.BLACK);
                btn3.setText("wear");
                btn3.setTextColor(Color.BLACK);
                btn4.setText("the");
                btn4.setTextColor(Color.BLACK);
                btn5.setText("will");
                btn5.setTextColor(Color.BLACK);
                btn6.setText("to");
                btn6.setTextColor(Color.BLACK);
                btn7.setText("you");
                btn7.setTextColor(Color.BLACK);

            }
        };

        View.OnClickListener radioListener2= new View.OnClickListener(){

            public void onClick(View v){
                rb4.setTextColor(Color.BLACK);
                rb5.setTextColor(Color.BLACK);
                rb6.setTextColor(Color.BLACK);
                proc.processRadioButton(v);
            }

        };


        Button reset3= (Button) view.findViewById(R.id.reset3);
        View.OnClickListener resetListener3= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb4.setTextColor(Color.BLACK);
                rb5.setTextColor(Color.BLACK);
                rb6.setTextColor(Color.BLACK);
                RadioGroup rg2= (RadioGroup)view.findViewById(R.id.radio2);
                rg2.clearCheck();

            }
        };

        rb1.setOnClickListener(radioListener);
        rb2.setOnClickListener(radioListener);
        rb3.setOnClickListener(radioListener);
        rb4.setOnClickListener(radioListener2);
        rb5.setOnClickListener(radioListener2);
        rb6.setOnClickListener(radioListener2);

        reset.setOnClickListener(resetListener);
        reset2.setOnClickListener(resetListener2);
        reset3.setOnClickListener(resetListener3);

        return view;
    }
}
