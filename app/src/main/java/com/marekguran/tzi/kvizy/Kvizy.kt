package com.marekguran.tzi.kvizy

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.marekguran.tzi.MainActivity
import com.marekguran.tzi.R
import com.marekguran.tzi.kvizy.abecedaSlovoJazyk.AbecedaSlovoJazyk1
import com.marekguran.tzi.kvizy.chomskehoHierarchia.ChomskehoHierarchia1
import com.marekguran.tzi.kvizy.konecnyAutomat.KonecnyAutomat1
import com.marekguran.tzi.kvizy.operacieNadJazykmi.OperacieNadJazykmi1

class Kvizy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kvizy)
        val abecedaSlovoJazyk = findViewById<View>(R.id.abeceda_slovo_jazyk) as CardView
        val konecnyAutomat = findViewById<View>(R.id.konecny_automat) as CardView
        val operacieNadJazykmi = findViewById<View>(R.id.operacie_nad_jazykmi) as CardView
        val chomskehoHierarchia = findViewById<View>(R.id.chomskeho_hierarchia) as CardView
        val home = findViewById<View>(R.id.home) as ImageButton
        home.setOnClickListener {
            startActivity(Intent(this@Kvizy, MainActivity::class.java))
            finish()
        }
        abecedaSlovoJazyk.setOnClickListener {
            startActivity(Intent(this@Kvizy, AbecedaSlovoJazyk1::class.java))
            finish()
        }
        konecnyAutomat.setOnClickListener {
            startActivity(Intent(this@Kvizy, KonecnyAutomat1::class.java))
            finish()
        }
        operacieNadJazykmi.setOnClickListener {
            startActivity(Intent(this@Kvizy, OperacieNadJazykmi1::class.java))
            finish()
        }
        chomskehoHierarchia.setOnClickListener {
            startActivity(Intent(this@Kvizy, ChomskehoHierarchia1::class.java))
            finish()
        }
        abecedaSlovoJazyk.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        konecnyAutomat.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        operacieNadJazykmi.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        chomskehoHierarchia.setOnTouchListener { view, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else if (event.action == MotionEvent.ACTION_UP) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
            false
        }
        abecedaSlovoJazyk.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        konecnyAutomat.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        operacieNadJazykmi.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
        chomskehoHierarchia.onFocusChangeListener = View.OnFocusChangeListener { view, hasFocus ->
            if (hasFocus) {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            } else {
                val scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f)
                val scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f)
                scaleDownX.duration = 150
                scaleDownY.duration = 150
                val scaleDown = AnimatorSet()
                scaleDown.play(scaleDownX).with(scaleDownY)
                scaleDown.start()
            }
        }
    }
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        startActivity(Intent(this@Kvizy, MainActivity::class.java))
        finish()
    }
}