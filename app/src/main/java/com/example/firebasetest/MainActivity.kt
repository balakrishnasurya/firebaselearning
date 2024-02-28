package com.example.firebasetest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var btnInsert : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInsert = findViewById<Button>(R.id.btnIN)

        btnInsert.setOnClickListener{
            val intent = Intent(this,inputactivity::class.java)
            startActivity(intent)
        }
        val firebase : FirebaseDatabase = FirebaseDatabase.getInstance()

    }
}