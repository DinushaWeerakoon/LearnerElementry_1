package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson06PagerAdapter  extends FragmentStatePagerAdapter {
    public Lesson06PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson06A();
        }

        if(i==1){
            fragment = new Lesson06B();
        }

        if(i==2){
            fragment = new Lesson06C();
        }

        if(i==3){
            fragment = new Lesson06D();
        }

        if(i==4){
            fragment = new Lesson06E();
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

            current_title = "Simple past tense";
        }

        if(position==1){

            current_title = "Adverbs of time ";
        }

        if(position==2){

            current_title = "Use ‘Wh' question words in the past ";
        }

        if(position==3){

            current_title = "Past form of the verbs ";
        }
        if(position==4){

            current_title = "Activities";
        }

        return current_title;
    }
}
