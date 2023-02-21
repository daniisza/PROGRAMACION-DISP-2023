package com.daniela.clasefebrero20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuracion";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Estoy en OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
