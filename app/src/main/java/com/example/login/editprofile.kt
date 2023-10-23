package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class editprofile : AppCompatActivity() {
    private lateinit var spinner: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofile)

        val btn_pindahprofile = findViewById<Button>(R.id.sbmteprof)
        val img_pindahprofile = findViewById<ImageView>(R.id.backedtprof)

        img_pindahprofile.setOnClickListener {
            val _intentPindah =
                Intent(this,profile::class.java)

            startActivity(_intentPindah)
        }

        btn_pindahprofile.setOnClickListener {
            val _intentPindah =
                Intent(this,profile::class.java)

            startActivity(_intentPindah)
        }


        spinner = findViewById<Spinner>(R.id.spinner2)
        val listItem = listOf("Polymesa", "Cakrakara", "Eiheit", "Befairz")
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,listItem)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@editprofile,"you have selected $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }


        }

    }


}

