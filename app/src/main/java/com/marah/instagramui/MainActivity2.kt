package com.marah.instagramui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var btnSignup: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnLogin = findViewById(R.id.btnSecond1)
        btnSignup = findViewById(R.id.btnSecond2)

        btnLogin.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }

        btnSignup.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
   }
}