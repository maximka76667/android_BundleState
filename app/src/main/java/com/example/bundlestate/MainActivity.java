package com.example.bundlestate;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        Button addButton = findViewById(R.id.button);
        Spinner spinner = findViewById(R.id.spinner);

        final String[] colors = {"Rojo", "Azul", "Amarillo"};

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, colors);

        spinner.setAdapter(adapter);
    }
}