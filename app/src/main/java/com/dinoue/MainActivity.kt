package com.dinoue

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// 1. Let's detect when  the user clicks on the
    findViewById<Button>(R.id.button).setOnClickListener {
        // Code in here is going to be executed when the user cliks on a button
        Log.i("Caren","User clicked on button")
    }
    }
}