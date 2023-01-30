package com.marekguran.tzi.operacieNadJazykmi

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
import com.marekguran.tzi.kvizy.Kvizy

class OperacieNadJazykmi1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operacie_nad_jazykmi1)
        val jedna = findViewById<View>(R.id.btn_1) as Button
        val dva = findViewById<View>(R.id.btn_2) as Button
        val tri = findViewById<View>(R.id.btn_3) as Button
        val styri = findViewById<View>(R.id.btn_4) as Button
        val next = findViewById<View>(R.id.next) as Button
        val text = findViewById<View>(R.id.explanation) as TextView
        val home = findViewById<View>(R.id.home) as ImageButton
        home.setOnClickListener {
            startActivity(Intent(this@OperacieNadJazykmi1, Kvizy::class.java))
            finish()
        }
        jedna.setOnClickListener {
            jedna.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        dva.setOnClickListener { dva.setBackgroundColor(Color.parseColor("#3DDC84")) }
        tri.setOnClickListener {
            tri.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        styri.setOnClickListener {
            styri.setBackgroundColor(Color.parseColor("#FF0000"))
            text.visibility = View.VISIBLE
        }
        next.setOnClickListener {
            startActivity(Intent(this@OperacieNadJazykmi1, OperacieNadJazykmi2::class.java))
            finish()
        }
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@OperacieNadJazykmi1, Kvizy::class.java))
        finish()
    }
}