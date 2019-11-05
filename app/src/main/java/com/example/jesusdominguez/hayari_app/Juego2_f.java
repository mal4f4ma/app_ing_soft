package com.example.jesusdominguez.hayari_app;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;

public class Juego2_f extends AppCompatActivity {

    Button bt_rombo, bt_rectangulo, bt_cuadrado, bt_circulo, bt_triangulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego2_f);

        bt_circulo = findViewById(R.id.bt_circulo);
        bt_cuadrado = findViewById(R.id.bt_cuadrado);
        bt_rectangulo = findViewById(R.id.bt_rectangulo);
        bt_rombo = findViewById(R.id.bt_rombo);
        bt_triangulo = findViewById(R.id.bt_triangulo);

        bt_circulo.setOnLongClickListener(longClickListener);
        bt_cuadrado.setOnLongClickListener(longClickListener);
        bt_rectangulo.setOnLongClickListener(longClickListener);
        bt_rombo.setOnLongClickListener(longClickListener);
        bt_rombo.setOnLongClickListener(longClickListener);


    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadow = new View.DragShadowBuilder(view);
            view.startDrag(data, myShadow,view,0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View view, DragEvent dragEvent) {
            int event = dragEvent.getAction();

            switch (event){
                case DragEvent.ACTION_DRAG_ENTERED:
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    break;

            }
            return true;
        }
    };
}
