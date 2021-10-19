package com.example.hww4d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent




class MainActivity : AppCompatActivity() {
    private lateinit var butlog: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butlog = findViewById(R.id.btnLog)

        butlog.setOnClickListener(){
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)

        }
    }
}