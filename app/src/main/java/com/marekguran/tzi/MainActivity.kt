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
import com.marekguran.tzi.kvizy.Kvizy
import com.marekguran.tzi.priklady.Priklady
import com.marekguran.tzi.teoria.TeoriaMenu
import com.marekguran.tzi.testy.Testy

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kvizy = findViewById<View>(R.id.kvizy) as CardView
        val priklady = findViewById<View>(R.id.priklady) as CardView
        val testy = findViewById<View>(R.id.testy) as CardView
        val teoria = findViewById<View>(R.id.teoria) as CardView
        kvizy.setOnClickListener {
            startActivity(Intent(this@MainActivity, Kvizy::class.java))
            finish()
        }
        priklady.setOnClickListener {
            startActivity(Intent(this@MainActivity, Priklady::class.java))
            finish()
        }
        testy.setOnClickListener {
            startActivity(Intent(this@MainActivity, Testy::class.java))
            finish()
        }
        teoria.setOnClickListener {
            startActivity(Intent(this@MainActivity, TeoriaMenu::class.java))
            finish()
        }
        kvizy.setOnTouchListener { view, event ->
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
        priklady.setOnTouchListener { view, event ->
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
        testy.setOnTouchListener { view, event ->
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
        kvizy.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
        priklady.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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
        testy.onFocusChangeListener = OnFocusChangeListener { view, hasFocus ->
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