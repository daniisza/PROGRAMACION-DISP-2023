package com.daniela.myentregable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class PantallaDos extends AppCompatActivity {
    String TAG = "Depuracion";
    EditText mostrarn, mostrard, mostrars;
    Button web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);
        Log.i(TAG, "Estoy en OnCreate");
        mostrarn = findViewById(R.id.idmostrarn);
        mostrard = findViewById(R.id.idmostrard);
        mostrars = findViewById(R.id.idmostrars);
        web = findViewById(R.id.idirweb);
        String result1 = mostrarn.getText().toString();
        String result2 = mostrard.getText().toString();
        String result3 = mostrars.getText().toString();
        Parte2EnviarDatos (result1,result2, result3);


    }
    public void Parte2EnviarDatos(String result1, String result2, String result3) {
        mostrarn.setText(result1);
        mostrard.setText(result2);
        mostrars.setText(result3);

    }
}