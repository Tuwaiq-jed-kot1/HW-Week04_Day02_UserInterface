package com.tuwaiq.husam.testan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    private lateinit var buttonSignUp: Button
    private lateinit var buttonlogIn: Button
    companion object {
        fun newIntent(contextPackage: Context): Intent {
            return Intent(contextPackage, SignUp::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        buttonSignUp= findViewById(R.id.btnSignUp)
        buttonlogIn = findViewById(R.id.btnLogin2)
        buttonlogIn.setOnClickListener {
            startActivity(MainActivity.newIntent(this))
        }
        buttonSignUp.setOnClickListener {
            startActivity(MainActivity.newIntent(this))
        }
    }
}