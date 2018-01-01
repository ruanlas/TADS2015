package com.example.ruan.aula4_gravaraudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.IOException;

import android.media.MediaRecorder;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //instancia um objeto (recorder) para gravar o audio
    private MediaRecorder recorder = new MediaRecorder();
    //define de forma absoluta o caminho e o nome do arquivo
    private String caminho = Environment.getExternalStorageDirectory().getAbsolutePath() + "/audio.3gp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //verifica o estado do disco SD para gravacao
        String estado = android.os.Environment.getExternalStorageState();

        // Verifica se possui disco SD
        // Caso não possa, lança uma exceção IOException
        if (!estado.equals(android.os.Environment.MEDIA_MOUNTED)) {
            try {
                throw new IOException("SD Card nao esta montado.  Seu estado é " + estado);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //verifica se o arquivo existe, senao cria ele
        File directory = new File(caminho).getParentFile();
        if (!directory.exists() && !directory.mkdirs()) {
            try {
                throw new IOException("Caminho do arquivo nao pode ser criado.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Seta a captura do audio pelo microfone
        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        // Seta o tipo de arquivo de saida, neste caso 3gp
        recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        // Seta o tipo de codec utilizado AMR_NB
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        // Seta o arquivo de saida
        recorder.setOutputFile(caminho);
    }

    public void iniciarGravacaoAudio(View v) {
        try {
            //prepara para a gravacao
            recorder.prepare();
            //inicia a gravacao
            recorder.start();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void terminarGravacaoAudio(View v) {
        //termina a gravacao
        recorder.stop();
        //libera todos os recursos utilizados
        recorder.release();
    }

}

