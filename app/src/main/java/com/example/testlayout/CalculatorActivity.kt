package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        supportActionBar?.hide()
    }
}