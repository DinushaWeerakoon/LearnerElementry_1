package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson12PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson12PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson12A();
        }

        if(i==1){
            fragment = new Lesson12B();
        }

        if(i==2){
            fragment = new Lesson12C();
        }

        if(i==3){
            fragment = new Lesson12D();
        }

        if(i==4){
            fragment = new Lesson12E();
        }



        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String current_title = new String();

        if(position==0){

            current_title = "Quantifiers";
        }

        if(position==1){

            current_title = "Unspecified Quantities";
        }

        if(position==2){

            current_title = "Specified Quantities";
        }
        if(position==3){

            current_title = "Quantifying Expressions";
        }
        if(position==4){

            current_title = "Activities";
        }
        


        return current_title;
    }
}
