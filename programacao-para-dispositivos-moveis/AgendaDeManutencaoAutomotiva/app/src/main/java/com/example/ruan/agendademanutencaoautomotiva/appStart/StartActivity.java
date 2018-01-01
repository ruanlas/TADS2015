package com.example.ruan.agendademanutencaoautomotiva.appStart;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.controller.MainActivity;
import com.example.ruan.agendademanutencaoautomotiva.utils.TocaMusicaThread;

/**
 * Created by Ruan on 24/11/2017.
 */

public class StartActivity extends AppCompatActivity {
    private RelativeLayout layoutStart;
    private Handler handler;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        layoutStart = (RelativeLayout) findViewById(R.id.start_layout);

        handler = new Handler();

        progressBar = new ProgressBar(this);
//        progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal);
//        progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleSmall);
        progressBar.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT));
//        progressBar.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));

//        progressBar.setX(150);
        progressBar.setY(250);

        layoutStart.addView(progressBar);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    final int value = i;
                    try {
                        //define 1/10 segundo como o tempo para a barra
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            //define o valor para a barra
                            progressBar.setProgress(value);
                        }
                    });
                }

                Intent intent = new Intent(StartActivity.this, MainActivity.class );
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                finish();
            }
        };

        new Thread(new TocaMusicaThread(this)).start();
        new Thread(runnable).start();
    }
}
