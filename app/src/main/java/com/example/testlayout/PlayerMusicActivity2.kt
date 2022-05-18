package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.content.ContextCompat

class PlayerMusicActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_music2)

        supportActionBar?.let {
            it.title = getString(R.string.title_toolbar_text)
            it.setDisplayHomeAsUpEnabled(true)
        }

        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getDrawable(
                this,
                R.color.greenPlayer
            )
        )
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}