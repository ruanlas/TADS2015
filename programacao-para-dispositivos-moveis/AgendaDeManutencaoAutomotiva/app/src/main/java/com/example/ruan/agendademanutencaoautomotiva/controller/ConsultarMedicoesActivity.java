package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.utils.ConsultaMedicoes;

/**
 * Created by Ruan on 24/11/2017.
 */

public class ConsultarMedicoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_todas_medicoes);

        ListView lstViewTodasMedicoes = (ListView)findViewById(R.id.lst_view_todas_medicoes);
        TextView txtStatus = (TextView)findViewById(R.id.txtView_status);

        ConsultaMedicoes consultaMedicoesDados = new ConsultaMedicoes(lstViewTodasMedicoes, txtStatus, this);
        consultaMedicoesDados.execute();
    }

    public void btnVoltar(View view){
        Intent intent = new Intent(ConsultarMedicoesActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}
