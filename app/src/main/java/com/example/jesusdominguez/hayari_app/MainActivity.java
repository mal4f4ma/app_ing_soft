package com.example.jesusdominguez.hayari_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button bt_main_jugar,bt_main_exit,bt_main_config,bt_main_aviso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_main_aviso = findViewById(R.id.bt_aviso);
        bt_main_config = findViewById(R.id.bt_config);
        bt_main_exit = findViewById(R.id.bt_exit);
        bt_main_jugar = findViewById(R.id.bt_jugar);

        bt_main_jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuJuegos = new Intent(MainActivity.this, MenuJuegos.class);
                startActivity(menuJuegos);
            }
        });

        bt_main_aviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencion = new Intent(MainActivity.this, AvisoPrivacidad.class);
                startActivity(intencion);
            }
        });

        bt_main_exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                System.exit(0);
            }
        });
    }
}
