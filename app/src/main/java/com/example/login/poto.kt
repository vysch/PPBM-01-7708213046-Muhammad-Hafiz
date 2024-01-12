package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class poto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.poto)

        val img_pindah = findViewById<ImageView>(R.id.backpoto)
        val pt_pindah2 = findViewById<ImageView>(R.id.pt1)
        val pt_pindah3 = findViewById<ImageView>(R.id.pt2)
        val pt_pindah4 = findViewById<ImageView>(R.id.pt3)
        val pt_pindah5 = findViewById<ImageView>(R.id.pt4)
        val pt_pindah1 = findViewById<ImageView>(R.id.pt5)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, home::class.java)

            startActivity(_intentPindah)
        }

        pt_pindah1.setOnClickListener {
            val _intentPindah =
                Intent(this, slideshow::class.java)

            startActivity(_intentPindah)
        }

        pt_pindah2.setOnClickListener {
            val _intentPindah =
                Intent(this, slideshow::class.java)

            startActivity(_intentPindah)
        }

        pt_pindah3.setOnClickListener {
            val _intentPindah =
                Intent(this, slideshow::class.java)

            startActivity(_intentPindah)
        }

        pt_pindah4.setOnClickListener {
            val _intentPindah =
                Intent(this, slideshow::class.java)

            startActivity(_intentPindah)
        }

        pt_pindah5.setOnClickListener {
            val _intentPindah =
                Intent(this, slideshow::class.java)

            startActivity(_intentPindah)
        }


    }
}