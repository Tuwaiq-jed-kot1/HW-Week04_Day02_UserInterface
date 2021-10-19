package com.mahila.Week04_Day02_UserInterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {

    private lateinit var logupT: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logupT = findViewById(R.id.tv3)
        logupT.setOnClickListener {

            val i = Intent(this, logup::class.java)
             startActivity(i)
        }

    }
}