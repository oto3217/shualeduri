package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextButton =findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })
    }
}