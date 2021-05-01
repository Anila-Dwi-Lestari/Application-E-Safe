package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class daftar : AppCompatActivity() {
    lateinit var daftar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        daftar = findViewById(R.id.daftar)
        daftar.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}