package com.example.a

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    var txtUsername: TextView? = null
    var txtPassword: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtUsername = findViewById<TextView?>(R.id.txtUsername)
        txtPassword = findViewById<TextView?>(R.id.txtPassword)

        val username = getIntent().getStringExtra("username")
        val password = getIntent().getStringExtra("password")

        txtUsername!!.setText("نام کاربری: " + username)
        txtPassword!!.setText("رمز عبور: " + password)
    }
}