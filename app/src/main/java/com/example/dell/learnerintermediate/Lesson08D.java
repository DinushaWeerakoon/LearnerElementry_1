package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson08D extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      final   View view= inflater.inflate(R.layout.fr_less_08_d, container, false);

        TextView tx1= (TextView) view.findViewById(R.id.txtLine3);
        TextView tx2= (TextView) view.findViewById(R.id.txtLine10);
        TextView tx3= (TextView) view.findViewById(R.id.txtLine12);
        TextView tx4= (TextView) view.findViewById(R.id.txtLine9);
        TextView tx5= (TextView) view.findViewById(R.id.txtLine14);
        final Button rb = (Button) view.findViewById(R.id.button2);

           final String ab="a";



        View.OnClickListener first_listener1 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.txtLine3);

                tx.setText(ab);
                tx.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_listener2 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.txtLine3);

                tx.setText("some");
                tx.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_listener4 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.txtLine7);

                tx.setText("informations");
                tx.setTextColor(Color.RED);
                //Your Implementaions...
            }
        };

        View.OnClickListener first_listener3 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx= (TextView) view.findViewById(R.id.txtLine7);

                tx.setText("information");
                tx.setTextColor(Color.GREEN);
                //Your Implementaions...
            }
        };


        View.OnClickListener first_listener5 = new View.OnClickListener(){
            public void onClick(View v) {

                TextView tx1= (TextView) view.findViewById(R.id.txtLine7);
                TextView tx2= (TextView) view.findViewById(R.id.txtLine3);

                tx1.setText("..................");
                tx1.setTextColor(Color.BLACK);
                tx2.setText(".................");
                tx2.setTextColor(Color.BLACK);
                //Your Implementaions...
            }
        };



             tx2.setOnClickListener(first_listener1);
             tx3.setOnClickListener(first_listener2);
        tx4.setOnClickListener(first_listener3);
        tx5.setOnClickListener(first_listener4);
        rb.setOnClickListener(first_listener5 );
        return view;


    }}
