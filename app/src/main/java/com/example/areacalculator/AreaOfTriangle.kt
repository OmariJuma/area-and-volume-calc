package com.example.areacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AreaOfTriangle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_of_triangle)
        var txtLength=findViewById<TextView>(R.id.txtLength)
        var txtWidth=findViewById<TextView>(R.id.txtWidth)
        var btnATri=findViewById<Button>(R.id.btnATri)
        var txtTriAnswer=findViewById<TextView>(R.id.txtTriAnswer)
        btnATri.setOnClickListener(){
            var area=txtWidth.text.toString().toInt()*txtLength.text.toString().toInt()
            txtTriAnswer.text=area.toString()
        }
    }
}