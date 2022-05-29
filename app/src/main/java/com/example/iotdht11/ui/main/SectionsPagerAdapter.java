package com.example.iotdht11.ui.main;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
       switch(position){
           case 0:  return  new TemperatureFragment();
           case 1:  return  new HumidityFragment();
           default: throw new IllegalStateException("Unexpected value: " + position);
       }
    }

    @Override
    public int getCount() {
        return 2;
    }
}