package com.example.recycler_onclicklistner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var list:MutableList<setting_item>
    lateinit var products:RecyclerView
    lateinit var adapter:products
    lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initrecycler()
    }

    private fun initrecycler() {
        createlist()
        products=findViewById(R.id.recycler1)
        adapter= products(list)
        products.adapter=adapter
        layoutManager=LinearLayoutManager(this  )
        products.layoutManager=layoutManager
    }

    private fun createlist() {
        list= mutableListOf()
        for (i in 0 until 100){
            list.add(setting_item("hawawi",R.drawable.ic_baseline_1x_mobiledata_24))


        }
    }
}