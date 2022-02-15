package com.example.cosmos3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        //listner for about us
        val aboutUs = findViewById<CardView>(R.id.aboutus)
        aboutUs.setOnClickListener {
            startActivity(Intent(this, Aboutus::class.java))
        }

        //listner for contact us
        val contactUs = findViewById<CardView>(R.id.contactus)
        contactUs.setOnClickListener {
            startActivity(Intent(this, Contactus::class.java))
        }

        //listner for projects
        val Project = findViewById<CardView>(R.id.project)
        Project.setOnClickListener {
            startActivity(Intent(this, Projects::class.java))
        }

        val joinUs = findViewById<CardView>(R.id.joinus)
        joinUs.setOnClickListener {
            startActivity(Intent(this, Contactus::class.java))
        }
        val faq = findViewById<CardView>(R.id.faq)
        faq.setOnClickListener {
            startActivity(Intent(this, FAQs::class.java))
        }
    }
}