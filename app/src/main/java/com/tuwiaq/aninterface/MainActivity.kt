package com.tuwiaq.aninterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val secondScreenButton = findViewById<Button>(R.id.textsignUp)
        secondScreenButton.setOnClickListener { val i = Intent(this,SignUp::class.java)
        startActivity(i)}
    }
}