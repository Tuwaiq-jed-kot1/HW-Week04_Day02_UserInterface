package com.example.week4day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin=findViewById(R.id.btnLogIn)
        btnlogin.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}