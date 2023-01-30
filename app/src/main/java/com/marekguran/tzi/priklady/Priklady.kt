package com.marekguran.tzi.priklady

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marekguran.tzi.MainActivity
import com.marekguran.tzi.R

class Priklady : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priklady)
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@Priklady, MainActivity::class.java))
        finish()
    }
}