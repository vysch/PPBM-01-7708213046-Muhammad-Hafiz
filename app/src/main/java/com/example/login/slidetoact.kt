package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class slidetoact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidetoact)

        val slide = findViewById<SlideToActView>(R.id.slide)

        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {

                val _intent = Intent(this@slidetoact, viewpager::class.java)
                startActivity(_intent)
            }
        }
    }
}