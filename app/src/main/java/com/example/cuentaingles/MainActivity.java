package com.example.cuentaingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_campoInsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_campoInsertar = (Button)findViewById(R.id.btn_insertarTiempo);

        btn_campoInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertarPantallaRegistro = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(insertarPantallaRegistro);
            }
        });

       /* btn_insertarTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent insertarPantallaRegistro = new Intent(MainActivity.this,InsertarRegistro.class);
                startActivity(insertarPantallaRegistro);
            }
        });
*/

    }
}