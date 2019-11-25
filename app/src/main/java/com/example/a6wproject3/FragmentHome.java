package com.example.a6wproject3;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentHome extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    ArrayList<RecyclerItem> datas= new ArrayList<RecyclerItem>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

//        String username;
//        String like;
//        String username_under;
//        String usertext;
//        String commentallsee;
//        int icon;
//        int dotmenu;
//        int image;
//        int heart;
//        int comment;
//        int send;

        datas.add(new RecyclerItem("깜깜","","","아아아으아아","",R.drawable.ch_chopa,0, R.drawable.ch_chopa,0,0,0));
        datas.add(new RecyclerItem("랄랄","","","으에잉","",R.drawable.ch_zoro,0,R.drawable.ch_chopa,0,0,0));

        recyclerView=view.findViewById(R.id.recycler);
        recyclerAdapter= new RecyclerAdapter(datas, getContext());
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), 1));






        return view;
    }
}
