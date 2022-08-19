package com.circuitec.recycleview_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocals;
    private String[] items = {
            "Angra dos Reis", "Caldas Novas", "Campos do Jodão", "Blumenau",
            "Caribe", "Bucareste", "Riga", "Berlim", "Tóquio"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocals = findViewById(R.id.listLocals);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                items
        );

        listLocals.setAdapter(adapter);
        listLocals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              String selected = listLocals.getItemAtPosition(i).toString();
                Toast.makeText(
                        getApplicationContext(),
                        selected,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

    }
}