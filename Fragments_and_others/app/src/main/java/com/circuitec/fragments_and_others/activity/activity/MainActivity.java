package com.circuitec.fragments_and_others.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.circuitec.fragments_and_others.R;
import com.circuitec.fragments_and_others.activity.fragment.ChatFragment;
import com.circuitec.fragments_and_others.activity.fragment.ContatcsFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonChat, buttonContacts;
    private ChatFragment chats;
    private ContatcsFragment contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //removendo o elevation da barra de menu superior
        getSupportActionBar().setElevation(0);

        buttonChat = findViewById(R.id.buttonChat);
        buttonContacts = findViewById(R.id.buttonContatcs);


        chats = new ChatFragment();
        contacts = new ContatcsFragment();

        //exibir os fragmentos
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // onde irá exibir, conteúdo que irá exibir
        transaction.replace(R.id.frameContent, chats);
        transaction.commit(); //finalizando o transaction

        buttonContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent, contacts);
                transaction.commit();

            }
        });

        buttonChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chats = new ChatFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContent, chats);
                transaction.commit();
            }
        });


    }
}