package com.example.login.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.login.R
import com.example.login.home
import com.example.login.regisrtasi

class chat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        val buttonInFragment = view.findViewById<Button>(R.id.loginButton)
        val iput_username = view.findViewById<EditText>(R.id.username)
        val iput_password = view.findViewById<EditText>(R.id.password)
        val txt_pindah = view.findViewById<TextView>(R.id.signupText)

        buttonInFragment.setOnClickListener {
            val isianusername = iput_username.text.toString()
            val isianpassword = iput_password.text.toString()

            if (isianusername.isNotBlank() && isianpassword.isNotBlank()) {
                // Continue to the next check (username-password match?)
                if (isianusername == "telu" && isianpassword == "mamad") {
                    val intent = Intent(requireContext(), home::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(requireContext(), "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                    val alert = AlertDialog.Builder(requireContext())
                    alert.setTitle("Pesan")
                    alert.setMessage("Masih ada yang salah niii, coba ulang")
                    alert.show()
                    // password + username mismatch
                }
            } else {
                Toast.makeText(requireContext(), "Wrong Username or Password!", Toast.LENGTH_LONG).show()

                val alert = AlertDialog.Builder(requireContext())
                alert.setTitle("Pesan")
                alert.setMessage("Jangan Ada Yang Kosong")
                alert.show()
            }
        }

        txt_pindah.setOnClickListener {
            val _intent = Intent(requireContext(), regisrtasi::class.java)
            startActivity(_intent)
        }

        return view
    }
}
