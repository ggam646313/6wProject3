package com.example.a6wproject3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    Fragment[] fragments= new Fragment[4];
    String[] pageTitles= new String[]{"인기", "계정", "태그", "장소"};

    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);

        fragments[0]= new Page1Fragment();
        fragments[1]= new Page2Fragment();
        fragments[2]= new Page3Fragment();
        fragments[3]= new Page4Fragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return pageTitles[position];
    }
}
