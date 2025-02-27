package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val edtPrice = findViewById<TextInputEditText>(R.id.edt_Price)
        val btnNext = findViewById<Button>(R.id.btn_Price)
        btnNext.setOnClickListener {
            val priceStr: String = edtPrice.text.toString()


            val intent = Intent(this, ConsumptionActivity::class.java)
            startActivity(intent)
        }
    }
}
