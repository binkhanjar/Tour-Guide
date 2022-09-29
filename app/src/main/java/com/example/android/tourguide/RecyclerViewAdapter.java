package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<Items> mItems;

    public RecyclerViewAdapter(Context mContext, List<Items> mItems) {
        this.mContext = mContext;
        this.mItems = mItems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(mContext).inflate(R.layout.list_items, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Items temp = mItems.get(position);

        holder.iv_image.setImageResource(mItems.get(position).getImage());
        holder.tv_name.setText(mItems.get(position).getName());
        holder.tv_desc.setText(mItems.get(position).getDescription());
        holder.tv_desc.setVisibility(View.GONE);

        holder.iv_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, descActivity.class);
                intent.putExtra("Image", temp.getImage());
                intent.putExtra("name", temp.getName());
                intent.putExtra("desc", temp.getDescription());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_image;
        private TextView tv_name;
        private TextView tv_desc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.image_items_xml);
            tv_name = itemView.findViewById(R.id.name_items_xml);
            tv_desc = itemView.findViewById(R.id.desc_desc);
        }
    }
}
