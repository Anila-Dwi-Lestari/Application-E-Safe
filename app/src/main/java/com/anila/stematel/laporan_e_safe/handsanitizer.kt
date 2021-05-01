package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class handsanitizer : AppCompatActivity() {
    lateinit var imageView55: ImageView
    lateinit var imageView56: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handsanitizer)
        imageView55 = findViewById(R.id.imageView55)
        imageView56 = findViewById(R.id.imageView56)
        imageView55.setOnClickListener {
            val intent = Intent(this, detailhandsanitizer::class.java)
            startActivity(intent)
        }
        imageView56.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}