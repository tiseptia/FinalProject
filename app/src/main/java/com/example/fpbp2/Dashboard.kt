package com.example.fpbp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView

class Dashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val card_akun:CardView = findViewById(R.id.card_akun);
        val card_kategori:CardView = findViewById(R.id.card_kategori);
        val card_produk:CardView = findViewById(R.id.card_produk);
        val card_logout:CardView = findViewById(R.id.card_logout);

        card_akun.setOnClickListener {
            val pindah:Intent = Intent(this, Akun::class.java);
            startActivity(pindah);
        }
        card_kategori.setOnClickListener {
            val pindah:Intent = Intent(this, Kategori::class.java);
            startActivity(pindah);
        }
        card_produk.setOnClickListener {
            val pindah:Intent = Intent(this, ProdukAll::class.java);
            startActivity(pindah);
        }
        card_logout.setOnClickListener {
            val pindah:Intent = Intent(this, Login::class.java);
            startActivity(pindah);
        }
    }
}