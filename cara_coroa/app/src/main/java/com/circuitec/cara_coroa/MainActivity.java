package com.circuitec.cara_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear (View view) {

        //criar uma nova intent
        Intent chamarResultado = new Intent(getApplicationContext(), SecondActivity.class);
        //passar dados
        int number = new Random().nextInt(2);// 0 1
        chamarResultado.putExtra("nmr", number);


        // chamar a função para mudar o activity
        startActivity(chamarResultado);





    }

}