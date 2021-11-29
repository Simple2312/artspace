 package com.cmple.artspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.cmple.artspace.demo.TodayActivity
import com.example.mypaint.ui.drawart

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         // get reference to ImageView
         val cat = findViewById(R.id.cat) as ImageView
         // set on-click listener
         cat.setOnClickListener {
             // your code to perform when the user clicks on the ImageView
             Toast.makeText(this@MainActivity, "meow!!!", Toast.LENGTH_SHORT).show()
         }

         val work = findViewById(R.id.SplashScreenImage) as ImageView
         // set on-click listener
         work.setOnClickListener {
             // your code to perform when the user clicks on the ImageView
             Toast.makeText(this@MainActivity, "Cheer up!!!", Toast.LENGTH_SHORT).show()
         }

         //explore

         val button = findViewById<Button>(R.id.materialButton6)
         button.setOnClickListener{
             val intent = Intent(this,Explore::class.java)
             startActivity(intent)
         }

         //artcard

         val button1 = findViewById<Button>(R.id.materialButton4)
         button1.setOnClickListener{
             val intent = Intent(this, TodayActivity::class.java)
             startActivity(intent)
         }
         //artjournal

         val button2 = findViewById<Button>(R.id.materialButton5)
         button2.setOnClickListener{
             val intent = Intent(this,Artjournal::class.java)
             startActivity(intent)
         }
     }
 }
