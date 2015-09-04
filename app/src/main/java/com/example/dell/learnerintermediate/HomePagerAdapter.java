package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Dell on 4/14/2015.
 */
public class HomePagerAdapter extends FragmentStatePagerAdapter {
    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if (i == 0) {
            fragment = new HomePage();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String current_title = new String();

        if (position == 0) {

            current_title = "WELCOME TO ENGLISH  LEARNER INTERMEDIATE";
        }

        return current_title;
    }
}
