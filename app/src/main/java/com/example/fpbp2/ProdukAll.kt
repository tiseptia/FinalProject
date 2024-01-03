package com.example.fpbp2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.activity.ComponentActivity

class ProdukAll : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produkall)

        val namas:List<String> = listOf("scarlet","Y O U","Skintific","Wardah");
        val fotos:List<Int> = listOf(R.drawable.scrarlet,R.drawable.you,R.drawable.skintific,R.drawable.wardah);

        val grid_produk:GridView = findViewById(R.id.grid_produk);

        val perulangan_data = Produkall_item(this,namas,fotos);

        grid_produk.adapter = perulangan_data;
    }
}