package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lanjut = findViewById(R.id.logo)
        lanjut.setOnClickListener {
            val intent = Intent(this, onboarding1::class.java)
            startActivity(intent)
        }
    }
}