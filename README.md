# User Interface Project
---
This assignment is for fun and learns some tools in the XML layout. As shown below, there are two screens of the Instagram app. 

- You need to create the same two screens and you need to activate two things in the `Sign-Up` screen and the `Logn-In` screen which are`Log in` Button and  `Sign Up` TextView. Thus, when the user clicking on `login button` in the `Sign-Up` screen will go to the `Logn-In` screen and when the user clicking on `Sign Up TextView` in the `Logn-In` screen will go to the `Sign-Up` screen.

>Note: You must use `ConstraintLayout` for both screens that you will design them.

### `Sign-Up` screen
![Sign-Up](signin.jpeg)
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout      xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="68dp"
        android:layout_marginTop="28dp"
        android:text="Instagram"
        android:textSize="60sp" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="192dp"
        android:layout_height="57dp"
        android:layout_alignParentStart="true"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginStart="119dp"
        android:layout_marginTop="103dp"
        android:text="Sign up to see photos and videos from your friends"
        android:textSize="16sp" />

    <Button
        android:id="@+id/button"
        android:layout_width="365dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="159dp"
        android:layout_marginEnd="25dp"
        android:backgroundTint="#03A9F4"
        android:text="Log in" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="249dp"
        android:layout_marginEnd="250dp"
        android:text="______________________" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_marginTop="248dp"
        android:layout_marginEnd="11dp"
        android:text="______________________" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginEnd="198dp"
        android:layout_marginBottom="464dp"
        android:text="or"
        android:textSize="16sp" />

    <EditText
        android:id="@+id/editTextTextEmailAddress"
        android:layout_width="244dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="308dp"
        android:layout_marginEnd="82dp"
        android:ems="10"
        android:hint="Mobile Number or Email"
        android:inputType="textEmailAddress" />

    <EditText
        android:id="@+id/editTextTextEmailAddress2"
        android:layout_width="246dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="359dp"
        android:layout_marginEnd="80dp"
        android:ems="10"
        android:hint="Full Name"
        android:inputType="textEmailAddress" />

    <EditText
        android:id="@+id/editTextTextEmailAddress3"
        android:layout_width="245dp"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_alignParentEnd="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="409dp"
        android:layout_marginEnd="80dp"
        android:ems="10"
        android:hint="Username"
        android:inputType="textEmailAddress" />

    <EditText
        android:id="@+id/editTextNumberPassword"
        android:layout_width="246dp"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginEnd="79dp"
        android:layout_marginBottom="226dp"
        android:ems="10"
        android:hint="Password"
        android:inputType="numberPassword" />

    <Button
        android:id="@+id/button2"
        android:layout_width="376dp"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginEnd="13dp"
        android:layout_marginBottom="139dp"
        android:backgroundTint="#03A9F4"
        android:text="Sign up" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="227dp"
        android:layout_height="44dp"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:layout_marginBottom="61dp"
        android:text="By signing up, you agree to our Teams & Privacy Policy."
        android:textSize="16sp" />
</RelativeLayout>

### `Logn-In` screen
![Logn-In](login.jpg)

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Instagram"
        android:textSize="60sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.496"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="76dp" />

    <EditText
        android:id="@+id/editTextTextEmailAddress4"
        android:layout_width="340dp"
        android:layout_height="50dp"
        android:ems="10"
        android:hint="Phone Number, username or email"
        android:inputType="textEmailAddress"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.492"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="175dp" />

    <EditText
        android:id="@+id/editTextNumberPassword2"
        android:layout_width="341dp"
        android:layout_height="43dp"
        android:ems="10"
        android:hint="Password"
        android:inputType="numberPassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="233dp" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Forgot password?"
        android:textColor="#2196F3"
        tools:layout_editor_absoluteX="264dp"
        tools:layout_editor_absoluteY="298dp" />

    <Button
        android:id="@+id/button3"
        android:layout_width="362dp"
        android:layout_height="54dp"
        android:backgroundTint="#03A9F4"
        android:text="Log in"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.51"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="360dp" />

    <TextView
        android:id="@+id/textView9"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="________________________"
        tools:layout_editor_absoluteX="25dp"
        tools:layout_editor_absoluteY="432dp" />

    <TextView
        android:id="@+id/textView13"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="________________________"
        tools:layout_editor_absoluteX="232dp"
        tools:layout_editor_absoluteY="432dp" />

    <TextView
        android:id="@+id/textView14"
        android:layout_width="341dp"
        android:layout_height="19dp"
        android:text="______________________________________________________"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="642dp" />

    <TextView
        android:id="@+id/textView10"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="or"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="432dp" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Log in with Facebook"
        android:textColor="#2196F3"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="462dp" />

    <TextView
        android:id="@+id/textView12"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Don'n have an account? "
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.444"
        app:layout_constraintStart_toStartOf="parent"
        tools:layout_editor_absoluteY="673dp" />

    <TextView
        android:id="@+id/textView15"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sign up"
        android:textColor="#2196F3"
        tools:layout_editor_absoluteX="266dp"
        tools:layout_editor_absoluteY="673dp" />
</androidx.constraintlayout.widget.ConstraintLayout>







