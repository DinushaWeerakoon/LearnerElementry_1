package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson11B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view =inflater.inflate(R.layout.fr_less_11_b, container, false);

        final RadioButton rb1 = (RadioButton) view.findViewById(R.id.radioButton4);
        final RadioButton rb2 = (RadioButton) view.findViewById(R.id.radioButton5);
        final RadioButton rb3 = (RadioButton) view.findViewById(R.id.radioButton6);
        final RadioButton rb4 = (RadioButton) view.findViewById(R.id.radioButton7);
        final RadioButton rb5 = (RadioButton) view.findViewById(R.id.radioButton3);
        final RadioButton rb6 = (RadioButton) view.findViewById(R.id.radioButton8);

        final Button rb = (Button) view.findViewById(R.id.button);

        rb1.setTag("yes");
        rb4.setTag("yes");


       final Processor pro= new Processor();



        View.OnClickListener first_radio_listener1 = new View.OnClickListener(){
            public void onClick(View v) {

                pro.processRadioButton(v);

            }
        };



        rb1.setOnClickListener(first_radio_listener1);
        rb2.setOnClickListener(first_radio_listener1);
        rb3.setOnClickListener(first_radio_listener1);
        rb4.setOnClickListener(first_radio_listener1);
        rb5.setOnClickListener(first_radio_listener1);
        rb6.setOnClickListener(first_radio_listener1);
        return view;
}}
