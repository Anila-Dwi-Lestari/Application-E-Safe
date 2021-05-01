package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class detailmemakaimasker : AppCompatActivity() {
    lateinit var imageView58 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailmemakaimasker)
        imageView58 = findViewById(R.id.imageView58)
        imageView58.setOnClickListener {
            val intent = Intent(this, memakaimasker::class.java)
            startActivity(intent)
        }
    }
}