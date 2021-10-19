package com.tuwaiq.instgram_interface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtview_signup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtview_signup=findViewById(R.id.login_signupPage)
        txtview_signup.setOnClickListener{
            val intent = Intent(this,signup ::class.java)
            startActivity(intent)
        }
    }
}