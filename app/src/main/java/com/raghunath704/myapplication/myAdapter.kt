package com.raghunath704.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdapter(private val recyclerList:ArrayList<recyclerModel>):
    RecyclerView.Adapter<myAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.sample,parent,false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item=recyclerList[position]
        holder.image.setImageResource(item.image)
        holder.title.text=(item.title)
        holder.name.text=(item.name)
    }

    override fun getItemCount(): Int {
        return recyclerList.size
    }
    class viewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val image: ImageView=itemView.findViewById(R.id.item_Image);
        val title: TextView=itemView.findViewById(R.id.item_Title);
        val name: TextView=itemView.findViewById(R.id.item_Name);

    }

}