package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson18PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson18PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson18A();
        }

        if(i==1){
            fragment = new Lesson18B();
        }

        if(i==2){
            fragment = new Lesson18C();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String current_title = new String();

        if(position==0){

            current_title = "Notice";
        }

        if(position==1){

            current_title = "Posters";
        }

        if(position==2){

            current_title = "Activities";
        }


        return current_title;
    }
}
