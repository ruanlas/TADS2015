package com.example.ruan.projetocronometro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;


public class MainActivity extends AppCompatActivity {
    Chronometer chronometer;
    Button btnStart, btnPause, btnReset;
    long time = 0;
    boolean isPause = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setando os botões
        btnStart = (Button) findViewById(R.id.btnStart);
        btnPause = (Button) findViewById(R.id.btnPause);
        btnReset = (Button) findViewById(R.id.btnReset);
        chronometer = (Chronometer) findViewById(R.id.chnCronometro);
        btnPause.setEnabled(false);
        btnReset.setEnabled(false);
    }

    public void start(View view) {
        if (isPause == false) {
            chronometer.setBase(SystemClock.elapsedRealtime());
        } else {
            chronometer.setBase(SystemClock.elapsedRealtime() + time);
            btnStart.setText("Iniciar");
            isPause = false;
        }
        chronometer.start();
        btnPause.setEnabled(true);
        btnReset.setEnabled(true);
    }

    public void pause(View view) {
        time = chronometer.getBase() - SystemClock.elapsedRealtime();
        chronometer.stop();
        btnPause.setEnabled(false);
        btnStart.setText("Continuar");
        isPause = true;
    }

    public void reset(View view) {
        chronometer.stop();
        chronometer.setText("00:00");
        if (isPause) {
            btnStart.setText("Iniciar");
            isPause = false;
        }
        btnPause.setEnabled(false);
        btnReset.setEnabled(false);
    }

}

