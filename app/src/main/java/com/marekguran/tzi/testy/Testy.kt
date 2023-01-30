package com.marekguran.tzi.testy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marekguran.tzi.MainActivity
import com.marekguran.tzi.R

class Testy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testy)
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@Testy, MainActivity::class.java))
        finish()
    }
}