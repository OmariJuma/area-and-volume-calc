package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class AreaCircle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_circle)
//        val pi:Double=3.142

        var btnAreaCircle=findViewById<Button>(R.id.btnAreaCircle)
        var edTxtRadius=findViewById<EditText>(R.id.edTxtRadius)
        var txtAnswer=findViewById<TextView>(R.id.txtAnswer)

        btnAreaCircle.setOnClickListener() {
            var area=3.142*edTxtRadius.text.toString().toDouble()*edTxtRadius.text.toString().toDouble()
            txtAnswer.text = area.toString()

       }
    }
}