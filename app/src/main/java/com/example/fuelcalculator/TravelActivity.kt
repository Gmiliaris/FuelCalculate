package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class TravelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_travel)
        val edtTrip = findViewById<TextInputEditText>(R.id.edt_Trip)
        val btnNext = findViewById<Button>(R.id.btn_Next)
        btnNext.setOnClickListener {
            val tripStr: String = edtTrip.text.toString()

            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}