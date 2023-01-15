package com.irwantoadi.dalibin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BinbookComicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binbook_comic)
        val btn_wudhu: Button = findViewById(R.id.btn_wudhu)
        val btn_back: Button = findViewById(R.id.btn_back)

        btn_wudhu.setOnClickListener {
            val intent = Intent(this@BinbookComicActivity, BinbookComicWudhuActivity::class.java)
            startActivity(intent)
        }
        btn_back.setOnClickListener {
            finish()
        }
    }
}