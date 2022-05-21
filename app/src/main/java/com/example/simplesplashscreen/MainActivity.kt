package com.example.simplesplashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    internal val TIME_OUT = 1990
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(
            {
                startActivity(Intent(this@MainActivity,MainActivity::class.java))
                finish()
            },TIME_OUT.toLong())
    }
}