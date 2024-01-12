package com.example.login

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class home : AppCompatActivity() {
    private lateinit var dash: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        dash = findViewById(R.id.dash)

        dash.setOnClickListener {
            showDialog()
        }


        val crd_pindahtentang = findViewById<CardView>(R.id.cardtentang)


        crd_pindahtentang.setOnClickListener {
            val _intentpindah =
                Intent(this,tentang::class.java)

            startActivity(_intentpindah)
        }

    }
    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.bottomlayout)

        val pindahprofile = dialog.findViewById<CardView>(R.id.profile)
        val pindahgalery = dialog.findViewById<CardView>(R.id.tombolgalery)
        val pindahchat = dialog.findViewById<CardView>(R.id.chat)
        val pindahnews = dialog.findViewById<CardView>(R.id.berita)
        val exit = dialog.findViewById<Button>(R.id.ExitButton)

        pindahprofile.setOnClickListener {
            val _intentpindah =
                Intent(this, profile::class.java)
            startActivity(_intentpindah)
        }
        pindahgalery.setOnClickListener {
            val _intentpindah =
                Intent(this, poto::class.java)
            startActivity(_intentpindah)
        }
        pindahchat.setOnClickListener {
            val _intentpindah =
                Intent(this, Listview::class.java)
            startActivity(_intentpindah)
        }
        pindahnews.setOnClickListener {
            val _intentpindah =
                Intent(this, berita::class.java)
            startActivity(_intentpindah)
        }
        exit.setOnClickListener {
            dialog.dismiss()
            Toast.makeText(this, "terima kasih", Toast.LENGTH_SHORT).show()
        }
        dialog.show()
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.attributes?.windowAnimations = R.style.dialoganimation
        dialog.window?.setGravity(Gravity.BOTTOM)
    }
}