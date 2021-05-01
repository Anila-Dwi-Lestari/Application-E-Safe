package com.anila.stematel.laporan_e_safe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class beranda : AppCompatActivity() {
    lateinit var cardview4: CardView
    lateinit var cardview3: CardView
    lateinit var cardview6: CardView
    lateinit var cardview5: CardView
    lateinit var imageView37: ImageView
    lateinit var imageView38: ImageView
    lateinit var imageView39: ImageView
    lateinit var imageView49: ImageView
    lateinit var imageView50: ImageView
    lateinit var imageView60: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
        cardview3 = findViewById(R.id.cardView3) as CardView
        cardview4 = findViewById(R.id.cardView4) as CardView
        cardview6 = findViewById(R.id.cardView6) as CardView
        cardview5 = findViewById(R.id.cardView5) as CardView
        imageView37 = findViewById(R.id.imageView37)
        imageView38 = findViewById(R.id.imageView38)
        imageView39 = findViewById(R.id.imageView39)
        imageView49 = findViewById(R.id.imageView49)
        imageView50 = findViewById(R.id.imageView50)
        imageView60 = findViewById(R.id.imageView60)
        cardview4.setOnClickListener {
            val intent = Intent(this, kasusterkonfirmasi::class.java)
            startActivity(intent)
        }

        cardview3.setOnClickListener {
            val intent = Intent(this, kasuskematian::class.java)
            startActivity(intent)
        }

        cardview6.setOnClickListener {
            val intent = Intent(this, pasiensembuh::class.java)
            startActivity(intent)
        }
        cardview5.setOnClickListener {
            val intent = Intent(this, Kasusbaru::class.java)
            startActivity(intent)
        }
        imageView37.setOnClickListener {
            val intent = Intent(this, mencucitangan::class.java)
            startActivity(intent)
        }
        imageView38.setOnClickListener {
            val intent = Intent(this, memakaimasker::class.java)
            startActivity(intent)
        }
        imageView39.setOnClickListener {
            val intent = Intent(this, handsanitizer::class.java)
            startActivity(intent)
        }
        imageView49.setOnClickListener {
            val intent = Intent(this, pilihkonsul::class.java)
            startActivity(intent)
        }
        imageView50.setOnClickListener {
            val intent = Intent(this, pemesanan1::class.java)
            startActivity(intent)
        }
        imageView60.setOnClickListener {
            val intent = Intent(this, akun::class.java)
            startActivity(intent)
        }
    }
}