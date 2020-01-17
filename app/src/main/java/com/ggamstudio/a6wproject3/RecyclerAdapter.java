package com.ggamstudio.a6wproject3;

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

//        vh.tvUsername.setText(recyclerItem.username);
//        vh.tvUsertext.setText(recyclerItem.usertext);

        vh.tvUsername.setText(recyclerItem.getUsername());
        vh.tvUsertext.setText(recyclerItem.getUsertext());


//        Glide.with(context).load(recyclerItem.icon).into(vh.ivIcon);
//        Glide.with(context).load(recyclerItem.image).into(vh.ivImage);
        Glide.with(context).load(recyclerItem.getIcon()).into(vh.ivIcon);
        Glide.with(context).load(recyclerItem.getImage()).into(vh.ivImage);

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

                ivIcon= itemView.findViewById(R.id.cardView_icon);
                ivDots= itemView.findViewById(R.id.cardView_dots);
                ivImage=itemView.findViewById(R.id.cardView_image);
                ivHeart=itemView.findViewById(R.id.cardView_heart);
                ivComment=itemView.findViewById(R.id.cardView_comment);
                ivSend=itemView.findViewById(R.id.cardView_send);
                tvUsername=itemView.findViewById(R.id.cardView_username);
                tvLike=itemView.findViewById(R.id.cardView_like);
                tvUsername_under=itemView.findViewById(R.id.cardView_username_under);
                tvUsertext=itemView.findViewById(R.id.cardView_usertext);
                tvCommentallsee=itemView.findViewById(R.id.cardView_commentallsee);




        }
    }
}
