package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class ConsumptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consumption)

        val edtConsumption = findViewById<TextInputEditText>(R.id.edt_Consumption)
        val btnNext = findViewById<Button>(R.id.btn_Next)
        btnNext.setOnClickListener {
            val consumptionStr: String = edtConsumption.text.toString()
            println("teste")

            val intent = Intent(this, ConsumptionActivity::class.java)
            startActivity(intent)

    }
}