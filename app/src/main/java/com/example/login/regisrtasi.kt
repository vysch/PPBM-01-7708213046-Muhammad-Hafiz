package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class regisrtasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regisrtasi)

        val btn_pindah = findViewById<Button>(R.id.submit)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,home::class.java)

            startActivity(_intentPindah)
        }

    }
}