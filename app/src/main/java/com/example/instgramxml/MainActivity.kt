package com.example.instgramxml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttenLogIn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttenLogIn=findViewById(R.id.btnLogin)

        buttenLogIn.setOnClickListener{

            val i = Intent(this,MainActivity2()::class.java)
            startActivity(i)
            finish()

        }
    }
}