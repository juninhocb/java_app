package com.circuitec.componentes_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkRed;
    private CheckBox checkBlue;
    private CheckBox checkGreen;
    private TextView result;
    private TextView resultText;
    private RadioButton man;
    private RadioButton woman;
    private TextView resultSex;
    private RadioGroup optionSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkRed = findViewById(R.id.checkRed);
        checkBlue = findViewById(R.id.checkBlue);
        checkGreen = findViewById(R.id.checkGreen);
        result = findViewById(R.id.result);
        resultText = findViewById(R.id.resultText);
        man = findViewById(R.id.radioButtonM);
        woman = findViewById(R.id.radioButtonW);
        resultSex = findViewById(R.id.resultSex);
        optionSex = findViewById(R.id.radioGroup);
    }

    public String checkbox(){
        if (checkRed.isChecked() && checkBlue.isChecked() && checkGreen.isChecked()){
            return "Vermelho selecionado, Azul selecionado e Verde selecionado";
        }
        if (checkRed.isChecked() && checkBlue.isChecked() && !checkGreen.isChecked()){
            return "Vermelho selecionado e Azul selecionado";
        }
        if (checkRed.isChecked() && !checkBlue.isChecked() & !checkGreen.isChecked()){
            return "Vermelho selecionado";
        }
        if (!checkRed.isChecked() && checkBlue.isChecked() && checkGreen.isChecked()){
            return "Azul selecionado e Verde selecionado";
        }
        if (!checkRed.isChecked() && checkBlue.isChecked() && !checkGreen.isChecked()){
            return "Azul selecionado";
        }
        if (!checkRed.isChecked() && !checkBlue.isChecked() && checkGreen.isChecked()) {
            return "Verde selecionado";
        }
        if (checkRed.isChecked() && !checkBlue.isChecked() && checkGreen.isChecked()){
            return "Vermelho selecionado e Verde selecionado";
        }
        return "Nenhuma cor foi selecionada!";
    }

    public void checkboxString (){
        String stringConc = "";

        if (checkRed.isChecked()){
            stringConc += " " + checkRed.getText().toString();
        }
        if (checkBlue.isChecked()){
            stringConc += " " + checkBlue.getText().toString();
        }
        if (checkGreen.isChecked()){
            stringConc += " " + checkGreen.getText().toString();
        }
        resultText.setText(stringConc);
    }

    public void radioButton (){
        if (man.isChecked()){
            resultSex.setText("Masculino selecionado");
        } else if (woman.isChecked()){
            resultSex.setText("Feminino selecionado");
        } else {
            resultSex.setText("Nada selecionado");
        }
    }

    public  void radioGroup(){
        optionSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButtonM){
                    System.out.println("Masculino selecionado");
                } else if (i == R.id.radioButtonW){
                    System.out.println("Feminino selecionado");
                } else {
                    System.out.println("Nada selecionado");
                }
            }
        });
    }

    public void selecionar(View view){
        result.setText(checkbox());
        checkboxString();
        radioButton();
        radioGroup();
    }
}