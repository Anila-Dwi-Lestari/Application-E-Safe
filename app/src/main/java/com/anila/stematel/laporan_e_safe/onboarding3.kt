package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class onboarding3 : AppCompatActivity() {
    lateinit var lanjut: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)
        lanjut = findViewById(R.id.imageView8)
        lanjut.setOnClickListener {
            val intent = Intent(this, onboarding4::class.java)
            startActivity(intent)
        }
    }
}