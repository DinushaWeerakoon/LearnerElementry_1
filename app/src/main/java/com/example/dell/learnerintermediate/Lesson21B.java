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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson21B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fr_less_21_b, container, false);

        final Processor radio= new Processor();

        final TextView txt1= (TextView) view.findViewById(R.id.txt_1);
        final TextView txt2= (TextView) view.findViewById(R.id.txt_2);
        final TextView txt3= (TextView) view.findViewById(R.id.txt_3);
        final TextView txt4= (TextView) view.findViewById(R.id.txt_4);
        final TextView txt5= (TextView) view.findViewById(R.id.txt_5);
        final TextView txt6= (TextView) view.findViewById(R.id.txt_6);
        final TextView txt7= (TextView) view.findViewById(R.id.txt_7);

        final ColorStateList Oldcolor=txt1.getTextColors();


        txt1.setTag("Choose an e-card company.There are many companies including 123 greetings,yahoo,hallmark etc.");
        txt2.setTag("Decide on your e-card to match the situation.Preview the cards and select the best.");
        txt3.setTag("Type and add a personal note to your card.Remember,it should be short.");
        txt4.setTag("Select the option and preview your entire e-card.'Edit' the card if you have any mistakes.");
        txt5.setTag("Include your email recipients.");
        txt6.setTag("Select the option to receive a notice when the recipients open the cards.");
        txt7.setTag("Send your e-card after sending up the date.");


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


                radio.processDragOrder(v, dragEvent, dragged,Oldcolor);

                return true;
            }
        };

        txt1.setOnLongClickListener(ChoiceTouchLisner);
        txt2.setOnLongClickListener(ChoiceTouchLisner);
        txt3.setOnLongClickListener(ChoiceTouchLisner);
        txt4.setOnLongClickListener(ChoiceTouchLisner);
        txt5.setOnLongClickListener(ChoiceTouchLisner);
        txt6.setOnLongClickListener(ChoiceTouchLisner);
        txt7.setOnLongClickListener(ChoiceTouchLisner);

        txt1.setOnDragListener(ChoiceDragLisner);
        txt2.setOnDragListener(ChoiceDragLisner);
        txt3.setOnDragListener(ChoiceDragLisner);
        txt4.setOnDragListener(ChoiceDragLisner);
        txt5.setOnDragListener(ChoiceDragLisner);
        txt6.setOnDragListener(ChoiceDragLisner);
        txt7.setOnDragListener(ChoiceDragLisner);

        final RadioButton rb1= (RadioButton)view.findViewById(R.id.btn_1);
        final RadioButton rb2= (RadioButton)view.findViewById(R.id.btn_2);
        final RadioButton rb3= (RadioButton)view.findViewById(R.id.btn_3);
        final RadioButton rb4= (RadioButton)view.findViewById(R.id.btn_4);
        final RadioButton rb5= (RadioButton)view.findViewById(R.id.btn_5);
        final RadioButton rb6= (RadioButton)view.findViewById(R.id.btn_6);

        rb4.setTag("yes");

        Button reset1= (Button) view.findViewById(R.id.reset_btn1);
        Button reset2= (Button) view.findViewById(R.id.reset_btn);

        View.OnClickListener radiolistner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);
                rb4.setTextColor(Color.BLACK);
                rb5.setTextColor(Color.BLACK);
                rb6.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        View.OnClickListener resetLisner1= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("Include your email recipients.");
                txt2.setText("Type and add a personal note to your card.Remember,it should be short.");
                txt3.setText("Decide on your e-card to match the situation.Preview the cards and select the best.");
                txt4.setText("Select the option and preview your entire e-card.'Edit' the card if you have any mistakes.");
                txt5.setText("Send your e-card after sending up the date.");
                txt6.setText("Choose an e-card company.There are many companies including 123 greetings,yahoo,hallmark etc.");
                txt7.setText("Select the option to receive a notice when the recipients open the cards.");

                txt1.setTextColor(Oldcolor);
                txt2.setTextColor(Oldcolor);
                txt3.setTextColor(Oldcolor);
                txt4.setTextColor(Oldcolor);
                txt5.setTextColor(Oldcolor);
                txt6.setTextColor(Oldcolor);
                txt7.setTextColor(Oldcolor);
            }
        };


        View.OnClickListener resetlisnr2= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);
                rb4.setTextColor(Color.BLACK);
                rb5.setTextColor(Color.BLACK);
                rb6.setTextColor(Color.BLACK);

                RadioGroup rg1= (RadioGroup)view.findViewById(R.id.grp);
                rg1.clearCheck();

            }
        };
        rb1.setOnClickListener(radiolistner);
        rb2.setOnClickListener(radiolistner);
        rb3.setOnClickListener(radiolistner);
        rb4.setOnClickListener(radiolistner);
        rb5.setOnClickListener(radiolistner);
        rb6.setOnClickListener(radiolistner);
        reset2.setOnClickListener(resetlisnr2);

        reset1.setOnClickListener(resetLisner1);
        return view;

    }}
