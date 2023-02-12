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
        val btnASphere=findViewById<Button>(R.id.btnASphere)
        btnASphere.setOnClickListener(){
            val intent=Intent(this,AreaOfSphere::class.java)
            startActivity(intent)
        }
        val btnVsphere=findViewById<Button>(R.id.btnVsphere)
        btnVsphere.setOnClickListener(){
            val intent=Intent(this,VolumeOfSphere::class.java)
            startActivity(intent)

        }
        var btnTriangle=findViewById<Button>(R.id.btnTriangle)
        btnTriangle.setOnClickListener(){
            val intent=Intent(this,AreaOfTriangle::class.java)
            startActivity(intent)

        }
        var btnAbt=findViewById<Button>(R.id.btnAbt)
        btnAbt.setOnClickListener(){
            var intent=Intent(this,AreaOfTriangle::class.java)
            startActivity(intent)
        }


    }
}