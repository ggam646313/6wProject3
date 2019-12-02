package com.ggamstudio.a6wproject3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class SettingActivity extends AppCompatActivity {

    ImageButton btnBack;
    TextView profileChange;
    CircleImageView circleImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        circleImageView= findViewById(R.id.circle_profile);

        btnBack= findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        profileChange= findViewById(R.id.tv_profile_change);
        profileChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,10);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 10:

                if(resultCode == RESULT_OK){
                    Uri uri= data.getData();

                    if(uri != null){
                        Glide.with(this).load(uri).into(circleImageView);

                    }else{
                        Bundle bundle= data.getExtras();
                        Bitmap bm= (Bitmap) bundle.get("data");

                        Glide.with(this).load(bm).into(circleImageView);
                    }

                }
                break;
        }
    }
}