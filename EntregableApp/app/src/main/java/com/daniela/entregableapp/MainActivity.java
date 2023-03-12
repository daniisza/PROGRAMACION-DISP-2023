package com.daniela.entregableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    Button agendar,Ir, Ira;
    EditText nombre, duracion, servicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");
        nombre = findViewById(R.id.idnombre);
        duracion = findViewById(R.id.idduracion);
        servicio = findViewById(R.id.idservicio);
        agendar = findViewById(R.id.idagendar);
        Ir = findViewById(R.id.Ir);
        Ira = findViewById(R.id.Ira);
        agendar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String servi = servicio.getText().toString();

                if (servi.equals("semipermanente")) {
                    Intent i = new Intent(MainActivity.this, Pantalla2App.class);
                    i.putExtra("Linea22", Linea2.getText().toString());
                    startActivity(i);

                } else if (nume.equals("")) {
                    Toast.makeText(MainActivity.this, "Debe ingresar un numero", Toast.LENGTH_SHORT).show();

                } else{

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entré a OnStart");
        agendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Parte2EnviarDatos(view);
            }
        });

    }
    public void Parte2EnviarDatos(View view) {

    }
}

