package com.example.jesusdominguez.hayari_app;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;

public class Juego3_f extends AppCompatActivity {

    Button bt_puerco, bt_burro, bt_gallo, bt_borrego, bt_pollo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego3_f);

        bt_borrego = findViewById(R.id.bt_borrego);
        bt_burro = findViewById(R.id.bt_burro);
        bt_gallo = findViewById(R.id.bt_gallo);
        bt_pollo = findViewById(R.id.bt_pollo);
        bt_puerco = findViewById(R.id.bt_puerco);

        bt_puerco.setOnLongClickListener(longClickListener);
        bt_pollo.setOnLongClickListener(longClickListener);
        bt_gallo.setOnLongClickListener(longClickListener);
        bt_burro.setOnLongClickListener(longClickListener);
        bt_borrego.setOnLongClickListener(longClickListener);


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
