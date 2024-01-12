package com.example.login.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.login.R
import com.example.login.home

class chat2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat2, container, false)

        val btn_pindah = view.findViewById<Button>(R.id.submit)

        btn_pindah.setOnClickListener {
            val intentPindah = Intent(requireActivity(), home::class.java)
            startActivity(intentPindah)
        }

        return view
    }
}
