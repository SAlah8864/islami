package com.example.recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class product extends RecyclerView.Adapter<product.viewholder> {
ArrayList<list_products>items;

    public product(ArrayList<list_products> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.products,parent,false);

        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        list_products item=items.get(position);
        holder.image.setImageResource(item.image);
        holder.name.setText(item.image);
        holder.price.setText(item.price);




    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class viewholder extends RecyclerView.ViewHolder{
          ImageView image;
          TextView name;
          TextView price;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.text1);
            price=itemView.findViewById(R.id.price);
            image=itemView.findViewById(R.id.image1);

        }
    }
}
