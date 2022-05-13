package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycler:RecyclerView
    lateinit var datalist:MutableList<Data>
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler=findViewById(R.id.recycler)
        datalist= mutableListOf<Data>()
        recycler.layoutManager=LinearLayoutManager(this)
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))
        datalist.add(Data(R.mipmap.ic_launcher,"this is the historical data"))

        adapter=MyAdapter(this,datalist)
        recycler.adapter=adapter

    }
}