package com.ggamstudio.a6wproject3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class aaaAdapter extends FragmentPagerAdapter {

    Fragment[] fragments= new Fragment[5];


    public aaaAdapter(@NonNull FragmentManager fm) {
        super(fm);
        fragments[0] = new FragmentHome();
        fragments[1] = new FragmentSearch();
        fragments[2] = new FragmentUpload();
        fragments[3] = new FragmentFavorite();
        fragments[4] = new FragmentMy();
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
}
