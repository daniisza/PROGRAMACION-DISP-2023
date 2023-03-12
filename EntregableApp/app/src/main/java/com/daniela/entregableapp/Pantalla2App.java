package com.daniela.entregableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pantalla2App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2_app);

            String resultlado1 = ladouno.getText().toString();
            String resultlado2 = ladodos.getText().toString();
            Intent pasarDato = new Intent(this, PantallaDos.class);
            pasarDato.putExtra("elresultado", String.valueOf(result));
            pasarDato.putExtra("Llamarlado1", resultlado1);
            pasarDato.putExtra("Llamarlado2", resultlado2);
            startActivity(pasarDato);
    }
    public void Parte2EnviarDatos(View view) {

    }

}