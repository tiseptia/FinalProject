 package com.example.fpbp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity

 class Kategori : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kategori)

        //interface lv_kategori
        val lv_kategori:ListView = findViewById(R.id.lv_kategori);

        //membuat data kategori
        val nama_kategori:List<String> = listOf("Toner","Serum","cream malam","cream siang",);

        //membuat adapter yang berisi perulangan data
        val perulangan_data:ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nama_kategori);

        //pasang perulangan_data interface di lv_kategori
        lv_kategori.adapter = perulangan_data;
    }
}