package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson17B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fr_less_17_b, container, false);

        final Processor radio= new Processor();

        final RadioButton rb1_1 =(RadioButton) view.findViewById(R.id.ans_1_1);
        final RadioButton rb1_2 =(RadioButton) view.findViewById(R.id.ans_1_2);
        final RadioButton rb2_1 =(RadioButton) view.findViewById(R.id.ans_2_1);
        final RadioButton rb2_2 =(RadioButton) view.findViewById(R.id.ans_2_2);
        final RadioButton rb3_1 =(RadioButton) view.findViewById(R.id.ans_3_1);
        final RadioButton rb3_2 =(RadioButton) view.findViewById(R.id.ans_3_2);

        rb1_1.setTag("None");
        rb1_2.setTag("yes");
        rb2_1.setTag("None");
        rb2_2.setTag("yes");
        rb3_1.setTag("yes");
        rb3_2.setTag("None");
        String qst1="1. You'd better ask the other person whether they are free to speak now, if you receive the call";
        String qst2="2. You ask the other person whether they are free to speak now, at the beginning of the call";
        String qst3="3. You better thank the other person for her/his time if you initiate the call";

        View.OnClickListener clickListener1 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1_1.setTextColor(Color.BLACK);
                rb1_2.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        View.OnClickListener clickListener2 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2_1.setTextColor(Color.BLACK);
                rb2_2.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        View.OnClickListener clickListener3 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3_1.setTextColor(Color.BLACK);
                rb3_2.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        rb1_1.setOnClickListener(clickListener1);
        rb1_2.setOnClickListener(clickListener1);
        rb2_1.setOnClickListener(clickListener2);
        rb2_2.setOnClickListener(clickListener2);
        rb3_1.setOnClickListener(clickListener3);
        rb3_2.setOnClickListener(clickListener3);





        Button resetBtn = (Button) view.findViewById(R.id.reset_btn);
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
                rb2_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb2_2.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb3_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb3_2.setTextColor(getResources().getColor(R.color.ColorBlack));
            }
        };
        resetBtn.setOnClickListener(resetLisnr);
        return view;

    }




}
