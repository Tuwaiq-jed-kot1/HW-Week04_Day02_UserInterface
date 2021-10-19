# User Interface Project
---
This assignment is for fun and learns some tools in the XML layout. As shown below, there are two screens of the Instagram app. 

- You need to create the same two screens and you need to activate two things in the `Sign-Up` screen and the `Logn-In` screen which are`Log in` Button and  `Sign Up` TextView. Thus, when the user clicking on `login button` in the `Sign-Up` screen will go to the `Logn-In` screen and when the user clicking on `Sign Up TextView` in the `Logn-In` screen will go to the `Sign-Up` screen.

>Note: You must use `ConstraintLayout` for both screens that you will design them.

### `Sign-Up` screen
![Sign-Up](signin.jpeg)
// --->>>.sign up layout
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
tools:context=".SignUp">


    <TextView
        android:id="@+id/instaLogo2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="serif"
        android:text="Instagram"
        android:textSize="30sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView4"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        android:layout_marginBottom="15dp"/>

    <TextView
        android:id="@+id/textView4"
        android:layout_width="216dp"
        android:layout_height="51dp"
        android:fontFamily="sans-serif-medium"
        android:text="sign up to see photo and videos from your frinds"
        android:textSize="20sp"
        app:layout_constraintBottom_toTopOf="@+id/btn_to_login"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    <Button
        android:id="@+id/btn_to_login"
        android:layout_width="178dp"
        android:layout_height="48dp"
        android:text="Log in"
        android:background="#42a5f5"
        tools:layout_editor_absoluteY="168dp"
        android:layout_margin="10dp"/>
    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ــــــــــــــــــــــــــــــــــــــــــــــــــــــــ  or  ــــــــــــــــــــــــــــــــــــــــــــــــــــــــ"
        android:layout_margin="15sp"/>



    <EditText
    android:id="@+id/editTextTextEmailAddress"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:ems="10"
    android:hint="mubile number, or e-mail"
    android:inputType="textEmailAddress"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintHorizontal_bias="0.502"
    app:layout_constraintStart_toStartOf="parent"
    tools:layout_editor_absoluteY="265dp" />
    <EditText
        android:id="@+id/editTextTextPersonName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="full name"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="326dp" />


    <EditText
        android:id="@+id/editTextTextPersonName2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="user name"
        android:inputType="textPersonName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="394dp" />
    <EditText
        android:id="@+id/editTextTextPassword2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="password"
        android:inputType="textPassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="461dp" />

    <Button
    android:id="@+id/button2"
    android:layout_width="156dp"
    android:layout_height="53dp"
    android:text="Sign up"
        android:background="#42a5f5"
        app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    tools:layout_editor_absoluteY="515dp" />

<TextView
    android:id="@+id/textView6"
    android:layout_width="216dp"
    android:layout_height="42dp"
    android:fontFamily="sans-serif-medium"
    android:text="By signing up, you agree to our Terms and Privacy Policy"
    android:textSize="16sp"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    tools:layout_editor_absoluteY="580dp" />
</LinearLayout>



// ------->>>>>>>sign up activate
package com.tuwaiq.layoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    private lateinit var logIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)



        logIn = findViewById(R.id.btn_to_login)

        logIn.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }
}


### `Logn-In` screen
![Logn-In](login.jpg)
//--->>>>>>>>>> activate layout
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"

    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/frameLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:background="@color/white">

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="206dp"
        android:layout_height="149dp"
        app:srcCompat="@drawable/insta_login_logo"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/instaLogo"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:fontFamily="serif"
        android:text="Instagram"
        android:textSize="30sp"
        android:textStyle="bold"
        android:layout_marginBottom="40sp"
        tools:ignore="MissingConstraints" />

    <EditText
        android:id="@+id/editTextTextPassword"
        android:layout_width="298dp"
        android:layout_height="48dp"
        android:ems="10"
        android:hint="password"
        android:layout_marginBottom="20sp"
        android:inputType="textPassword"
        tools:ignore="MissingConstraints" />

    <EditText
        android:id="@+id/editTextTextEmailAddress2"
        android:layout_width="299dp"
        android:layout_height="42dp"
        android:ems="10"
        android:hint="phone number, user name or e-mail"
        android:inputType="textEmailAddress"
        android:layout_marginBottom="20sp"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Forgot password?"
        tools:ignore="MissingConstraints"
        android:layout_gravity="right"
        android:layout_marginRight="30dp"
        android:layout_marginBottom="20sp" />

    <Button
        android:id="@+id/btnLogein"
        android:layout_width="280dp"
        android:layout_height="54dp"
        android:text="Loge in"
        android:background="#42a5f5"
        app:layout_constraintBottom_toTopOf="@+id/textView3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextPassword"
        tools:ignore="MissingConstraints" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ  or  ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="516dp"
        tools:ignore="MissingConstraints" />

    <Button
        android:id="@+id/btn_to_signup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#42a5f5"
        android:text="Sign up"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3"
        tools:ignore="MissingConstraints" />

</LinearLayout>


// ----->>>>>>>>>>. main activate
package com.tuwaiq.layoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var signUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUp = findViewById(R.id.btn_to_signup)



        signUp.setOnClickListener{
            val i = Intent(this, SignUp::class.java)
            startActivity(i)
        }

    }
}







