package com.daniela.entregableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    Button agendar;
    EditText idnombre, idduracion, idservicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");
        idnombre = findViewById(R.id.idnombre);
        idduracion = findViewById(R.id.idduracion);
        idservicio = findViewById(R.id.idservicio);
    }
}