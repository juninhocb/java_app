package com.circuitec.dados_entre_activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //contexto, e para qual activity irá
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                // passando dados (chave, valor)
                intent.putExtra("nome", "San pi");
                intent.putExtra("idade", 30);
                startActivity(intent);


            }
        });
    }


}