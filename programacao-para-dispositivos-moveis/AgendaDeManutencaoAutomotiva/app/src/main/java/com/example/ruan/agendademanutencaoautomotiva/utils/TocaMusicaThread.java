package com.example.ruan.agendademanutencaoautomotiva.utils;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.appStart.StartActivity;

/**
 * Created by Ruan on 27/11/2017.
 */

public class TocaMusicaThread implements Runnable {
    private MediaPlayer mediaPlayer;
    private StartActivity startActivity;

    public TocaMusicaThread(StartActivity startActivity){
        this.startActivity = startActivity;
    }
    @Override
    public void run() {
        mediaPlayer = MediaPlayer.create(startActivity, R.raw.ferrari);
        try {
            //define 1/10 segundo como o tempo para a barra
            mediaPlayer.start();
            Vibrator vibrator = (Vibrator) startActivity.getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(15000);
            Thread.sleep(22000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mediaPlayer.stop();
    }
}
