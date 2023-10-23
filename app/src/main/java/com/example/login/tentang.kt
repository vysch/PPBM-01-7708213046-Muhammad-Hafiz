package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class tentang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tentang)

        val btn = findViewById<Button>(R.id.btnrating)
        val img_pindah = findViewById<ImageView>(R.id.backtentang)
        val bla = findViewById<RatingBar>(R.id.bla)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, home::class.java)

            startActivity(_intentPindah)
        }

        btn.setOnClickListener {
            val getRatingvalue = bla.rating
            Toast.makeText(
                this@tentang, "Rating = " + getRatingvalue, Toast.LENGTH_LONG
            ).show()
        }

    }
}