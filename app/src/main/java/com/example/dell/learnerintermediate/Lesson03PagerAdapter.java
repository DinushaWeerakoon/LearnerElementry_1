package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Dell on 4/20/2015.
 */
public class Lesson03PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson03PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson03A();
        }

        if(i==1){
            fragment = new Lesson03B();
        }

        if(i==2){
            fragment = new Lesson03C();
        }

        if(i==3){
            fragment = new Lesson03D();
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

            current_title = "Giving Directions";
        }

        if(position==1){

            current_title = "Prepositions";
        }

        if(position==2){

            current_title = "More on Prepositions ";
        }

        if(position==3){

            current_title = "Activities";
        }

        return current_title;
    }

}
