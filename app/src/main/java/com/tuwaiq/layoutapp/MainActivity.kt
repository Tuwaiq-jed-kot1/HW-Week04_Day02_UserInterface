package com.tuwaiq.layoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var signUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUp = findViewById(R.id.btn_to_signup)



        signUp.setOnClickListener{
            val i = Intent(this, SignUp::class.java)
            startActivity(i)
        }

    }
}