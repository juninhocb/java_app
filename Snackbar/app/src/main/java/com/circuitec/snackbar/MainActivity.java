package com.circuitec.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnSnackBar;
    private Snackbar snack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snack = Snackbar.make(
                        view,
                        "Botão pressionado",
                        Snackbar.LENGTH_LONG
                ).setAction(
                                "Confirmar",
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        btnSnackBar.setText("Botão abrir alterado");
                                    }
                                }
                        );

                snack.show();

            }
        });

    }
}