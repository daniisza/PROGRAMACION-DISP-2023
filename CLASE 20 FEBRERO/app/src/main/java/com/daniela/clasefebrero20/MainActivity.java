package com.daniela.clasefebrero20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    EditText ladouno, ladodos;
    TextView resultado;
    Button calcular;
    Button abrirGoogle; // DECLARACION DEL BOTÓN
    Button abrirLlamada; // DECLARACION DEL BOTÓN
    String telefono = "6045109000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");
        ladouno = findViewById(R.id.ladouno);
        ladodos = findViewById(R.id.ladodos);
        resultado = findViewById(R.id.elresultadoes);
        calcular = findViewById(R.id.calcular);
        abrirGoogle = findViewById(R.id.abrir_google);
        abrirLlamada = findViewById(R.id.abrir_llamar);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entré a OnStart");
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Parte2EnviarDatos(view);
            }
        });

        //AQUI SE GENERA ESTO PARA UNA FUNCION QUE CREO EN OTRO ITEM
        abrirGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IraGooogle(view);  //NOMBRE DE LA FUNCION, VA IR A UNA FUNCION
            }
        });
        abrirLlamada.setOnClickListener(new View.OnClickListener() {
            //OTRA FORMA DE HACER EL INTENT DIRECTAMENTE
            @Override
            public void onClick(View view) {
                Intent IraLlamada = new Intent(Intent.ACTION_DIAL); //SE VA A MARCAR USANDO EL TELEFONO
                IraLlamada.setData(Uri.parse("tel:" + telefono));
                if (IraLlamada.resolveActivity(getPackageManager()) != null) {
                    startActivity(IraLlamada);
                }
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entré a OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entré a OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entré a OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entré a OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entré a OnDestroy");
    }

    // aqui se crea una funcion con nombre Parte2EnviarDatos, es publica y no espera nada de respuesta
//View es el tipo de dato(en este caso, un objeto que es la vista, por eso es View
//view es el nombre de ese objeto que recibe la función
    // Intent es el metodo con el que se pasa de una pantalla a otra
    public void Parte2EnviarDatos(View view) {

        float result = Float.parseFloat(ladodos.getText().toString()) * Float.parseFloat(ladouno.getText().toString());
        String resultlado1 = ladouno.getText().toString();
        String resultlado2 = ladodos.getText().toString();
        Intent pasarDato = new Intent(this, PantallaDos.class);
        pasarDato.putExtra("elresultado", String.valueOf(result));
        pasarDato.putExtra("Llamarlado1", resultlado1);
        pasarDato.putExtra("Llamarlado2", resultlado2);
        startActivity(pasarDato);

    }

    public void IraGooogle(View view) {
        Intent abrirGoogle = new Intent(Intent.ACTION_VIEW);
        abrirGoogle.setData(Uri.parse("http://www.google.com"));
        startActivity(abrirGoogle);

    }



}

