package com.example.recycler_viewc38;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaper1 extends RecyclerView.Adapter<adaper1.Viewholder> {
    ArrayList<item_count>board=new ArrayList<>();

    public adaper1(ArrayList<item_count> board) {
        this.board = board;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_items,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
      item_count item=board.get(position);
      holder.text.setText(item.text);
      holder.image.setImageResource(item.image);
    }



    @Override
    public int getItemCount() {
        return board.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
         TextView text;
         ImageView image;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageaa);
            text=itemView.findViewById(R.id.textaa);

        }
    }
}
