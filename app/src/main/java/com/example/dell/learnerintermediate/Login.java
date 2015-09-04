package com.example.dell.learnerintermediate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;


public class Login extends ActionBarActivity {

    public static final String DEFAULT = "";
    public static final String loginPref = "loginCredentials";
    public static final String skipPref = "skipCredentials";

    EditText email;
    CheckBox skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences spLogin = getSharedPreferences("loginCredentials", Context.MODE_PRIVATE);
        String email = spLogin.getString("email", DEFAULT);

        SharedPreferences spSkip = getSharedPreferences("skipCredentials", Context.MODE_PRIVATE);
        String skip = spSkip.getString("skip", DEFAULT);

        if (email != DEFAULT || skip != DEFAULT) {

            Intent loadMain = new Intent(this, MainLearnerActivity.class);
            startActivity(loadMain);
        }


    }

    public void saveCredentials(View view) {

        email = (EditText) findViewById(R.id.email);
        skip = (CheckBox) findViewById(R.id.skip);

        if (email.toString() != DEFAULT) {
            SharedPreferences sharedCredentials = getSharedPreferences("loginCredentials", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedCredentials.edit();
            editor.putString("email", email.getText().toString());
            editor.commit();
        }

        if (skip.isChecked()) {
            SharedPreferences skipCredentials = getSharedPreferences("skipCredentials", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = skipCredentials.edit();
            editor.putString("skip", "true");
            editor.commit();
        }


    }


}
