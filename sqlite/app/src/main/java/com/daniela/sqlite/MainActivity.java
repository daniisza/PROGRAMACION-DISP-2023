package com.daniela.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";
    EditText ingced, digNom, digTel;
    Button reg;
    Button con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en OnCreate");
        ingced = findViewById(R.id.ingced);
        digNom = findViewById(R.id.digNom);
        digTel = findViewById(R.id.digTel);
        reg = findViewById(R.id.reg);
        con = findViewById(R.id.con);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrar(view);
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                consultar(view);
            }
        });

    }

    public void registrar(View view) {
        AdminBD admin = new AdminBD(this, "BaseDatos", null, 1);
        SQLiteDatabase BaseDatos = admin.getWritableDatabase();
        String cedula = ingced.getText().toString();
        String nombre = digNom.getText().toString();
        String telefono = digTel.getText().toString();

        if (!cedula.isEmpty() && !nombre.isEmpty() && !telefono.isEmpty()) {
            ContentValues registro = new ContentValues();
            registro.put("cedula", cedula);
            registro.put("nombre", nombre);
            registro.put("telefono", telefono);
            BaseDatos.insert("usuario", null, registro);
            BaseDatos.close();

            ingced.setText("");
            digNom.setText("");
            digTel.setText("");
            Toast.makeText(this, "Registro almacenado exitosamente", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Ingrese correctamente todos los datos", Toast.LENGTH_LONG).show();
        }
    }


    public void consultar(View view) {
        AdminBD admin = new AdminBD(this, "BaseDatos", null, 1);
        SQLiteDatabase BasedeDatos = admin.getWritableDatabase();
        String cedula1 = ingced.getText().toString();
        if (!cedula1.isEmpty())
        {
            Cursor fila = BasedeDatos.rawQuery(" select nombre, telefono from usuario where cedula="+cedula1, null);
            if(fila.moveToFirst())
            {
                digNom.setText(fila.getString(0));
                digTel.setText(fila.getString(1));
                BasedeDatos.close();
            }
            else
            {
                Toast.makeText(this, "No se encontró el usuario", Toast.LENGTH_LONG).show();
            }
        }
    }
}