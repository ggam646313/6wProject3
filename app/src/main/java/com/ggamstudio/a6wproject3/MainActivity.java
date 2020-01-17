package com.ggamstudio.a6wproject3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BackPressCloseHandler backPressCloseHandler;

    //FragmentManager fragmentManager = getSupportFragmentManager();
//    private FragmentHome fragmentHome= new FragmentHome();
//    private FragmentSearch fragmentSearch = new FragmentSearch();
//    private FragmentUpload fragmentUpload = new FragmentUpload();
//    private FragmentFavorite fragmentFavorite = new FragmentFavorite();
//    private FragmentMy fragmentMy = new FragmentMy();

    ViewPager pager;
    aaaAdapter adapter;
    BottomNavigationView bnv;





    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backPressCloseHandler = new BackPressCloseHandler(this);


        //FragmentTransaction transaction = fragmentManager.beginTransaction();
        //transaction.replace(R.id.rLayout, fragmentHome).commitAllowingStateLoss();

        pager= findViewById(R.id.p);
        adapter= new aaaAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

        bnv = findViewById(R.id.bnv);



        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {  }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        bnv.getMenu().getItem(position).setChecked(true);
                        break;

                    case 1:
                        bnv.getMenu().getItem(position).setChecked(true);
                        break;

                    case 2:
                        bnv.getMenu().getItem(position).setChecked(true);
                        break;

                    case 3:
                        bnv.getMenu().getItem(position).setChecked(true);
                        break;

                    case 4:
                        bnv.getMenu().getItem(position).setChecked(true);
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                //FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch(menuItem.getItemId())
                {
                    case R.id.bnv_home:
                        //transaction.replace(R.id.rLayout, fragmentHome).commitAllowingStateLoss();
                        pager.setCurrentItem(0, true);
                        break;

                    case R.id.bnv_search:
                        //transaction.replace(R.id.rLayout, fragmentSearch).commitAllowingStateLoss();
                        pager.setCurrentItem(1, true);
                        break;

                    case R.id.bnv_upload:
                        //transaction.replace(R.id.rLayout, fragmentUpload).commitAllowingStateLoss();
                        pager.setCurrentItem(2, true);
                        break;

                    case R.id.bnv_favorite:
                        //transaction.replace(R.id.rLayout, fragmentFavorite).commitAllowingStateLoss();
                        pager.setCurrentItem(3, true);
                        break;

                    case R.id.bnv_my:
                        //transaction.replace(R.id.rLayout, fragmentMy).commitAllowingStateLoss();
                        pager.setCurrentItem(4, true);
                        break;

                }
                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        backPressCloseHandler.onBackPressed();
    }

    public void clickCamera(View view) {

        Intent intent= new Intent();
        intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(intent,100);
    }
}

