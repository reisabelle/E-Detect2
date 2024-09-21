package com.example.e_detect

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.provider.MediaStore

class status : AppCompatActivity() {
    private lateinit var backbtn: ImageView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        imageView = findViewById(R.id.imageView2)  // Link to your ImageView in the layout

        // Get the image URI from the intent
        val imageUri = intent.getStringExtra("imageUri")
        if (imageUri != null) {
            val uri = Uri.parse(imageUri)
            val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)

            // Display the image in the ImageView
            imageView.setImageBitmap(bitmap)
        }

        backbtn = findViewById(R.id.backbtn)

        backbtn.setOnClickListener {
            val intent = Intent(this, StartingUi::class.java)
            startActivity(intent)
        }
    }
}
