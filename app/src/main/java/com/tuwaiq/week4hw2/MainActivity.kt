package com.tuwaiq.week4hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnLogIn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogIn=findViewById(R.id.btn_login)
        btnLogIn.setOnClickListener{

            val i = Intent(this,SignUp()::class.java)
            startActivity(i)
            finish()

        }
    }
}