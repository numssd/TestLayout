package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CalculatorActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator2)

        supportActionBar?.hide()
    }
}