package com.example.guisela.laboratorio1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;
import java.util.StringTokenizer;

public class Resultado  extends AppCompatActivity {

    TextView palabraTotal;
    TextView palabraRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitvity_main_resultado);

        Intent intent = getIntent();
        String texto = intent.getStringExtra("texto");
        //String nume = intent.getStringExtra("ingresar");
        palabraTotal = (TextView) findViewById(R.id.mostrarCantidad);
        palabraRandom = (TextView) findViewById(R.id.resultadoRandon);

        StringTokenizer tokenizer = new StringTokenizer(texto, " ");
        palabraTotal.setText(String.valueOf(tokenizer.countTokens()));
        String letras[] = texto.split(" ");
        Integer randon;
        String mostrar = " ";

        palabraRandom.setText(mostrar);
    }
}
