package com.tuwaiq.husam.testan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textBtn: TextView
    private lateinit var buttonLogIn: Button

    companion object {
        fun newIntent(contextPackage: Context): Intent {
            return Intent(contextPackage, MainActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textBtn = findViewById(R.id.textSignUp1)
        buttonLogIn = findViewById(R.id.btnLogin)
        buttonLogIn.setOnClickListener {
            startActivity(SignUp.newIntent(this))
        }
        textBtn.setOnClickListener {
            startActivity(SignUp.newIntent(this))
        }
    }
}