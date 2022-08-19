package com.circuitec.app_sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNmr (View view){

        TextView txtSorted = findViewById(R.id.textView2);
        int nmr = new Random().nextInt(11);
        txtSorted.setText("Número selecionado: " + nmr);
    }
}