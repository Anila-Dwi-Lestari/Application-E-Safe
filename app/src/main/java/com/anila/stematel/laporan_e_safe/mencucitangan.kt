package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class mencucitangan : AppCompatActivity() {
    lateinit var imageView51: ImageView
    lateinit var imageView52: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mencucitangan)
        imageView51 = findViewById(R.id.imageView51)
        imageView52 = findViewById(R.id.imageView52)
        imageView51.setOnClickListener {
            val intent = Intent(this, detailmencucitangan::class.java)
            startActivity(intent)
        }
        imageView52.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}