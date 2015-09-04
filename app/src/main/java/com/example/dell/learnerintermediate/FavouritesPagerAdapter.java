package com.example.dell.learnerintermediate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class FavouritesPagerAdapter extends FragmentStatePagerAdapter {
    public FavouritesPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;

        if (i == 0) {
            fragment = new HomeFavourites();
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

            current_title = "WELCOME TO YOUR FAVOURITE LESSONS";
        }

        return current_title;
    }
}
