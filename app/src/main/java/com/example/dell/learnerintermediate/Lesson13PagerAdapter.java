package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson13PagerAdapter extends FragmentStatePagerAdapter {
    public Lesson13PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if(i==0){
            fragment = new Lesson13A();
        }

        if(i==1){
            fragment = new Lesson13B();
        }

        if(i==2){
            fragment = new Lesson13C();
        }

        if(i==3){
            fragment = new Lesson13D();
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

            current_title = "Interrogative form of statements in passive";
        }

        if(position==1){

            current_title = "People believed....";
        }

        if(position==2){

            current_title = "Impersonal Pronouns";
        }

        if(position==3){

            current_title = "Activities";
        }
        


        return current_title;
    }
}
