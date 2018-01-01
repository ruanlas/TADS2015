package com.example.ruan.aula06;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.prelude);
    }

    public void tocar(View view){
        mp.start();
    }

    public void pausar(View view){
        mp.pause();
    }

    public void parar(View view){
        mp.stop();
    }

}
