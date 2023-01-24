package com.marekguran.tzi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView abeceda_slovo_jazyk = (CardView) findViewById(R.id.abeceda_slovo_jazyk);
        CardView konecny_automat = (CardView) findViewById(R.id.konecny_automat);
        CardView operacie_nad_jazykmi = (CardView) findViewById(R.id.operacie_nad_jazykmi);
        CardView teoria = (CardView) findViewById(R.id.teoria);

        abeceda_slovo_jazyk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AbecedaSlovoJazyk1.class));
                finish();

            }
        });
        konecny_automat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KonecnyAutomat1.class));
                finish();

            }
        });
        operacie_nad_jazykmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OperacieNadJazykmi1.class));
                finish();

            }
        });
        teoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TeoriaMenu.class));
                finish();

            }
        });

        abeceda_slovo_jazyk.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
                return false;
            }
        });
        konecny_automat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
                return false;
            }
        });
        operacie_nad_jazykmi.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
                return false;
            }
        });
        teoria.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
                return false;
            }
        });


        abeceda_slovo_jazyk.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
            }
        });
        konecny_automat.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
            }
        });
        operacie_nad_jazykmi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
            }
        });
        teoria.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 0.9f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 0.9f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                } else {
                    ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(view, "scaleX", 1f);
                    ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(view, "scaleY", 1f);
                    scaleDownX.setDuration(150);
                    scaleDownY.setDuration(150);

                    AnimatorSet scaleDown = new AnimatorSet();
                    scaleDown.play(scaleDownX).with(scaleDownY);

                    scaleDown.start();
                }
            }
        });
    }
}