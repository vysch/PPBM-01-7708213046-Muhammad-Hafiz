package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_pindah = findViewById<Button>(R.id.editButton)
        val img_pindah = findViewById<ImageView>(R.id.backprof)
        val btn_pindah2 = findViewById<Button>(R.id.Logout)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,home ::class.java)

            startActivity(_intentPindah)
        }

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,editprofile::class.java)

            startActivity(_intentPindah)
        }
        btn_pindah2.setOnClickListener {
            val _intentPindah =
                Intent(this,MainActivity::class.java)

            startActivity(_intentPindah)
        }

    }
}