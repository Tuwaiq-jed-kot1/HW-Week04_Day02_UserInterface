package com.tuwaiq.layoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    private lateinit var logIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



        logIn = findViewById(R.id.btn_to_login)

        logIn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}