package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class memakaimasker : AppCompatActivity() {
    lateinit var imageView53: ImageView
    lateinit var imageView54: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memakaimasker)
        imageView53 = findViewById(R.id.imageView53)
        imageView54 = findViewById(R.id.imageView54)
        imageView53.setOnClickListener {
            val intent = Intent(this, detailmemakaimasker::class.java)
            startActivity(intent)
        }
        imageView54.setOnClickListener {
            val intent = Intent(this, beranda::class.java)
            startActivity(intent)
        }
    }
}