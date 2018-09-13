package com.example.ahmed.dlilelmoslim

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.LinearLayout
import java.sql.Time
import java.util.*

class splash_screen : AppCompatActivity() {
    var timeout = 1500L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            var int = Intent(this,StartActivity::class.java)
            startActivity(int)
            finish()
        },timeout)


    }
}
