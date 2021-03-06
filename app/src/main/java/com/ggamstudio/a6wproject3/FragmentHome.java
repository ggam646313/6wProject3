package com.ggamstudio.a6wproject3;

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



        datas.add(new RecyclerItem("깜깜","","","아아","",R.drawable.ch_chopa,0, R.drawable.ch_chopa,0,0,0));
        datas.add(new RecyclerItem("랄랄","","","으에","",R.drawable.ch_zoro,0,R.drawable.ch_chopa,0,0,0));

        recyclerView=view.findViewById(R.id.recycler);
        recyclerAdapter= new RecyclerAdapter(datas, getContext());
        recyclerView.setAdapter(recyclerAdapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(), 1));






        return view;
    }
}
