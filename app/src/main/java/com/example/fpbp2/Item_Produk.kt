package com.example.fpbp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class Item_Produk (val nama:MutableList<String>, val foto:MutableList<Int>) : RecyclerView.Adapter<Item_Produk.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_produk,parent,false)
        return ViewHolder(view)
    }
    class ViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView){
        val txt_nama:TextView = ItemView.findViewById(R.id.txt_nama)
        val iv_foto:ImageView = ItemView.findViewById(R.id.iv_foto)
    }
    override fun getItemCount(): Int {
        return nama.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt_nama.text = nama.get(position)
        holder.iv_foto.setImageResource(foto.get(position))
    }
}