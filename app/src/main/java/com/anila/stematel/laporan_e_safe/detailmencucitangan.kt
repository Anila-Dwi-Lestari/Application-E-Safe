package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class detailmencucitangan : AppCompatActivity() {
    lateinit var imageView57 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailmencucitangan)
        imageView57 = findViewById(R.id.imageView57)
        imageView57.setOnClickListener {
            val intent = Intent(this, mencucitangan::class.java)
            startActivity(intent)
        }
    }
}