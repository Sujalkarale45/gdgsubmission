package com.example.gdg_task

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.*
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        imageView = findViewById(R.id.imageView)

        // Reference to the Firebase Realtime Database
        database = FirebaseDatabase.getInstance().getReference("banner")

        // Real-time listener for database changes
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val message = snapshot.child("message").getValue(String::class.java)
                val imageUrl = snapshot.child("imageUrl").getValue(String::class.java)

                textView.text = message

                // Load the image using Picasso
                Picasso.get().load(imageUrl).into(imageView)
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle errors
            }
        })
    }
}
