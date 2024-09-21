package com.example.e_detect

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class status : AppCompatActivity() {
    private lateinit var backbtn: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        backbtn = findViewById(R.id.backbtn)

        backbtn.setOnClickListener{
            val intent = Intent(this, StartingUi::class.java)
            startActivity(intent)
            }
    }
}
