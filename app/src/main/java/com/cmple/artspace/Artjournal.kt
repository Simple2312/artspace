package com.cmple.artspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.mypaint.ui.drawart

class Artjournal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artjournal)




        val button3 = findViewById<ImageView>(R.id.SplashScreenImage)
        button3.setOnClickListener {
            val intent = Intent(this, drawart::class.java)
            startActivity(intent)
            finish()

        }


    }
}