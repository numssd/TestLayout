package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthorizationActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization2)

        supportActionBar?.hide()
    }
}