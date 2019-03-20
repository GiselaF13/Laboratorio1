package com.example.guisela.laboratorio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText texto;
    EditText ingresar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (EditText) findViewById(R.id.edit_Text);
        ingresar = (EditText) findViewById(R.id.edit_Text);
    }

    public void realizar(View view) {

        Intent intent = new Intent(this, Resultado.class);
        String tex = texto.getText().toString();
        String num = ingresar.getText().toString();
        intent.putExtra("texto", tex);
        startActivity(intent);

    }

}
