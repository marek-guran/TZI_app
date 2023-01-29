package com.marekguran.tzi

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.View.OnFocusChangeListener
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.marekguran.tzi.abecedaSlovoJazyk.AbecedaSlovoJazyk1
import com.marekguran.tzi.konecnyAutomat.KonecnyAutomat1
import com.marekguran.tzi.operacieNadJazykmi.OperacieNadJazykmi1
import com.marekguran.tzi.teoria.TeoriaMenu

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val abecedaSlovoJazyk = findViewById<View>(R.id.abeceda_slovo_jazyk) as CardView
        val konecnyAutomat = findViewById<View>(R.id.konecny_automat) as CardView
        val operacieNadJazykmi = findViewById<View>(R.id.operacie_nad_jazykmi) as CardView
        val teoria = findViewById<View>(R.id.teoria) as CardView
        abecedaSlovoJazyk.setOnClickListener {
            startActivity(Intent(this@MainActivity, AbecedaSlovoJazyk1::class.java))
            finish()
        }
        konecnyAutomat.setOnClickListener {
            startActivity(Intent(this@MainActivity, KonecnyAutomat1::class.java))
            finish()
        }
        operacieNadJazykmi.setOnClickListener {
            startActivity(Intent(this@MainActivity, OperacieNadJazykmi1::class.java))
            finish()
        }
        teoria.setOnClickListener {
            startActivity(Intent(this@MainActivity, TeoriaMenu::class.java))
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
        teoria.setOnTouchListener { view, event ->
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
        abecedaSlovoJazyk.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
        konecnyAutomat.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
        operacieNadJazykmi.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
        teoria.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
}