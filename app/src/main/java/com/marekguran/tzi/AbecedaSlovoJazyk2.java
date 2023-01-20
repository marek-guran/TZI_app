package com.marekguran.tzi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AbecedaSlovoJazyk2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abeceda_slovo_jazyk2);

        Button jedna = (Button) findViewById(R.id.btn_1);
        Button dva = (Button) findViewById(R.id.btn_2);
        Button tri = (Button) findViewById(R.id.btn_3);
        Button styri = (Button) findViewById(R.id.btn_4);
        Button next = (Button) findViewById(R.id.next);
        Button back = (Button) findViewById(R.id.back);
        TextView text = (TextView) findViewById(R.id.explanation);

        jedna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jedna.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setVisibility(View.VISIBLE);
            }

        });

        dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dva.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setVisibility(View.VISIBLE);

            }

        });

        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri.setBackgroundColor(Color.parseColor("#3DDC84"));

            }

        });
        styri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                styri.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setVisibility(View.VISIBLE);

            }

        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbecedaSlovoJazyk2.this, AbecedaSlovoJazyk3.class));
                finish();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AbecedaSlovoJazyk2.this, AbecedaSlovoJazyk1.class));
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(AbecedaSlovoJazyk2.this, AbecedaSlovoJazyk1.class));
        finish();
    }
    }
