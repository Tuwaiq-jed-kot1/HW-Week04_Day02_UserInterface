package com.example.myapphw4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener{
            Toast.makeText(this,"Clicked", Toast.LENGTH_LONG).show()
            if(edUsername.text.trim().isNotEmpty() || edPassword.text.trim().isNotEmpty()){
                //
                Toast.makeText(this, "Inpt provid", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this, "Inpt required", Toast.LENGTH_LONG).show()
            }
        }
        tvRegister.setOnClickListener{
         val   intent= Intent(this, RegisterActivity::class.java);
            startActivitiey(intent)
        }
    }}
