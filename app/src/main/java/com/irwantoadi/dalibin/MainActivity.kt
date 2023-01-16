package com.irwantoadi.dalibin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_1)
        val btn_menu_6: ImageButton = findViewById(R.id.btn_menu_6)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@MainActivity, BinbookActivity::class.java)
            startActivity(intent)
        }
        btn_menu_6.setOnClickListener {
            val intent = Intent(this@MainActivity, AlquranActivity::class.java)
            startActivity(intent)
        }
    }
}