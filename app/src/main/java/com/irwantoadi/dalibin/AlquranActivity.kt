package com.irwantoadi.dalibin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AlquranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alquran)
        val btn_back: Button = findViewById(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }
    }
}