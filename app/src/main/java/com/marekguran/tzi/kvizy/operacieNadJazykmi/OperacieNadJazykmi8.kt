package com.marekguran.tzi.kvizy.operacieNadJazykmi

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.marekguran.tzi.R
import com.marekguran.tzi.kvizy.Kvizy

class OperacieNadJazykmi8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacie_nad_jazykmi8)
        val jedna = findViewById<View>(R.id.btn_1) as Button
        val dva = findViewById<View>(R.id.btn_2) as Button
        val next = findViewById<View>(R.id.next) as Button
        val back = findViewById<View>(R.id.back) as Button
        val text = findViewById<View>(R.id.explanation) as TextView
        val home = findViewById<View>(R.id.home) as ImageButton
        home.setOnClickListener {
            startActivity(Intent(this@OperacieNadJazykmi8, Kvizy::class.java))
            finish()
        }
        jedna.setOnClickListener { jedna.setBackgroundColor(Color.parseColor("#3DDC84")) }
        dva.setOnClickListener {
            dva.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        next.setOnClickListener {
            startActivity(Intent(this@OperacieNadJazykmi8, OperacieNadJazykmi9::class.java))
            finish()
        }
        back.setOnClickListener {
            startActivity(Intent(this@OperacieNadJazykmi8, OperacieNadJazykmi7::class.java))
            finish()
        }
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@OperacieNadJazykmi8, OperacieNadJazykmi7::class.java))
        finish()
    }
}