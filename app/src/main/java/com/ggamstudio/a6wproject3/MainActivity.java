package com.ggamstudio.a6wproject3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BackPressCloseHandler backPressCloseHandler;

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

        backPressCloseHandler = new BackPressCloseHandler(this);


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
