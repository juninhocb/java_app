package com.circuitec.components_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar_line;
    private ProgressBar progressBar_wait;
    private int progress = 0;
    private SeekBar seekbar;
    private TextView textProgress;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar_line = findViewById(R.id.progressBar_line);
        progressBar_wait = findViewById(R.id.progressBar_wait);
        progressBar_wait.setVisibility(View.GONE);
        seekbar = findViewById(R.id.seekBar);
        textProgress = findViewById(R.id.result);
        textResult = findViewById(R.id.choosed);
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textProgress.setText("Progresso: " + i + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(
                        getApplicationContext(),
                        "Iniciando",
                        Toast.LENGTH_SHORT
                ).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(
                        getApplicationContext(),
                        "Finalizando",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }

    @SuppressLint("ResourceAsColor")
    public void abrirToast(View view){
        /*
        Toast.makeText(
            getApplicationContext(),
            "Ação realizada com sucesso!",
                Toast.LENGTH_LONG
        ).show();

         */
        //contexto da aplicação
        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.btn_star);
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);

        TextView text = new TextView(getApplicationContext());
        text.setBackgroundColor(R.color.teal_200);
        text.setText("Olá Toast");
        //toast.setView (image)
        toast.setView(text);
        toast.show();
    }

    public void showAlert(View view){
        //contexto apenas da activity
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");
        dialog.setCancelable(false);
        dialog.setIcon(android.R.drawable.gallery_thumb);
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.out.println("Clicou em não");
            }
        });
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                System.out.println("Clicou no sim");
            }
        });
        dialog.create();
        dialog.show();
    }

    public void carregar (View view){
        this.progress = this.progress +1;
        progressBar_line.setProgress(this.progress);
        progressBar_wait.setVisibility(View.VISIBLE);
        if (this.progress == 10) {
            progressBar_wait.setVisibility(View.GONE);
            this.progress = 0;
            Toast.makeText(
                    getApplicationContext(),
                    "Finalizado, clique de novo para reiniciar",
                    Toast.LENGTH_LONG
            ).show();
        }
    }

    public void seekBar (View view){
        textResult.setText("Valor escolhido: "+ seekbar.getProgress());

    }


}