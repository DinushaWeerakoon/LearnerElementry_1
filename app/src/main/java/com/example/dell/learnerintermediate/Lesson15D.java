package com.example.dell.learnerintermediate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson15D extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fr_less_15_d, container, false);

        // targets
        TextView txt1= (TextView)view.findViewById(R.id.txt_1);
        TextView txt2= (TextView)view.findViewById(R.id.txt_1);
        TextView txt3= (TextView)view.findViewById(R.id.txt_1);
        TextView txt4= (TextView)view.findViewById(R.id.txt_1);
        TextView txt5= (TextView)view.findViewById(R.id.txt_1);
        TextView txt6= (TextView)view.findViewById(R.id.txt_1);
        TextView txt7= (TextView)view.findViewById(R.id.txt_1);
        TextView txt8= (TextView)view.findViewById(R.id.txt_1);

        txt1.setTag("When I'm a man I want to be.");
        txt2.setTag("The captain of a ship at sea.");
        txt3.setTag("I'll wear a suit of blue and gold,");
        txt4.setTag("My men wii all be brave and bold.");
        txt5.setTag("I'll keep good watch by day and night.");
        txt6.setTag("In case an iceberg comes in sight.");
        txt7.setTag("And when the thunder starts to peal.");
        txt8.setTag("My men will lash me to the wheel.");

        return view;


}}
