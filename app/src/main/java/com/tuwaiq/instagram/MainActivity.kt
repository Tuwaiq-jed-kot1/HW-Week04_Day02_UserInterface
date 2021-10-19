package com.tuwaiq.instagram

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

            val i = Intent(this,MainActivity2()::class.java)
            startActivity(i)
            finish()

        }
    }
}
