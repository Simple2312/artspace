package com.cmple.artspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class Explore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explore)

        val gift = findViewById(R.id.SplashScreenImage) as ImageView
        // set on-click listener
        gift.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@Explore, "You are one in a million!!!", Toast.LENGTH_SHORT).show()
        }
    }
}