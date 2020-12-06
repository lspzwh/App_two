package com.example.app2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.AViewHolder> {


    private List<RvData> list;
    public Adapter(List<RvData> list){
        this.list=list;

    }
    static class AViewHolder extends RecyclerView.ViewHolder {
        public TextView item_name;
        public TextView item_content;
        public ImageView item_image;
        public AViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name=itemView.findViewById(R.id.item_name);
            item_content=itemView.findViewById(R.id.item_content);
            item_image=itemView.findViewById(R.id.item_image);

        }
    }

    @NonNull
    @Override
    public Adapter.AViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AViewHolder holder, int position) {
        RvData rvData=list.get(position);
        holder.item_name.setText(rvData.getName());
        holder.item_content.setText(rvData.getContent());
        holder.item_image.setImageResource(rvData.getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
