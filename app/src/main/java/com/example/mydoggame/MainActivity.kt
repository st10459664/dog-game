package com.example.mydoggame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Button: Button = findViewById(R.id.playbutton)
        val imageView: ImageView = findViewById(R.id.dogimage)
        val textView: TextView = findViewById(R.id.textView1)

        Button.setOnClickListener {
            // Navigate to the next activity
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}