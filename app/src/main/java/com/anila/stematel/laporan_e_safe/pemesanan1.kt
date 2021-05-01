package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pemesanan1 : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemesanan1)
        lanjut = findViewById(R.id.imageView71)
        lanjut.setOnClickListener {
            val intent = Intent(this, pemesanan2::class.java)
            startActivity(intent)
        }
    }
}