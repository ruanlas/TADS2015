package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.database.DBHelper;
import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;
import com.example.ruan.agendademanutencaoautomotiva.utils.SectionGlobal;

import java.util.ArrayList;

/**
 * Created by Ruan on 26/11/2017.
 */

public class ListarManutencaoEdicaoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private DBHelper dbHelper;
    private ListView listManutencoesParaEdicao;
    private ArrayList<LembreteManutencao> listaLembretes = null;
    private ArrayAdapter<LembreteManutencao> adapter = null;
    private LembreteManutencao lembreteManutencaoEdicao = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_manutencao_edicao);

        dbHelper = new DBHelper(this);
        listManutencoesParaEdicao = (ListView)findViewById(R.id.lst_view_manutencoes_para_edicao);
        listManutencoesParaEdicao.setOnItemClickListener(this);
        listaLembretes = (ArrayList<LembreteManutencao>)dbHelper.queryGetAll();

        if(listaLembretes != null){
            adapter = new ArrayAdapter<LembreteManutencao>(this,android.R.layout.simple_list_item_1, listaLembretes);
            listManutencoesParaEdicao.setAdapter(adapter);
        }

    }

    public void btnVoltar(View view){
        Intent intent = new Intent(ListarManutencaoEdicaoActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        lembreteManutencaoEdicao = adapter.getItem(position);
        //variavel global
        SectionGlobal sectionGlobal = SectionGlobal.getInstance();
        sectionGlobal.setLembreteManutencaoEdicao(lembreteManutencaoEdicao);

        Intent intent = new Intent(ListarManutencaoEdicaoActivity.this, EdicaoActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}