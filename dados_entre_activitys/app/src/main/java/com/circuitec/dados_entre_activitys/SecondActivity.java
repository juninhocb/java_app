package com.circuitec.dados_entre_activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView name;
    private TextView age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name = findViewById(R.id.textName);
        age = findViewById(R.id.textAge);

        //recuperar os dados enviados pela activity main
        Bundle data = getIntent().getExtras();
        String nameRecived = data.getString("nome");
        int ageRecived = data.getInt("idade");
        name.setText(nameRecived);
        age.setText(String.valueOf(ageRecived));


    }
}