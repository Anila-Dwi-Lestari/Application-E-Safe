package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pemesanan2 : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemesanan2)
        lanjut = findViewById(R.id.imageView11)
        lanjut.setOnClickListener {
            val intent = Intent(this, pemesanan3::class.java)
            startActivity(intent)
        }
    }
}