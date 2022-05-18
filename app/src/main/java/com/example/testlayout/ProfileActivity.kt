package com.example.testlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    private val settingList by lazy {
        listOf(
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications),
            SettingModel(getString(R.string.title_setting_text), R.drawable.ic_notifications)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.let {
            it.title = ""
            it.setDisplayHomeAsUpEnabled(true)
        }

        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getDrawable(
                this,
                R.color.telegramColor
            )
        )


        recyclerViewSettings.layoutManager = LinearLayoutManager(this)
        recyclerViewSettings.adapter = TelegramProfileAdapter(object : SettingActionListener {
            override fun onSettingDetails() {

            }
        }, settingList)
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