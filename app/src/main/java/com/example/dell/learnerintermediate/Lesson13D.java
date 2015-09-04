package com.example.dell.learnerintermediate;

import android.content.DialogInterface;
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
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson13D extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      final View view = inflater.inflate(R.layout.fr_less_13_d, container, false);

       final RadioButton rb1 = (RadioButton) view.findViewById(R.id.radioButton4);
        final RadioButton rb2 = (RadioButton) view.findViewById(R.id.radioButton5);
        final RadioButton rb3 = (RadioButton) view.findViewById(R.id.radioButton6);
        final RadioButton rb4 = (RadioButton) view.findViewById(R.id.radioButton7);
        final Button rb5 = (Button) view.findViewById(R.id.button);
        //final RadioButton rb4 = (RadioButton) view.findViewById(R.id.radioButton7);


        View.OnClickListener first_radio_listener1 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.textView2);
                rb1.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_radio_listener2 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.textView2);
                rb2.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_radio_listener3 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.textView3);
                rb3.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_radio_listener4 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.textView3);
                rb4.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_radio_listener5 = new View.OnClickListener(){
            public void onClick(View v) {

               RadioGroup ragr1= (RadioGroup) view.findViewById(R.id.rg1);
                RadioGroup ragr2= (RadioGroup) view.findViewById(R.id.rg2);
                ragr1.clearCheck();
                ragr2.clearCheck();
                rb1.setTextColor(Color.BLACK);
                rb2.setTextColor(Color.BLACK);
                rb3.setTextColor(Color.BLACK);
                rb4.setTextColor(Color.BLACK);


                //Your Implementaions...
            }
        };


        rb1.setOnClickListener(first_radio_listener1);
        rb2.setOnClickListener(first_radio_listener2);
        rb3.setOnClickListener(first_radio_listener3);
        rb4.setOnClickListener(first_radio_listener4);
        rb5.setOnClickListener(first_radio_listener5);



        return view;  }


}
