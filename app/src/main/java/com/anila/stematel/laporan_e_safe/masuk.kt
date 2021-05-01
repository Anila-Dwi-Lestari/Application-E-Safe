package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class masuk : AppCompatActivity() {
    lateinit var imageView24 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
        imageView24= findViewById(R.id.imageView24)
        imageView24.setOnClickListener {
            val intent = Intent(this, daftar::class.java)
            startActivity(intent)
        }
    }
}