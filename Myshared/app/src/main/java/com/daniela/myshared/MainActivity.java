package com.daniela.myshared;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etyusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etyusuario=(EditText)findViewById(R.id.etyusuario);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        etyusuario.setText(preferences.getString("usuarios", ""));


    }

    public void  guardar(View view){
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferencias.edit();
        Obj_editor.putString("usuarios", etyusuario.getText().toString());
        Obj_editor.commit();
        finish();
    }
}