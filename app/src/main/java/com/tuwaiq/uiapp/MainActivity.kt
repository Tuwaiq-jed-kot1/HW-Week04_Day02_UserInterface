package com.tuwaiq.uiapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SignUpLogin : AppCompatActivity() {
    private lateinit var circleImageView : ImageView
    private lateinit var login : Button
    private lateinit var signup : TextView
    private lateinit var signInSignupBtn : Button
    private lateinit var signInSignupTxt : TextView
    private lateinit var forgotPassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        circleImageView = findViewById(R.id.circleImageView)
        login = findViewById(R.id.signin)
        signup = findViewById(R.id.signup)
        signInSignupBtn = findViewById(R.id.signin_signup_btn)
        signInSignupTxt = findViewById(R.id.signin_signup_txt)
        forgotPassword = findViewById(R.id.forgot_password)

        login.setOnClickListener {
            login.setTextColor(Color.parseColor("#FFFFFF"))
            login.setBackgroundColor(Color.parseColor("#FF2729C3"))
            login.setTextColor(Color.parseColor("#FF2729C3"))
            login.setBackgroundResource(R.drawable.bordershape)
            circleImageView.setImageResource(R.drawable.instagram_logo)
            signInSignupTxt.text = "Sign In"
            signInSignupBtn.text = "Sign In"
            forgotPassword.visibility = View.VISIBLE
        }
        signup.setOnClickListener {
            signup.setTextColor(Color.parseColor("#FFFFFF"))
            signup.setBackgroundColor(Color.parseColor("#FF2729C3"))
            login.setTextColor(Color.parseColor("#FF2729C3"))
            login.setBackgroundResource(R.drawable.bordershape)
            circleImageView.setImageResource(R.drawable.instagram_logo)
            signInSignupTxt.text = "Sign Up"
            signInSignupBtn.text = "Sign Up"
            forgotPassword.visibility = View.INVISIBLE
        }
    }
}