package com.example.dell.learnerintermediate;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ucsc on 9/3/2015.
 */
public class Processor {

    public int tag=1;
    public void processDrag(View v, int dragEvent, TextView dragged){

        switch (dragEvent){

            case DragEvent.ACTION_DRAG_ENTERED:break;

            case DragEvent.ACTION_DRAG_EXITED:break;

            case DragEvent.ACTION_DROP:

                TextView target = (TextView) v;

                if(!target.getTag().equals("done")) {
                    target.setText(dragged.getText());

                    if (target.getText().equals(target.getTag())) {
                        target.setBackgroundColor(Color.parseColor("#689F38"));
                        target.setTag("done");
                        dragged.setVisibility(View.INVISIBLE);
                    } else {
                        target.setBackgroundColor(Color.RED);
                    }
                }
                break;
        }

    }

    public void processDragOrder(View v, int dragEvent, TextView dragged,ColorStateList Oldcolor){

        switch (dragEvent){

            case DragEvent.ACTION_DRAG_ENTERED:break;

            case DragEvent.ACTION_DRAG_EXITED:break;

            case DragEvent.ACTION_DROP:

                TextView target = (TextView) v;
                String temp=target.getText().toString();
                Log.v("target", temp);

                if(!target.getTag().equals("done")) {
                    target.setText(dragged.getText());

                    if (target.getText().equals(target.getTag())) {
                        target.setTextColor(Color.GREEN);
                        target.setTag("done");
                        dragged.setText(temp);
                        if (dragged.getText().equals(dragged.getTag())) {
                            dragged.setTextColor(Color.GREEN);
                            dragged.setTag("done");
                        }

                        else {
                            dragged.setTextColor(Oldcolor);
                        }


                    } else {
                        String drag= target.getText().toString();
                        target.setText(temp);
                        dragged.setText(drag);
                    }
               }
                break;
        }

    }





    // This method is used for button
    public void processClick(View v, EditText editAns) {
        if (editAns.getText().toString().equals(editAns.getTag().toString())) {
            //indicator.setBackgroundResource(R.drawable.right);
            editAns.setTextColor(Color.GREEN);
        } else {
            //indicator.setBackgroundResource(R.drawable.wrong);
            editAns.setTextColor(Color.RED);
        }
    }

    // This method is used for button
    public void processButtons(View v) {

        Button pressedButton = (Button) v;
        if(v.getTag() == "1"){
            pressedButton.setBackgroundColor(Color.GREEN);
            pressedButton.setTextColor(Color.WHITE);
        }
        else{
            pressedButton.setBackgroundColor(Color.RED);
            pressedButton.setTextColor(Color.WHITE);
        }

    }

    // This method is used for check box selections
    public void processCheckBox(View v) {

        CheckBox checkedItem = (CheckBox) v;

        if(v.getTag() == "1"){
            checkedItem.setTextColor(Color.GREEN);
        }
        else{
            checkedItem.setTextColor(Color.RED);
        }

    }

    // This method is used for radio button selections
    public void processRadioButton(View v) {

        RadioButton optionSelected = (RadioButton) v;

        if(v.getTag() == "yes"){
            optionSelected.setTextColor(Color.parseColor("#689F38"));
        }
        else{
            optionSelected.setTextColor(Color.RED);
        }

    }

    public void editTextAns(CharSequence answer, EditText e){
        if (answer.toString().equals(e.getText().toString())) {
            e.setTextColor(Color.GREEN);
            e.setFocusable(false);
        } else {
            e.setTextColor(Color.RED);
        }

    }

    // This method is used to handle answer processing in OnFocus events
    public void processOnFocusEvent(View v){

        EditText answer = (EditText) v;

        if (answer.getText().toString().equals(answer.getTag().toString())) {
            answer.setTextColor(Color.GREEN);
            answer.setFocusable(false);
        } else {
            answer.setTextColor(Color.RED);
        }

    }


    // This method is used for spinners
    public void processSpinner(AdapterView<?> parent, int position, View view){

        String item = parent.getItemAtPosition(position).toString();

        if(position != 0) {
            if (item.equals(parent.getTag().toString())) {
                parent.setBackgroundColor(Color.GREEN);
            } else {
                parent.setBackgroundColor(Color.RED);
            }
        }

    }

}
