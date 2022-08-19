package com.circuitec.alcool_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcoholPrice;
    private EditText editOilPrice;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAlcoholPrice = findViewById(R.id.editTextTextPersonName);
        editOilPrice = findViewById(R.id.editTextTextPersonName2);
        result = findViewById(R.id.textView4);
    }

    public void calcular (View view){

        String alcoholPrice = editAlcoholPrice.getText().toString();
        String oilPrice = editOilPrice.getText().toString();
        if (!verifyBlankEntry(alcoholPrice,oilPrice)){
            result.setText("Por favor, insira todos os campos para realizar o cálculo");
        } else {

            Double alcoholValue = Double.parseDouble(alcoholPrice);
            Double oilValue = Double.parseDouble(oilPrice);

            if ((alcoholValue/oilValue) >= 0.7){
                result.setText("É melhor utilizar Gasolina");

            } else {
                result.setText("É melhor utilizar Alcool");
            }

        }



    }
    public Boolean verifyBlankEntry (String pAlcohol, String pOil){
        return pAlcohol != null && pOil != null && !pAlcohol.equals("") && !pOil.equals("");
    }




}