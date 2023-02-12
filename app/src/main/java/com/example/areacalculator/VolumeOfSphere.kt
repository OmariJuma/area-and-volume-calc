package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VolumeOfSphere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume_of_sphere)
        var txtVolRadius=findViewById<TextView>(R.id.txtVolRadius)
        var btnVolSphere=findViewById<Button>(R.id.btnVolSphere)
        btnVolSphere.setOnClickListener(){
            var vol=txtVolRadius.text.toString().toInt()
            txtVolRadius.text=vol.toString()
        }
    }
}