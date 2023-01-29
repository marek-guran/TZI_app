package com.marekguran.tzi.abecedaSlovoJazyk

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.marekguran.tzi.MainActivity
import com.marekguran.tzi.R

class AbecedaSlovoJazyk1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abeceda_slovo_jazyk1)
        val jedna = findViewById<View>(R.id.btn_true) as Button
        val dva = findViewById<View>(R.id.btn_false) as Button
        val next = findViewById<View>(R.id.next) as Button
        val text = findViewById<View>(R.id.explanation) as TextView
        val home = findViewById<View>(R.id.home) as ImageButton
        home.setOnClickListener {
            startActivity(Intent(this@AbecedaSlovoJazyk1, MainActivity::class.java))
            finish()
        }
        jedna.setOnClickListener { jedna.setBackgroundColor(Color.parseColor("#3DDC84")) }
        dva.setOnClickListener {
            dva.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        next.setOnClickListener {
            startActivity(Intent(this@AbecedaSlovoJazyk1, AbecedaSlovoJazyk2::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@AbecedaSlovoJazyk1, MainActivity::class.java))
        finish()
    }
}