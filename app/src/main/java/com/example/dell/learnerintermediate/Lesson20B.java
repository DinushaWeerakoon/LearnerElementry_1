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
import android.widget.RadioGroup;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson20B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fr_less_20_b, container, false);

        final Processor radio= new Processor();

        Button reset= (Button)view.findViewById(R.id.reset_btn);

        final RadioButton rb1_1 =(RadioButton) view.findViewById(R.id.ans_1_1);
        final RadioButton rb1_2 =(RadioButton) view.findViewById(R.id.ans_1_2);
        final RadioButton rb1_3 =(RadioButton) view.findViewById(R.id.ans_1_3);
        final RadioButton rb2_1 =(RadioButton) view.findViewById(R.id.ans_2_1);
        final RadioButton rb2_2 =(RadioButton) view.findViewById(R.id.ans_2_2);
        final RadioButton rb2_3 =(RadioButton) view.findViewById(R.id.ans_2_3);
        final RadioButton rb3_1 =(RadioButton) view.findViewById(R.id.ans_3_1);
        final RadioButton rb3_2 =(RadioButton) view.findViewById(R.id.ans_3_2);
        final RadioButton rb3_3 =(RadioButton) view.findViewById(R.id.ans_3_3);

        rb1_2.setTag("yes");
        rb2_2.setTag("yes");
        rb3_1.setTag("yes");
        rb1_1.setTag("None");
        rb1_3.setTag("None");
        rb2_1.setTag("None");
        rb2_3.setTag("None");
        rb3_2.setTag("None");
        rb3_3.setTag("None");

        View.OnClickListener clickListener1 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1_1.setTextColor(Color.BLACK);
                rb1_2.setTextColor(Color.BLACK);
                rb1_3.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        View.OnClickListener clickListener2 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2_1.setTextColor(Color.BLACK);
                rb2_2.setTextColor(Color.BLACK);
                rb2_3.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        View.OnClickListener clickListener3 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3_1.setTextColor(Color.BLACK);
                rb3_2.setTextColor(Color.BLACK);
                rb3_3.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        rb1_1.setOnClickListener(clickListener1);
        rb1_2.setOnClickListener(clickListener1);
        rb1_3.setOnClickListener(clickListener1);
        rb2_1.setOnClickListener(clickListener2);
        rb2_2.setOnClickListener(clickListener2);
        rb2_3.setOnClickListener(clickListener2);
        rb3_1.setOnClickListener(clickListener3);
        rb3_2.setOnClickListener(clickListener3);
        rb3_3.setOnClickListener(clickListener3);

        View.OnClickListener resetLisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1= (RadioGroup) view.findViewById(R.id.grp_1);
                RadioGroup rg2= (RadioGroup) view.findViewById(R.id.grp_2);
                RadioGroup rg3= (RadioGroup) view.findViewById(R.id.grp_3);

                rg1.clearCheck();
                rg2.clearCheck();
                rg3.clearCheck();

                rb1_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb1_2.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb1_3.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb2_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb2_2.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb2_3.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb3_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb3_2.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb3_3.setTextColor(getResources().getColor(R.color.ColorBlack));

            }
        };
        reset.setOnClickListener(resetLisnr);


        return view;


}}
