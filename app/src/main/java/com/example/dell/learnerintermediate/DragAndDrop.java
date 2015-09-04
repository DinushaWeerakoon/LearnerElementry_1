package com.example.dell.learnerintermediate;

import android.graphics.Color;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ucsc on 9/3/2015.
 */
public class DragAndDrop {
    public void processDrag(View v, int dragEvent, TextView dragged){

        switch (dragEvent){

            case DragEvent.ACTION_DRAG_ENTERED:break;

            case DragEvent.ACTION_DRAG_EXITED:break;

            case DragEvent.ACTION_DROP:

                TextView target = (TextView) v;

                if(!target.getTag().equals("done")) {
                    target.setText(dragged.getText());

                    if (target.getText().equals(target.getTag())) {
                        target.setTextColor(Color.GREEN);
                        target.setTag("done");
                    } else {
                        target.setTextColor(Color.RED);
                        target.setTag("done");
                    }
                }
                break;
        }

    }
}
