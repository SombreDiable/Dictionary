package com.antoine_charlotte_romain.dictionary.Controllers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.antoine_charlotte_romain.dictionary.R;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    int numbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
    private long baseId = 0;

    //Store the icons ids
    int[] drawablesIds = {
            R.drawable.home_tab_drawable,
            R.drawable.history_tab_drawable,
            R.drawable.search_tab_drawable
    };

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, int mNumbOfTabsumb) {
        super(fm);

        this.numbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0)
        {
            System.out.println("Home");
            return new HomeFragment();
        }
        else if (position == 1)
        {
            System.out.println("History");
            return  new HistoryFragment();
        }
        else
        {
            System.out.println("Search");
            return new SearchFragment();
        }
    }

    // This method return the Number of tabs for the tabs Strip
    @Override
    public int getCount() {
        return numbOfTabs;
    }

    // This method return the specific tab icon
    public int getDrawableId(int position){
        return drawablesIds[position];
    }



}