package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.database.DBHelper;
import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;

import java.util.ArrayList;

/**
 * Created by Ruan on 23/11/2017.
 */

public class ListarManutencoesActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    private ListView listManutencoes;
    private ArrayList<LembreteManutencao> listaLembretes = null;
    private ArrayAdapter<LembreteManutencao> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_manutencoes);

        dbHelper = new DBHelper(this);
        listManutencoes = (ListView)findViewById(R.id.lstView_manutencoes);
        listaLembretes = (ArrayList<LembreteManutencao>)dbHelper.queryGetAll();

        if(listaLembretes != null){
            adapter = new ArrayAdapter<LembreteManutencao>(this,android.R.layout.simple_list_item_1, listaLembretes);
            listManutencoes.setAdapter(adapter);
        }

    }

    public void rbManutencoesRealizadas(View view){
        if (listaLembretes != null){
            this.listarManutencoes(view);
        }
    }

    public void rbManutencoesAgendadas(View view){
        if (listaLembretes != null){
            this.listarManutencoes(view);
        }
    }
    private void listarManutencoes(View view){
        listaLembretes = (ArrayList<LembreteManutencao>)dbHelper.queryGetAll();
        ArrayList<LembreteManutencao> filtroManutencoes = new ArrayList<LembreteManutencao>();

        RadioGroup rbFiltro = (RadioGroup)findViewById(R.id.rbFiltro);

        int opcao = rbFiltro.getCheckedRadioButtonId();

        switch (opcao){
            case R.id.rb_manutencoes_agendadas:
                this.manutencaoAgendada(filtroManutencoes);
                break;
            case R.id.rb_manutencoes_realizadas:
                this.manutencaoRealizada(filtroManutencoes);
                break;
        }
        adapter.clear();
        adapter.addAll(filtroManutencoes);
        adapter.notifyDataSetChanged();
    }

    private void manutencaoAgendada(ArrayList<LembreteManutencao> filtroManutencoes){
        filtroManutencoes.clear();
        for (LembreteManutencao mantencaoAgendada: listaLembretes) {
            if (mantencaoAgendada.isRealizado() == 0){
                filtroManutencoes.add(mantencaoAgendada);
            }
        }
    }

    private void manutencaoRealizada(ArrayList<LembreteManutencao> filtroManutencoes){
        filtroManutencoes.clear();
        for (LembreteManutencao mantencaoRealizada: listaLembretes) {
            if (mantencaoRealizada.isRealizado() == 1){
                filtroManutencoes.add(mantencaoRealizada);
            }
        }
    }

    public void btnVoltar(View view){
        Intent intent = new Intent(ListarManutencoesActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}