package com.circuitec.cara_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private ImageView imageShowResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageShowResult = findViewById(R.id.imageShowResult);

        Bundle data = getIntent().getExtras();
        int number = data.getInt("nmr");

        if (number == 0){
            imageShowResult.setImageResource(R.drawable.moeda_cara);
        }else {
            imageShowResult.setImageResource(R.drawable.moeda_coroa);
        }

    }

    public void voltar(View view){
/*
        Intent voltarTela = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(voltarTela);
*/

        finish();
    }
}