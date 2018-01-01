package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.database.DBHelper;
import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;

import java.util.ArrayList;

/**
 * Created by Ruan on 26/11/2017.
 */

public class ConfirmacaoRealizacaoManutencaoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private DBHelper dbHelper;
    private ListView listConfirmacoesManutencao;
    private ArrayList<LembreteManutencao> listaLembretes = null;
    private ArrayAdapter<LembreteManutencao> adapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao_realizacao_manutencao);

        dbHelper = new DBHelper(this);
        listConfirmacoesManutencao = (ListView) findViewById(R.id.lstView_confirmacoes_manutencao);
        listConfirmacoesManutencao.setOnItemClickListener(this);
        listaLembretes = (ArrayList<LembreteManutencao>) dbHelper.queryGetAll();

        if (listaLembretes != null) {
            adapter = new ArrayAdapter<LembreteManutencao>(this, android.R.layout.simple_list_item_1, listaLembretes);
            listConfirmacoesManutencao.setAdapter(adapter);
        }

    }

    public void btnVoltar(View view) {
        Intent intent = new Intent(ConfirmacaoRealizacaoManutencaoActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LembreteManutencao lembreteManutencao = adapter.getItem(position);

        lembreteManutencao.setRealizado_naoRealizado();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if(lembreteManutencao.isRealizado() == 0){
            builder.setMessage("Esta manutenção foi marcada para ser realizada");
        }else if (lembreteManutencao.isRealizado() == 1){
            builder.setMessage("Esta manutenção foi marcada como realizada");
        }

        builder.setPositiveButton("OK", null);
        builder.show();

        dbHelper.updateRealizado(lembreteManutencao);
        adapter.notifyDataSetChanged();
    }
}
