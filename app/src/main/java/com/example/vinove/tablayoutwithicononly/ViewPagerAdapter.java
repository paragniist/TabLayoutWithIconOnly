package com.example.vinove.tablayoutwithicononly;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vinove on 27/2/18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();// strore item frament
    private final List<String> fragmentTitleList = new ArrayList<>();// tablayout item title

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
     //  return null;
         return fragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String s){

        fragmentList.add(fragment);
        fragmentTitleList.add(s);

    }


}
