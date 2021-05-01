package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pemesanan4 : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemesanan4)
        lanjut = findViewById(R.id.imageView21)
        lanjut.setOnClickListener {
            val intent = Intent(this, berhasil::class.java)
            startActivity(intent)
        }
    }
}