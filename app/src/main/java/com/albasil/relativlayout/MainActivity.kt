package com.albasil.relativlayout

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnSnignUp:TextView
    private lateinit var btnLogin:Button
    private lateinit var editPassword:EditText
    private lateinit var editUserName:EditText
    private lateinit var login_facebook:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin=findViewById(R.id.id_login)
        btnSnignUp=findViewById(R.id.id_signUp)
        editPassword=findViewById(R.id.editTextTextPassword)
        editUserName=findViewById(R.id.editTextUser)

        login_facebook=findViewById(R.id.id_login_facebook)
        btnLogin.setOnClickListener {

            if (editPassword.text.isNotEmpty() && editUserName.text.isNotEmpty()){

                Toast.makeText(this, "Welcome ${editUserName.text}", Toast.LENGTH_SHORT).show()


            }else{
                Toast.makeText(this, "Please you must input user name or pass", Toast.LENGTH_SHORT).show()
            }


        }

        btnSnignUp.setOnClickListener{

            val i = Intent(this,SignUp()::class.java)
            startActivity(i)
            finish()

        }



        login_facebook.setOnClickListener{

            startActivity(getOpenFacebookIntent());

        }



    }

    private fun getOpenFacebookIntent(): Intent? {
        return try {
            packageManager.getPackageInfo("com.facebook.katana", 0)
            Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/426253597411506"))
        } catch (e: Exception) {
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/appetizerandroid"))
        }
    }
}