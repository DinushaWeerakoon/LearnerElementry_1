package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson22B extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view= inflater.inflate(R.layout.fr_less_22_b, container, false);

        final Processor radio= new Processor();

        Button reset= (Button)view.findViewById(R.id.reset_btn1);
        Button reset2= (Button)view.findViewById(R.id.reset_btn2);
        Button check1= (Button)view.findViewById(R.id.Cbtn_1);
        Button check2= (Button)view.findViewById(R.id.Cbtn_2);
        Button check3= (Button)view.findViewById(R.id.Cbtn_3);


        final RadioButton rb1_1 =(RadioButton) view.findViewById(R.id.ans_1_1);
        final RadioButton rb1_2 =(RadioButton) view.findViewById(R.id.ans_1_2);
        final RadioButton rb1_3 =(RadioButton) view.findViewById(R.id.ans_1_3);
        final RadioButton rb1_4 =(RadioButton) view.findViewById(R.id.ans_1_4);

        rb1_3.setTag("yes");
        rb1_1.setTag("None");
        rb1_2.setTag("None");
        rb1_4.setTag("None");

        View.OnClickListener clickListener1 =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1_1.setTextColor(Color.BLACK);
                rb1_2.setTextColor(Color.BLACK);
                rb1_3.setTextColor(Color.BLACK);
                rb1_4.setTextColor(Color.BLACK);
                radio.processRadioButton(v);
            }
        };

        rb1_1.setOnClickListener(clickListener1);
        rb1_2.setOnClickListener(clickListener1);
        rb1_3.setOnClickListener(clickListener1);
        rb1_4.setOnClickListener(clickListener1);

        View.OnClickListener resetLisnr1= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1= (RadioGroup) view.findViewById(R.id.grp_1);

                rg1.clearCheck();

                rb1_1.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb1_2.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb1_3.setTextColor(getResources().getColor(R.color.ColorBlack));
                rb1_4.setTextColor(getResources().getColor(R.color.ColorBlack));

            }
        };
        reset.setOnClickListener(resetLisnr1);


        final EditText a1= (EditText)view.findViewById(R.id.blnk_a_1);
        final EditText a2= (EditText)view.findViewById(R.id.blnk_a_2);
        final EditText a3= (EditText)view.findViewById(R.id.blnk_a_3);
        final EditText a4= (EditText)view.findViewById(R.id.blnk_a_4);
        final EditText a5= (EditText)view.findViewById(R.id.blnk_a_5);
        final EditText a6= (EditText)view.findViewById(R.id.blnk_a_6);

        final EditText b1= (EditText)view.findViewById(R.id.blnk_b_1);
        final EditText b2= (EditText)view.findViewById(R.id.blnk_b_2);
        final EditText b3= (EditText)view.findViewById(R.id.blnk_b_3);
        final EditText b4= (EditText)view.findViewById(R.id.blnk_b_4);

        final EditText c1= (EditText)view.findViewById(R.id.blnk_c_1);
        final EditText c2= (EditText)view.findViewById(R.id.blnk_c_2);
        final EditText c3= (EditText)view.findViewById(R.id.blnk_c_3);
        final EditText c4= (EditText)view.findViewById(R.id.blnk_c_4);

        a1.setTag("p");
        a2.setTag("n");
        a3.setTag("c");
        a4.setTag("t");
        a5.setTag("u");
        a6.setTag("a");

        b1.setTag("e");
        b2.setTag("s");
        b3.setTag("e");
        b4.setTag("c");

        c1.setTag("l");
        c2.setTag("s");
        c3.setTag("t");
        c4.setTag("e");

        View.OnClickListener check1lisner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(a1.getText().toString().equals(a1.getTag())){a1.setTextColor(Color.GREEN); a1.setFocusable(false);}
                    else if(a1.getText().toString().equals("")){ }
                    else {a1.setTextColor(Color.RED);}

                    if(a2.getText().toString().equals(a2.getTag())){a2.setTextColor(Color.GREEN);  a2.setFocusable(false);}
                    else if(a2.getText().toString().equals("")){ }
                    else {a2.setTextColor(Color.RED);}

                    if(a3.getText().toString().equals(a3.getTag())){a3.setTextColor(Color.GREEN);  a3.setFocusable(false);}
                    else if(a3.getText().toString().equals("")){}
                    else {a3.setTextColor(Color.RED);}

                    if(a4.getText().toString().equals(a4.getTag())){a4.setTextColor(Color.GREEN);  a4.setFocusable(false);}
                    else if(a4.getText().toString().equals("")){ }
                    else {a4.setTextColor(Color.RED);}

                    if(a5.getText().toString().equals(a5.getTag())){a5.setTextColor(Color.GREEN);  a5.setFocusable(false);}
                    else if(a5.getText().toString().equals("")){ }
                    else {a5.setTextColor(Color.RED);}

                    if(a6.getText().toString().equals(a6.getTag())){a6.setTextColor(Color.GREEN);  a6.setFocusable(false);}
                    else if(a6.getText().toString().equals("")){ }
                    else {a6.setTextColor(Color.RED);}

                    if(a1.getText().toString().equals("") | a2.getText().toString().equals("") | a3.getText().toString().equals("") | a4.getText().toString().equals("") | a5.getText().toString().equals("") | a6.getText().toString().equals("")){
                        Toast.makeText(getContext(),"Please enter characters",Toast.LENGTH_LONG).show();
                    }

                }catch (NullPointerException e){
                    Toast.makeText(getContext(),"Please enter all characters",Toast.LENGTH_LONG).show();
                }

            }
        };
        check1.setOnClickListener(check1lisner);

        View.OnClickListener check2lisner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(b1.getText().toString().equals(b1.getTag())){b1.setTextColor(Color.GREEN);  b1.setFocusable(false);}
                    else if(b1.getText().toString().equals("")){ }
                    else {b1.setTextColor(Color.RED);}

                    if(b2.getText().toString().equals(b2.getTag())){b2.setTextColor(Color.GREEN);  b2.setFocusable(false);}
                    else if(b2.getText().toString().equals("")){ }
                    else {b2.setTextColor(Color.RED);}

                    if(b3.getText().toString().equals(b3.getTag())){b3.setTextColor(Color.GREEN);  b3.setFocusable(false);}
                    else if(b3.getText().toString().equals("")){}
                    else {b3.setTextColor(Color.RED);}

                    if(b4.getText().toString().equals(b4.getTag())){b4.setTextColor(Color.GREEN);  b4.setFocusable(false);}
                    else if(b4.getText().toString().equals("")){ }
                    else {b4.setTextColor(Color.RED);}

                    if(b1.getText().toString().equals("") | b2.getText().toString().equals("") | b3.getText().toString().equals("") | b4.getText().toString().equals("")){
                        Toast.makeText(getContext(),"Please enter characters",Toast.LENGTH_LONG).show();
                    }

                }catch (NullPointerException e){
                    Toast.makeText(getContext(),"Please enter all characters",Toast.LENGTH_LONG).show();
                }

            }
        };
        check2.setOnClickListener(check2lisner);

        View.OnClickListener check3lisner= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if(c1.getText().toString().equals(c1.getTag())) {
                        c1.setTextColor(Color.GREEN);  c1.setFocusable(false);}
                    else if(c1.getText().toString().equals("")){ } else {
                        c1.setTextColor(Color.RED);}

                    if(c2.getText().toString().equals(c2.getTag())) {
                        c2.setTextColor(Color.GREEN); c2.setFocusable(false);}
                    else if(c2.getText().toString().equals("")){ } else {
                        c2.setTextColor(Color.RED);}

                    if(c3.getText().toString().equals(c3.getTag())) {
                        c3.setTextColor(Color.GREEN);  c3.setFocusable(false);}
                    else if(c3.getText().toString().equals("")){} else {
                        c3.setTextColor(Color.RED);}

                    if(c4.getText().toString().equals(c4.getTag())) {
                        c4.setTextColor(Color.GREEN);  c4.setFocusable(false);}
                    else if(c4.getText().toString().equals("")){ } else {
                        c4.setTextColor(Color.RED);}

                    if(c1.getText().toString().equals("") | c2.getText().toString().equals("") | c3.getText().toString().equals("") | c4.getText().toString().equals("")){
                        Toast.makeText(getContext(),"Please enter characters",Toast.LENGTH_LONG).show();
                    }

                }catch (NullPointerException e){
                    Toast.makeText(getContext(),"Please enter all characters",Toast.LENGTH_LONG).show();
                }

            }
        };
        check3.setOnClickListener(check3lisner);

     /*   View.OnFocusChangeListener changelisnr= new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(!hasFocus){
                    radio.processOnFocusEvent(v);
                }
            }
        };



        a1.setOnFocusChangeListener(changelisnr);
        a2.setOnFocusChangeListener(changelisnr);
        a3.setOnFocusChangeListener(changelisnr);
        a4.setOnFocusChangeListener(changelisnr);
        a5.setOnFocusChangeListener(changelisnr);
        a6.setOnFocusChangeListener(changelisnr);

        b1.setOnFocusChangeListener(changelisnr);
        b2.setOnFocusChangeListener(changelisnr);
        b3.setOnFocusChangeListener(changelisnr);
        b4.setOnFocusChangeListener(changelisnr);

        c1.setOnFocusChangeListener(changelisnr);
        c2.setOnFocusChangeListener(changelisnr);
        c3.setOnFocusChangeListener(changelisnr);
        c4.setOnFocusChangeListener(changelisnr);*/

        View.OnClickListener resetlisnr2= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1.setText("");
                a1.setFocusable(true);
                a1.setClickable(true);
                a1.setFocusableInTouchMode(true);
                a1.setTextColor(Color.BLACK);

                a2.setText("");
                a2.setFocusable(true);
                a2.setClickable(true);
                a2.setFocusableInTouchMode(true);
                a2.setTextColor(Color.BLACK);

                a3.setText("");
                a3.setFocusable(true);
                a3.setClickable(true);
                a3.setFocusableInTouchMode(true);
                a3.setTextColor(Color.BLACK);

                a4.setText("");
                a4.setFocusable(true);
                a4.setClickable(true);
                a4.setFocusableInTouchMode(true);
                a4.setTextColor(Color.BLACK);

                a5.setText("");
                a5.setFocusable(true);
                a5.setClickable(true);
                a5.setFocusableInTouchMode(true);
                a5.setTextColor(Color.BLACK);

                a6.setText("");
                a6.setFocusable(true);
                a6.setClickable(true);
                a6.setFocusableInTouchMode(true);
                a6.setTextColor(Color.BLACK);

                b1.setText("");
                b1.setFocusable(true);
                b1.setClickable(true);
                b1.setFocusableInTouchMode(true);
                b1.setTextColor(Color.BLACK);

                b2.setText("");
                b2.setFocusable(true);
                b2.setClickable(true);
                b2.setFocusableInTouchMode(true);
                b2.setTextColor(Color.BLACK);

                b3.setText("");
                b3.setFocusable(true);
                b3.setClickable(true);
                b3.setFocusableInTouchMode(true);
                b3.setTextColor(Color.BLACK);

                b4.setText("");
                b4.setFocusable(true);
                b4.setClickable(true);
                b4.setFocusableInTouchMode(true);
                b4.setTextColor(Color.BLACK);

                c1.setText("");
                c1.setFocusable(true);
                c1.setClickable(true);
                c1.setFocusableInTouchMode(true);
                c1.setTextColor(Color.BLACK);

                c2.setText("");
                c2.setFocusable(true);
                c2.setClickable(true);
                c2.setFocusableInTouchMode(true);
                c2.setTextColor(Color.BLACK);

                c3.setText("");
                c3.setFocusable(true);
                c3.setClickable(true);
                c3.setFocusableInTouchMode(true);
                c3.setTextColor(Color.BLACK);

                c4.setText("");
                c4.setFocusable(true);
                c4.setClickable(true);
                c4.setFocusableInTouchMode(true);
                c4.setTextColor(Color.BLACK);
            }
        };
        reset2.setOnClickListener(resetlisnr2);

        return view;


    }}
