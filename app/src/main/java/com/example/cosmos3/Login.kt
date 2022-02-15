package com.example.cosmos3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btn=findViewById<TextView>(R.id.textViewSignUp)
        btn.setOnClickListener {
            btn.setOnClickListener {
                startActivity(Intent(this, Register::class.java))
            }

            }
    }
}