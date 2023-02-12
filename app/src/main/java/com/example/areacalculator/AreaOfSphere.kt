package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AreaOfSphere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_of_sphere)
        var txtAreaRadius=findViewById<EditText>(R.id.txtAreaRadius)
        var btnAreaSphere=findViewById<Button>(R.id.btnAreaSphere)
        var txtAnswer1=findViewById<TextView>(R.id.txtAnswer1)
        btnAreaSphere.setOnClickListener(){
            var area=4*3.142*txtAreaRadius.text.toString().toInt()*txtAreaRadius.text.toString().toInt()
            txtAnswer1.text=area.toString()
        }
    }
}