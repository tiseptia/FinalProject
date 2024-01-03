package com.example.fpbp2

import android.content.Intent
import android.content.SharedPreferences
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val edt_email: EditText = findViewById(R.id.edt_email)
        val edt_password: EditText = findViewById(R.id.edt_password)
        val btn_login:Button = findViewById(R.id.btn_login);

        //btn login ditekan
        btn_login.setOnClickListener{
            val isi_email:String = edt_email.text.toString()
            val isi_password:String = edt_password.text.toString()

            val dbtoko: SQLiteDatabase = openOrCreateDatabase("toko", MODE_PRIVATE,null)

            val query = dbtoko.rawQuery("SELECT * FROM user WHERE email_user='$isi_email' AND password_user='$isi_password'",null)
            val cek = query.moveToNext()

            if (cek) {

                //simpan data si pelogin
                val id = query.getString(0)
                val email = query.getString(1)
                val password = query.getString(2)
                val nama = query.getString(3)

                val session: SharedPreferences = getSharedPreferences("user", MODE_PRIVATE)
                val buattiket = session.edit()
                buattiket.putString("id_user", id)
                buattiket.putString("email_user", email)
                buattiket.putString("password_user", password)
                buattiket.putString("nama_user", nama)
                buattiket.commit()

                //pindah ke halaman dashboard
                val pindah: Intent = Intent(this, Dashboard::class.java);
                startActivity(pindah);
            } else {
                Toast.makeText(this, "Email atau password salah!", Toast.LENGTH_LONG).show()
            }
        }
    }
}