package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class slideshow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slideshow)

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()
        val text_pindah = findViewById<TextView>(R.id.begal)

        text_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,poto ::class.java)

            startActivity(_intentPindah)
        }

        imageList.add(SlideModel("https://tse1.mm.bing.net/th?id=OIP.GPlf57_taNe99QFn5p4dUgHaHa&pid=Api&P=0&h=180", "street photograpy "))
        imageList.add(SlideModel("https://tse1.mm.bing.net/th?id=OIP.eN2Ae1P5lBfcbBTA64K7rQAAAA&pid=Api&P=0&h=180", "Street photograpy"))
        imageList.add(SlideModel("https://tse1.mm.bing.net/th?id=OIP.WPPDwwWJrw57visLyM8pbgHaHa&pid=Api&P=0&h=180", "street photograpy "))
        imageList.add(SlideModel("https://tse3.mm.bing.net/th?id=OIP.-xJpeK2_XxtdFFtv1DOwFgHaHa&pid=Api&P=0&h=180", "street photograpy "))
        imageList.add(SlideModel("https://tse4.mm.bing.net/th?id=OIP.v31S3Q79d3VpLPDy2dhH8QHaHT&pid=Api&P=0&h=180", " photograpy "))
        imageList.add(SlideModel("https://tse1.mm.bing.net/th?id=OIP.2IYKyhsCVIgeDaoL7KIJeAHaHa&pid=Api&P=0&h=180", " photograpy "))

        imageSlider.setImageList(imageList)
    }


}