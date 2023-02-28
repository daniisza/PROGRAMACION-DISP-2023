package com.daniela.clasefebrero20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PantallaDos extends AppCompatActivity {

    String TAG = "Depuracion";
    EditText ladouno, ladodos;
    TextView resulfinal;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_dos);
        //obtengo de lo que recibo el dato(un String que se envió)

        ladouno = findViewById(R.id.result_lado1);
        ladodos = findViewById(R.id.result_lado2);
        resulfinal = findViewById(R.id.reso);
        String result = getIntent().getStringExtra("elresultado");
        String result1 = getIntent().getStringExtra("Llamarlado1");
        String result2 = getIntent().getStringExtra("Llamarlado2");
        publicarDatos(result, result1, result2);


    }


    public void publicarDatos(String result, String Llamarlado1, String Llamarlado2){


       resulfinal.setText(result);
        ladouno.setText(Llamarlado1);
        ladodos.setText(Llamarlado2);

    }

}