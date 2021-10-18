package com.tuwaiq.instaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var logInButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logInButton= findViewById(R.id.btnLog)
        logInButton.setOnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)

        }
    }
}