package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class detailhandsanitizer : AppCompatActivity() {
    lateinit var imageView59 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailhandsanitizer)
        imageView59 = findViewById(R.id.imageView59)
        imageView59.setOnClickListener {
            val intent = Intent(this, handsanitizer::class.java)
            startActivity(intent)
        }
    }
}