package com.example.dell.learnerintermediate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson04C extends Fragment {

    TextView correct;


    @Override
     public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fr_less_04_c, container, false);


        correct = (TextView)view.findViewById(R.id.cor);
        return view;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.a:
                if (checked)
                    correct.setText("Correct :");
                    break;


            case R.id.b:
                if (checked)
                    correct.setText("Wrong :");
                    break;

            case R.id.c:
                if (checked)
                    correct.setText("Wrong :");
                    break;
        }
    }
}
