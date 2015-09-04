package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson15PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson15PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson15A();
        }

        if(i==1){
            fragment = new Lesson15B();
        }

        if(i==2){
            fragment = new Lesson15C();
        }
        if(i==3){
            fragment = new Lesson15D();
        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String current_title = new String();

        if(position==0){

            current_title = "Introduction to Punctuation marks";
        }

        if(position==1){

            current_title = "Intonation Patterns";
        }

        if(position==2){

            current_title = "Capitalization";
        }
        if(position==3){

            current_title = "Activities";
        }


        return current_title;
    }
}
