package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthorizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        supportActionBar?.hide()
    }
}