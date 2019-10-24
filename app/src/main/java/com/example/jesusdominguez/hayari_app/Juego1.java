package com.example.jesusdominguez.hayari_app;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;

public class Juego1 extends AppCompatActivity {

    Button bt_yellow, bt_green, bt_blue, bt_purple, bt_red;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego1);


        bt_blue = findViewById(R.id.bt_azul);
        bt_green = findViewById(R.id.bt_verde);
        bt_yellow = findViewById(R.id.bt_yellow);
        bt_purple = findViewById(R.id.bt_morado);
        bt_red = findViewById(R.id.bt_rojo);

        bt_blue.setOnLongClickListener(longClickListener);
        bt_red.setOnLongClickListener(longClickListener);
        bt_purple.setOnLongClickListener(longClickListener);
        bt_yellow.setOnLongClickListener(longClickListener);
        bt_green.setOnLongClickListener(longClickListener);

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
