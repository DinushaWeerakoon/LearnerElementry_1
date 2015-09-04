package com.example.dell.learnerintermediate;

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

        final RadioButton rb1_1 =(RadioButton) view.findViewById(R.id.ans_1_1);
        final RadioButton rb1_2 =(RadioButton) view.findViewById(R.id.ans_1_2);
        final RadioButton rb2_1 =(RadioButton) view.findViewById(R.id.ans_2_1);
        final RadioButton rb2_2 =(RadioButton) view.findViewById(R.id.ans_2_2);
        final RadioButton rb3_1 =(RadioButton) view.findViewById(R.id.ans_3_1);
        final RadioButton rb3_2 =(RadioButton) view.findViewById(R.id.ans_3_2);

        View.OnClickListener rb11Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1_1.setTextColor(getResources().getColor(R.color.ColorErr));
                rb1_2.setTextColor(getResources().getColor(R.color.ColorDefault));
            }
        };
        rb1_1.setOnClickListener(rb11Lisnr);

        View.OnClickListener rb12Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1_2.setTextColor(getResources().getColor(R.color.ColorExample));
                rb1_1.setTextColor(getResources().getColor(R.color.ColorDefault));
            }
        };
        rb1_2.setOnClickListener(rb12Lisnr);

        View.OnClickListener rb21Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2_1.setTextColor(getResources().getColor(R.color.ColorErr));
                rb2_2.setTextColor(getResources().getColor(R.color.ColorDefault));
            }
        };
        rb2_1.setOnClickListener(rb21Lisnr);

        View.OnClickListener rb22Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2_1.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb2_2.setTextColor(getResources().getColor(R.color.ColorExample));
            }
        };
        rb2_2.setOnClickListener(rb22Lisnr);

        View.OnClickListener rb31Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3_1.setTextColor(getResources().getColor(R.color.ColorExample));
                rb3_2.setTextColor(getResources().getColor(R.color.ColorDefault));
            }
        };
        rb3_1.setOnClickListener(rb31Lisnr);

        View.OnClickListener rb32Lisnr= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3_1.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb3_2.setTextColor(getResources().getColor(R.color.ColorErr));
            }
        };
        rb3_2.setOnClickListener(rb32Lisnr);



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

                rb1_1.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb1_2.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb2_1.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb2_2.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb3_1.setTextColor(getResources().getColor(R.color.ColorDefault));
                rb3_2.setTextColor(getResources().getColor(R.color.ColorDefault));
            }
        };
        resetBtn.setOnClickListener(resetLisnr);
        return view;

    }




}
