package com.albasil.relativlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnSnignUp:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSnignUp=findViewById(R.id.id_signUp)

        btnSnignUp.setOnClickListener{

            val i = Intent(this,SignUp()::class.java)
            startActivity(i)
            finish()

        }
    }
}