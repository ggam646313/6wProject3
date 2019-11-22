package com.example.a6wproject3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.github.chrisbanes.photoview.PhotoView;

import java.io.InputStream;

import static android.app.Activity.RESULT_OK;

public class FragmentUpload extends Fragment {

    PhotoView ivPicture;
    Button btnNext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_upload, container, false);


        ivPicture= view.findViewById(R.id.iv_picture);
//        ivPicture.setImageResource(R.drawable.);
        btnNext= view.findViewById(R.id.btn_pictureChoice);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,10);

            }
        });


        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        switch (requestCode){
            case 10:

                if(resultCode == RESULT_OK){
                    Uri uri= data.getData();

                    if(uri != null){
                        Glide.with(this).load(uri).into(ivPicture);

                    }else{
                        Bundle bundle= data.getExtras();
                        Bitmap bm= (Bitmap) bundle.get("data");

                        Glide.with(this).load(bm).into(ivPicture);
                    }

                }
                break;
        }
    }
}
