package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pilihkonsul : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pilihkonsul)
        lanjut = findViewById(R.id.imageView64)
        lanjut.setOnClickListener {
            val intent = Intent(this, chat1::class.java)
            startActivity(intent)
        }
    }
}