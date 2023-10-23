package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class berita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.berita)

        val img_pindah = findViewById<ImageView>(R.id.backnews)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,home::class.java)

            startActivity(_intentPindah)
        }

    }
}