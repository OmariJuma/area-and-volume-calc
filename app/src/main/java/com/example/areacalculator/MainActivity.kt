package com.example.areacalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnarea=findViewById<Button>(R.id.btnCircle)
        btnarea.setOnClickListener(){
            val intent=Intent(this,AreaCircle::class.java)
            startActivity(intent)
        }
    }
}