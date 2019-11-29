package com.example.jesusdominguez.hayari_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MenuJuegos extends AppCompatActivity {
    Button bt_juego_1, bt_juego_2, bt_juego_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juegos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        bt_juego_1 = findViewById(R.id.bt_juego_1);
        bt_juego_2 = findViewById(R.id.bt_juego_2);
        bt_juego_3 = findViewById(R.id.bt_juego_3);

        bt_juego_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juego1 = new Intent(MenuJuegos.this, Juego1.class);
                startActivity(juego1);
            }
        });

        bt_juego_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juego2 = new Intent(MenuJuegos.this, Juego2_f.class);
                startActivity(juego2);
            }
        });

        bt_juego_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent juego3 = new Intent(MenuJuegos.this, Juego3_f.class);
                startActivity(juego3);
            }
        });

    }

}
