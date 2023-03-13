package com.daniela.entregableapp;

import android.annotation.SuppressLint;
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

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");
        nombre = findViewById(R.id.idnombre);
        duracion = findViewById(R.id.idduracion);
        servicio = findViewById(R.id.idservicio);
        agendar = findViewById(R.id.idagendar);
        Ir = findViewById(R.id.idIr);
        Ira = findViewById(R.id.idIra);
        agendar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                String servi = servicio.getText().toString();

                if (servi.equals("semipermanente")) {
                    Intent i = new Intent(MainActivity.this, Pantalla2App.class);
                    i.putExtra("mostrarn", nombre.getText().toString());
                    i.putExtra("mostrard", duracion.getText().toString());
                    i.putExtra("mostrars", servicio.getText().toString());
                    startActivity(i);

                } else if (servi.equals("")) {
                    Toast.makeText(MainActivity.this, "Debes ingresar el nombre semipermanente", Toast.LENGTH_SHORT).show();




                }
            }
        });
    }



}

