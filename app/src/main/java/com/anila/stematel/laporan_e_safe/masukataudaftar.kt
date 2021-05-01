package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class masukataudaftar : AppCompatActivity() {
    lateinit var imageView14 : ImageView
    lateinit var imageView35 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masukataudaftar)
        imageView14= findViewById(R.id.imageView14)
        imageView35= findViewById(R.id.imageView35)
        imageView14.setOnClickListener {
            val intent = Intent(this, masuk::class.java)
            startActivity(intent)
        }
        imageView35.setOnClickListener {
            val intent = Intent(this, daftar::class.java)
            startActivity(intent)
        }
    }
}