package com.example.recycler_onclicklistner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class products (val list: MutableList<setting_item>):RecyclerView.Adapter<products.viewholder>(){




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
      val view=LayoutInflater.from(parent.context).inflate(R.layout.products,parent,false)
        return viewholder(view)
    }
    override fun getItemCount(): Int =list.size
    class viewholder(itemview:View):RecyclerView.ViewHolder(itemview){
        val text:TextView=itemview.findViewById(R.id.text1)
        val image:ImageView=itemview.findViewById(R.id.image1)


    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val item=list[position]
        holder.text.setText(item.title)
        holder.image.setImageResource(item.image)
    }
    interface onitemclicklistner{
        fun onclick(){

        }

    }


}