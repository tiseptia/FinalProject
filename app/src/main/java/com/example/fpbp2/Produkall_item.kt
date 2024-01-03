package com.example.fpbp2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable

class Produkall_item(var halaman:ProdukAll, var namas:List<String>, var fotos:List<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return namas.size;
    }

    override fun getItem(posisi: Int): Any {
        return posisi;
    }

    override fun getItemId(posisi: Int): Long {
        return posisi.toLong();
    }

    override fun getView(posisi: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(halaman).inflate(R.layout.produkall_item,parent,false);
        val img_foto:ImageView = view.findViewById(R.id.img_foto);
        val txt_nama:TextView = view.findViewById(R.id.txt_nama);

        txt_nama.text = namas.get(posisi);
        img_foto.setImageDrawable(fotos.get(posisi).toDrawable());
        img_foto.setImageResource(fotos.get(posisi))
        return view;
    }
}