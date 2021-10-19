package com.tuwaiq.instagram


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var txtSignUp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txtSignUp=findViewById(R.id.txt_signUp)
        txtSignUp.setOnClickListener {

            val i = Intent(this,MainActivity()::class.java)
            startActivity(i)
            finish()


        }
    }
}