package com.example.a6wproject3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter {

    ArrayList<RecyclerItem> datas;
    Context context;

    public RecyclerAdapter(ArrayList<RecyclerItem> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View itemView= inflater.inflate(R.layout.recycler_item, parent, false);

        VH vh= new VH(itemView);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh= (VH)holder;

        RecyclerItem recyclerItem= datas.get(position);

        vh.tvUsername.setText(recyclerItem.username);
        vh.tvUsertext.setText(recyclerItem.usertext);

        //이미지가 너무크면 OOM(Out of Memory)에러 발생
        //이를 방지하기 위해 Library(Picasso, Glide) 사용
        Glide.with(context).load(recyclerItem.icon).into(vh.ivIcon);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView ivIcon,ivDots,ivImage,ivHeart,ivComment,ivSend;
        TextView tvUsername,tvLike,tvUsername_under,tvUsertext,tvCommentallsee;


        public VH(@NonNull View itemView) {
            super(itemView);

            ivIcon.findViewById(R.id.cardView_icon);
            ivDots.findViewById(R.id.cardView_dots);
            ivImage.findViewById(R.id.cardView_image);
            ivHeart.findViewById(R.id.cardView_heart);
            ivComment.findViewById(R.id.cardView_comment);
            ivSend.findViewById(R.id.cardView_send);
            tvUsername.findViewById(R.id.cardView_username);
            tvLike.findViewById(R.id.cardView_like);
            tvUsername_under.findViewById(R.id.cardView_username_under);
            tvUsertext.findViewById(R.id.cardView_usertext);
            tvCommentallsee.findViewById(R.id.cardView_commentallsee);
        }
    }
}
