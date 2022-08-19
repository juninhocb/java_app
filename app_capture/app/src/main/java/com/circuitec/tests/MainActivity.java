package com.circuitec.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView resultado;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.edit_nome);
        campoEmail = findViewById(R.id.edit_email);
        resultado = findViewById(R.id.result);
    }

    public void enviar(View view){
        String nome = campoNome.getText().toString();
        TextView resultado = findViewById(R.id.result);
        TextInputEditText campoEmail = findViewById(R.id.edit_email);
        resultado.setText("Nome: " + nome + " Email: " + campoEmail.getText().toString());
    }

    public void limpar (View view){
        campoNome.setText("");
        campoEmail.setText("");
    }

}