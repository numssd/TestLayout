package com.example.testlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


/*
 ConstraintLayout является оправданным решением для создания сложных решений,
 в простых задачах он будет медленнее чем LinearLayout, RelativeLayout.
 Цель ConstraintLayout - оптимизировать и упорядочить иерархию представлений ваших макетов,
 реализовывать сложные взаиморасположения элементов на экране.

 Результат отрисовки ConstraintLayout / LinearLayout

 1) 165 / 134
 2) 149 / 126
 3) 120 / 119
 4) 160 / 112


 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSongPlayer.setOnClickListener {
            startActivity(Intent(this, PlayerMusicActivity::class.java))
        }

        buttonTelegram.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        buttonCalc.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }

        buttonAuthorization.setOnClickListener {
            startActivity(Intent(this, AuthorizationActivity::class.java))
        }

        buttonSongPlayerLinear.setOnClickListener {
            startActivity(Intent(this, PlayerMusicActivity2::class.java))
        }

        buttonTelegramLinear.setOnClickListener {
            startActivity(Intent(this, ProfileActivity2::class.java))
        }

        buttonCalculatorLinear.setOnClickListener {
            startActivity(Intent(this, CalculatorActivity2::class.java))
        }

        buttonAuthorizationLinear.setOnClickListener {
            startActivity(Intent(this, AuthorizationActivity2::class.java))
        }
    }
}