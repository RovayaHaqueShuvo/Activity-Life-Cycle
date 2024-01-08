package com.example.activitylifecycle

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "onCreate",Toast.LENGTH_SHORT).show()

        Log.d("Tag", "onCreate I'm Running")

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onStart I'm Running")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onResume I'm Running")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onPause I'm Running")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onStop I'm Running")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onRestart I'm Running")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy",Toast.LENGTH_SHORT).show()
        Log.d("Tag", "onDestroy I'm Running")
    }
}