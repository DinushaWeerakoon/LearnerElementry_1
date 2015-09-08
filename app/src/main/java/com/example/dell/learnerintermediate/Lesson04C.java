package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

        final RadioButton rb1 = (RadioButton) view.findViewById(R.id.a);
        final RadioButton rb2 = (RadioButton) view.findViewById(R.id.b);
        final RadioButton rb3 = (RadioButton) view.findViewById(R.id.c);

        View.OnClickListener first_radio_listener1 = new View.OnClickListener(){
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
        };

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

        rb1.setOnClickListener(first_radio_listener1);
        rb2.setOnClickListener(first_radio_listener2);
        rb3.setOnClickListener(first_radio_listener3);
        reset.setOnClickListener(resetListener);

        return view;
    }
}
