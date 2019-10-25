package com.example.borgerking;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Items> itemsToAdapt;

    public void setData(ArrayList<Items> itemstoAdapt) {
        this.itemsToAdapt = itemstoAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
    ItemViewHolder itemViewHolder = new ItemViewHolder(view);
    return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        final Items itemAtPostion = itemsToAdapt.get(position);

        holder.foodTextView.setText(itemAtPostion.getName());
        holder.imageView.setImageResource(itemAtPostion.getImageDrawableID());

        holder.view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Context context = view.getContext();

                Intent intent = new Intent(context,ItemDetailActivity.class);
                intent.putExtra("itemID", itemAtPostion.getItemID());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount(){
        return itemsToAdapt.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView foodTextView;
        public ImageView imageView;

        public ItemViewHolder(View v) {
            super(v);
            view = v;
            foodTextView = v.findViewById(R.id.foodTitle);
            imageView = v.findViewById(R.id.foodImage);
        }
    }
}
