package com.ggamstudio.a6wproject3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter2 extends FragmentPagerAdapter {

    Fragment[] fragments= new Fragment[2];
    String[] pageTitles= new String[]{"게시글", "태그"};

    public MyAdapter2(@NonNull FragmentManager fm) {
        super(fm);

        fragments[0]= new Page1FragmentMy();
        fragments[1]= new Page2FragmentMy();
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
