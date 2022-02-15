package com.example.cosmos3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Projects : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        supportActionBar?.hide()
    }
}