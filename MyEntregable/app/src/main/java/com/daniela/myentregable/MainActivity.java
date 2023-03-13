package com.daniela.myentregable;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    Button agendar, web, pag;
    EditText nombre, durar, servic;
    String telefono = "6044421175";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en OnCreate");
        nombre = findViewById(R.id.idnombre);
        durar = findViewById(R.id.iddurar);
        servic = findViewById(R.id.idservic);
        agendar = findViewById(R.id.idagendar);
        web = findViewById(R.id.abrir_web);
        pag = findViewById(R.id.ir_apag);

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

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abrirWeb = new Intent(Intent.ACTION_VIEW);
                abrirWeb.setData(Uri.parse("https://www.google.com/search?q=u%C3%B1as+semipermanentes+cortas&sxsrf=AJOqlzWdRpJRg2mEch4QoG1KaIVJlhRaIA:1678669035569&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiJ07282df9AhUsg4QIHc3PARcQ_AUoAXoECAEQAw&biw=1366&bih=657&dpr=1"));
                startActivity(abrirWeb);
            }
        });
        pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IraLlamada = new Intent(Intent.ACTION_DIAL);
                IraLlamada.setData(Uri.parse("tel:" + telefono));
                if (IraLlamada.resolveActivity(getPackageManager()) != null) {
                    startActivity(IraLlamada);
                }

            }
        });
    }


        public void Parte2EnviarDatos (View view){
            String servi = servic.getText().toString();

            if (servi.equals("semipermanente")) {
                String resultlado1 = nombre.getText().toString();
                String resultlado2 = durar.getText().toString();
                String resultlado3 = servic.getText().toString();
                Intent i = new Intent(this, PantallaDos.class);
                i.putExtra("mostrarn", resultlado1);
                i.putExtra("mostrard", resultlado2);
                i.putExtra("mostrars", resultlado3);
                startActivity(i);

            } else if (servi.equals("")) {
                Toast.makeText(MainActivity.this, "Debes ingresar el nombre semipermanente", Toast.LENGTH_SHORT).show();


            }
        }
    }



