package com.daniela.myentregable;

import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PantallaDos extends AppCompatActivity {
    String TAG = "Depuracion";
    EditText mostrarn, mostrard, mostrars;
    Button calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);
        Log.i(TAG, "Estoy en OnCreate");
        mostrarn = findViewById(R.id.idmostrarn);
        mostrard = findViewById(R.id.idmostrard);
        mostrars = findViewById(R.id.idmostrars);
        calendar = findViewById(R.id.idcalendar);
        String result1 =  getIntent().getStringExtra("elnombre");
        String result2 =  getIntent().getStringExtra("laduración");
        String result3 =  getIntent().getStringExtra("lacita");
        Parte2EnviarDatos (result1,result2, result3);


    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    public void Parte2EnviarDatos(String result1, String result2, String result3) {
        mostrarn.setText(result1);
        mostrard.setText(result2);
        mostrars.setText(result3);

    }
}