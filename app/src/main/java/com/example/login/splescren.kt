package com.example.login

import android.content.Intent
import android.os.Bundle
import android.transition.ArcMotion
import android.view.WindowManager
import android.view.WindowManager.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class splescren : AppCompatActivity (){
    private lateinit var motionLayout: MotionLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splescren)

        supportActionBar?.hide()
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,LayoutParams.FLAG_FULLSCREEN)

        motionLayout = findViewById(R.id.splescrena)
        motionLayout.startLayoutAnimation()

        motionLayout.setTransitionListener(object :MotionLayout.TransitionListener{
            override fun onTransitionStarted(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int
            ) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
                startActivity(Intent(this@splescren,slidetoact::class.java))
                finish()
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {

            }

        })
    }
}