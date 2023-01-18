package com.example.water

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mainImage: ImageButton
    lateinit var btnAdd: Button
    lateinit var btnAlarm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainImage = findViewById(R.id.mainImage)
        btnAdd = findViewById(R.id.btnAdd)
        btnAlarm = findViewById(R.id.btnAlarm)

        btnAdd.setOnClickListener {
            val intent = Intent(this, user_setting::class.java)
            startActivity(intent)
        }

        mainImage.setOnClickListener {
            val intent = Intent(this, Calendar::class.java)
            startActivity(intent)
        }
    }
}