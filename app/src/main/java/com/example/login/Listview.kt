package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.login.databinding.ActivityListviewBinding


class Listview : AppCompatActivity() {

    private lateinit var binding : ActivityListviewBinding
    private lateinit var userArrayList : ArrayList<user>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img_pindah = findViewById<ImageView>(R.id.backmsg)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,home::class.java)

            startActivity(_intentPindah)
        }

        val imageId = intArrayOf(

            R.drawable.pp2,R.drawable.pp3,R.drawable.pp4,R.drawable.pp5,R.drawable.pp6,
            R.drawable.pp7,R.drawable.pp8,R.drawable.pp9,
        )
        val Lastmessage = arrayOf(
            "darimana aja lu",
            "rawrrrrr",
            "p login aing hyper estes",
            "mana ada cokk",
            "cape banget aing",
            "salsabilaa gak sihh",
            "wdp dulu aja cokk",
            "ai lu udah belum??",
        )

        val name = arrayOf(

            "Mamad",
            "Praszz",
            "Hateee",
            "Surnan",
            "kinor",
            "Piscolll",
            "Reisa",
            "Konyol",
        )

        val phoneNo = arrayOf(
            "085624164709","085159990853","085242051626","085242421000","085259990853",
            "085459990852","085059990853","085659990853"
        )

        val lastmsgTime = arrayOf(
            "9:00 pm","5:00 pm","1:00 pm","7:00 pm","3:00 pm",
            "2:00 pm","8:00 pm","10:00 pm","4:00 pm","6:00 pm",
        )

        val country = arrayOf(

            "amerika","Indonesia","Thailand","Malaysia","Singapura",
            "Australia","Brunei Darussalam","Filipina"
        )



        userArrayList = ArrayList()

        for (i in name.indices){

            val user = user(name[i], Lastmessage[i], lastmsgTime[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
        binding.listanggota.isClickable = true
        binding.listanggota.adapter = myAdapter(this,userArrayList)
        binding.listanggota.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageid = imageId[position]

            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("country",country)
            i.putExtra("phone",phone)
            i.putExtra("imageId",imageid)
            startActivity(i)
        }
    }



}
