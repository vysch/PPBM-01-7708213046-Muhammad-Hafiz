package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah = findViewById<Button>(R.id.loginButton)
        val txt_pindah = findViewById<TextView>(R.id.signupText)
        val iput_username = findViewById<EditText>(R.id.username)
        val iput_password = findViewById<EditText>(R.id.password)


        btn_pindah.setOnClickListener {

            val isianusername = iput_username.text.toString()
            val isianpassword = iput_password.text.toString()

            if( isianusername != "" &&
                isianpassword != "")
            {
                // B - lanjut ke pengecekkan selanjutnya (username-password match?)
                if( isianusername.equals("telu") &&
                    isianpassword.equals("mamad")){
                    val _intent =
                        Intent(this,home::class.java)

                    startActivity(_intent)
                }
                else{
                    Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                    val alert = AlertDialog.Builder(this)
                    alert.setTitle("Pesan")
                    alert.setMessage("masih ada yang salah niii, coba ulang")
                    alert.show()
                    // password + username mismatch
                }
            }
            else
            {
                Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                val alert = AlertDialog.Builder(this)
                alert.setTitle("Pesan")
                alert.setMessage("Jangan Ada Yang Kosong")
                alert.show()
            }
        }

        txt_pindah.setOnClickListener {
            val _intent =
                Intent(this,regisrtasi::class.java)

            startActivity(_intent)
        }


    }
}
