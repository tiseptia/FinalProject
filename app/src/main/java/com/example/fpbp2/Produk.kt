package com.example.fpbp2

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Produk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produk)

        val rv_produk:RecyclerView = findViewById(R.id.rv_produk)
        val nama:MutableList<String> = mutableListOf();
        val foto:MutableList<Int> = mutableListOf();

        val dbtoko: SQLiteDatabase = openOrCreateDatabase("toko", MODE_PRIVATE, null)

        val gali_produk = dbtoko.rawQuery("SELECT * FROM produk", null)

        while (gali_produk.moveToNext())
        {
          nama.add(gali_produk.getString(1))
          foto.add(R.drawable.noimage)
        }

        val ip = Item_Produk(nama, foto)

        rv_produk.adapter = ip
        rv_produk.layoutManager = GridLayoutManager(this,2)
    }
}