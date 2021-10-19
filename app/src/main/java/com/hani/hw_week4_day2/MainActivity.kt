package com.hani.hw_week4_day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var logInButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logInButton = findViewById(R.id.logInButton)

        logInButton.setOnClickListener{
            val i = Intent(this, LogIn::class.java)
            startActivity(i)
        }
    }
}