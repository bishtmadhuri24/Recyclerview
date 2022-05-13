package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context:Context,val datalist:List<Data>):
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View=LayoutInflater.from(context).inflate(R.layout.data_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data:Data=datalist[position]
       holder.image.setImageResource(data.image)
        holder.description.text=data.description
    }

    override fun getItemCount()=datalist.size
    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
        val image:ImageView=itemview.findViewById(R.id.imageview)
        val description:TextView=itemview.findViewById(R.id.description)
    }

}