package com.circuitec.components_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton togglePwd;
    private Switch switchPwd;
    private TextView result;
    private TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        togglePwd = findViewById(R.id.toggle_pwd);
        switchPwd = findViewById(R.id.switch_pwd);
        result = findViewById(R.id.result);
        result2 = findViewById(R.id.result2);
    }

    public void switchMonitoring (){

        switchPwd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    result2.setText("Switch Ligado");
                } else {
                    result2.setText("Switch Desligado");
                }
            }
        });

    }

    public void pegarDados(View view){
        switchMonitoring();
        if (togglePwd.isChecked()){
            result.setText("Toggle Ligado");
        } else {
            result.setText("Toggle Desligado");
        }
    }

}