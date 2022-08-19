package com.circuitec.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view){

        TextView txt3 = findViewById(R.id.textView3);
        System.out.println("teste" + txt3.getText());
        if (txt3.getText() == "Mudando o texto") {
            txt3.setText("mudando novamente");
            System.out.println("Testando quantas vexes entrar nisso!");
        } else if (txt3.getText() == "mudando novamente"){
            txt3.setText("Mudando o texto");
        } else {
            txt3.setText("Mudando o texto");
        }

    }

}
