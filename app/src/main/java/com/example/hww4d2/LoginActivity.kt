package com.example.hww4d2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var signUpp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpp = findViewById(R.id.textView7)

        signUpp.setOnClickListener(){
            val intent = Intent(this, signUp::class.java)
            startActivity(intent)

        }
    }
}