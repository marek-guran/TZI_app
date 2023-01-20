package com.marekguran.tzi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OperacieNadJazykmi7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacie_nad_jazykmi7);


        Button jedna = (Button) findViewById(R.id.btn_1);
        Button dva = (Button) findViewById(R.id.btn_2);
        Button next = (Button) findViewById(R.id.next);
        Button back = (Button) findViewById(R.id.back);
        TextView text = (TextView) findViewById(R.id.explanation);

        jedna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jedna.setBackgroundColor(Color.parseColor("#3DDC84"));
            }

        });

        dva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dva.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setVisibility(View.VISIBLE);

            }

        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacieNadJazykmi7.this, OperacieNadJazykmi8.class));
                finish();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OperacieNadJazykmi7.this, OperacieNadJazykmi6.class));
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(OperacieNadJazykmi7.this, OperacieNadJazykmi6.class));
        finish();
    }
}