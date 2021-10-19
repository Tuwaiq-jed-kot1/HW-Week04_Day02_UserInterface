package com.tuwaiq.week4hw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUp : AppCompatActivity() {
    private lateinit var txtSignUp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        txtSignUp=findViewById(R.id.txt_signUp)
        txtSignUp.setOnClickListener {

            val i = Intent(this,MainActivity()::class.java)
            startActivity(i)
            finish()


        }
    }
}