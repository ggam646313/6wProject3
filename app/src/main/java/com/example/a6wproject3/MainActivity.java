package com.example.a6wproject3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

//    TabLayout tabLayout;
//    ViewPager pager;
//    MyAdapter adapter;


    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentHome fragmentHome= new FragmentHome();
    private FragmentSearch fragmentSearch = new FragmentSearch();
    private FragmentUpload fragmentUpload = new FragmentUpload();
    private FragmentFavorite fragmentFavorite = new FragmentFavorite();
    private FragmentMy fragmentMy = new FragmentMy();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        tabLayout= findViewById(R.id.layout_tab);
//        pager= findViewById(R.id.pager);
//        adapter= new MyAdapter(getSupportFragmentManager());
//        pager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(pager);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });


        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bnv = findViewById(R.id.bnv);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch(menuItem.getItemId())
                {
                    case R.id.bnv_home:
                        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();
                        break;

                    case R.id.bnv_search:
                        transaction.replace(R.id.frameLayout, fragmentSearch).commitAllowingStateLoss();
                        break;

                    case R.id.bnv_upload:
                        transaction.replace(R.id.frameLayout, fragmentUpload).commitAllowingStateLoss();
                        break;

                    case R.id.bnv_favorite:
                        transaction.replace(R.id.frameLayout, fragmentFavorite).commitAllowingStateLoss();
                        break;

                    case R.id.bnv_my:
                        transaction.replace(R.id.frameLayout, fragmentMy).commitAllowingStateLoss();
                        break;
                }
                return true;
            }
        });

    }
}
