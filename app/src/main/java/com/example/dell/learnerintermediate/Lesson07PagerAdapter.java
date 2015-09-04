package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson07PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson07PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson07A();
        }

        if(i==1){
            fragment = new Lesson07B();
        }

        if(i==2){
            fragment = new Lesson07C();
        }

        if(i==3){
            fragment = new Lesson07D();
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

            current_title = "Boast about our neighbours";
        }

        if(position==1){

            current_title = "Compare our neighbors";
        }

        if(position==2){

            current_title = "Basic rules of comparatives and superlatives";
        }

        if(position==3){

            current_title = "Activities";
        }


        return current_title;
    }
}
