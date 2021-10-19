package com.example.instgram
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sign_upp:TextView = findViewById(R.id.sign_upp)
        sign_upp.setOnClickListener {
            val intent = Intent(this, signingUp::class.java)
            startActivity(intent)
        }

    }
}
