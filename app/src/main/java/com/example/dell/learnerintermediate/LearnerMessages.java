package com.example.dell.learnerintermediate;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by UCSC-PC on 6/3/2015.
 */
public class LearnerMessages {

    public static void message(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
