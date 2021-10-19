package com.mahila.Week04_Day02_UserInterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class logup : AppCompatActivity() {
    private lateinit var loginT: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logup)
        loginT = findViewById(R.id.b11)
        loginT.setOnClickListener {

            val i = Intent(this, login::class.java)
            startActivity(i)
        }
    }
}