package com.example.week4day2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var txt:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txt= findViewById(R.id.textView3)
        txt.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}