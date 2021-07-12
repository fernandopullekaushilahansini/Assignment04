package com.example.assignment04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ItemAdapter.ViewHolder>? = null

    lateinit var recyclerView:RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager= LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = ItemAdapter()
        recyclerView.adapter = adapter

    }
}