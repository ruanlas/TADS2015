package com.example.ruan.aula4_thread;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    private Handler handler;
    private ProgressBar progress;
    private Button startButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void executaThread(View view){
        //recupera os componentes da tela: barra de progresso e botão
        progress = (ProgressBar) findViewById(R.id.progressBar);
        startButton = (Button) findViewById(R.id.start_button);

        //instancia um novo Handler para executar a thread
        handler = new Handler();

        //define um evento para o botão associado com a execução da thread
        startButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 1; i <= 100; i++) {
                            final int value = i;
                            try {
                                //define 1/10 segundo como o tempo para a barra
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    //define o valor para a barra
                                    progress.setProgress(value);
                                }
                            });
                        }
                    }
                };
                //executa a thread
                new Thread(runnable).start();
            }
        });

    }
}
