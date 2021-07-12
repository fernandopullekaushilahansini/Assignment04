package com.example.assignment04

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter:RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private var name = arrayOf("Washing Machine", "Smart Phone", "Cycle", "Camera", "Laptop", "Television", "Bed", "Refrigerator", "Radio", "Oven", "Fan", "Shoe", "Hat", "Pillow", "Sofa")
    private var price = arrayOf("$20", "$10", "$4", "$25", "$28", "$10", "$8", "$15", "$7", "$6", "$7", "$3", "$2", "$3", "$6")
    private var images = intArrayOf(R.drawable.item_image1, R.drawable.item_image2, R.drawable.item_image3, R.drawable.item_image4, R.drawable.item_image5, R.drawable.item_image6, R.drawable.item_image7, R.drawable.item_image8, R.drawable.item_image9, R.drawable.item_image10, R.drawable.item_image11, R.drawable.item_image12, R.drawable.item_image13, R.drawable.item_image14, R.drawable.item_image15)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        holder.itemName.text = name [position]
        holder.itemPrice.text = price [position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemName : TextView
        var itemPrice : TextView

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemName = itemView.findViewById(R.id.item_name)
            itemPrice = itemView.findViewById(R.id.item_price)
        }
    }
}