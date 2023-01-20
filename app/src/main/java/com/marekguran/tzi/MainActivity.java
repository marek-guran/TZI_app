package com.marekguran.tzi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
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
    }
}