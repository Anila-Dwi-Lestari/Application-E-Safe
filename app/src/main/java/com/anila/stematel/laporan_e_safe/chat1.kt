package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class chat1 : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat1)
        lanjut = findViewById(R.id.imageView67)
        lanjut.setOnClickListener {
            val intent = Intent(this, chat2::class.java)
            startActivity(intent)
        }
    }
}