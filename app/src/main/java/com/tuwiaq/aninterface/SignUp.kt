package com.tuwiaq.aninterface

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signuppage)

      val log = findViewById<Button>(R.id.LogIn)
        log.setOnClickListener { val i = Intent(this ,MainActivity::class.java )
        startActivity(i)}

       val  blog = findViewById<Button>(R.id.button)
        blog.setOnClickListener { val i = Intent(this, MainActivity::class.java)
        startActivity(i)}
    }
}