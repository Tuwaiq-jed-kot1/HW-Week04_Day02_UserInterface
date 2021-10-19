package com.albasil.relativlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {

    private lateinit var btnLogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        btnLogin=findViewById(R.id.id_login)

        btnLogin.setOnClickListener{

            val i = Intent(this,MainActivity()::class.java)
            startActivity(i)
            finish()

        }
    }


    }