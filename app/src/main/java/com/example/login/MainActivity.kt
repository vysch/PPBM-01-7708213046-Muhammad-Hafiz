package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah = findViewById<Button>(R.id.loginButton)
        val txt_pindah = findViewById<TextView>(R.id.signupText)


        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,home::class.java)

            startActivity(_intentPindah)
        }

        txt_pindah.setOnClickListener {
            val _intent =
                Intent(this,regisrtasi::class.java)

            startActivity(_intent)
        }


    }
}