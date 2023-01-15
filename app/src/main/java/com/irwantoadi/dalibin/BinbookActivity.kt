package com.irwantoadi.dalibin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class BinbookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binbook)
        val btn_menu_1: ImageButton = findViewById(R.id.btn_menu_1)
        val btn_menu_4: ImageButton = findViewById(R.id.btn_menu_4)
        val btn_back: Button = findViewById(R.id.btn_back)

        btn_menu_1.setOnClickListener {
            val intent = Intent(this@BinbookActivity, BinbookEduBookActivity::class.java)
            startActivity(intent)
        }
        btn_menu_4.setOnClickListener {
            val intent = Intent(this@BinbookActivity, BinbookComicActivity::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            finish()
        }
    }
}