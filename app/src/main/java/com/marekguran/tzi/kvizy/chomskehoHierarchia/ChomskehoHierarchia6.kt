package com.marekguran.tzi.kvizy.chomskehoHierarchia

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.marekguran.tzi.R
import com.marekguran.tzi.kvizy.Kvizy

class ChomskehoHierarchia6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chomskeho_hierarchia6)
        val jedna = findViewById<View>(R.id.btn_true) as Button
        val dva = findViewById<View>(R.id.btn_false) as Button
        val next = findViewById<View>(R.id.next) as Button
        val back = findViewById<View>(R.id.back) as Button
        val text = findViewById<View>(R.id.explanation) as TextView
        val home = findViewById<View>(R.id.home) as ImageButton
        home.setOnClickListener {
            startActivity(Intent(this@ChomskehoHierarchia6, Kvizy::class.java))
            finish()
        }
        jedna.setOnClickListener { jedna.setBackgroundColor(Color.parseColor("#3DDC84"))
        }
        dva.setOnClickListener {
            dva.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        next.setOnClickListener {
            startActivity(Intent(this@ChomskehoHierarchia6, ChomskehoHierarchia7::class.java))
            finish()
        }
        back.setOnClickListener {
            startActivity(Intent(this@ChomskehoHierarchia6, ChomskehoHierarchia5::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@ChomskehoHierarchia6, ChomskehoHierarchia5::class.java))
        finish()
    }
}