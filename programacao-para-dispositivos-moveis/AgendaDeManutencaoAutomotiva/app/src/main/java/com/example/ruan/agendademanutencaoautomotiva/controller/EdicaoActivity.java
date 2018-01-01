package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.database.DBHelper;
import com.example.ruan.agendademanutencaoautomotiva.models.LembreteManutencao;
import com.example.ruan.agendademanutencaoautomotiva.utils.SectionGlobal;

/**
 * Created by Ruan on 26/11/2017.
 */

public class EdicaoActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    private SectionGlobal sectionGlobal;
    private EditText edtDataAgendamento, edtHorarioAgendamento, edtNotasObs, edtValor;
    private LembreteManutencao lembreteManutencaoEdicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicao);

        edtDataAgendamento = (EditText)findViewById(R.id.edt_data_agendamento2);
        edtHorarioAgendamento = (EditText)findViewById(R.id.edt_horario_agendamento2);
        edtNotasObs = (EditText)findViewById(R.id.edt_notas_obs2);
        edtValor = (EditText)findViewById(R.id.edt_valor2);

        dbHelper = new DBHelper(this);
        sectionGlobal = SectionGlobal.getInstance();
        lembreteManutencaoEdicao = sectionGlobal.getLembreteManutencaoEdicao();
//        sectionGlobal.setLembreteManutencaoEdicao(null);

        edtDataAgendamento.setText(lembreteManutencaoEdicao.getDataAgendamento());
        edtHorarioAgendamento.setText(lembreteManutencaoEdicao.getHorarioAgendamento());
        edtNotasObs.setText(lembreteManutencaoEdicao.getNotas());
        edtValor.setText(String.valueOf(lembreteManutencaoEdicao.getValor()));

    }

    public void btnSalvarEdicao(View view){

        lembreteManutencaoEdicao.setDataAgendamento(edtDataAgendamento.getText().toString());
        lembreteManutencaoEdicao.setHorarioAgendamento(edtHorarioAgendamento.getText().toString());
        lembreteManutencaoEdicao.setNotas(edtNotasObs.getText().toString());
        lembreteManutencaoEdicao.setValor(Double.parseDouble(edtValor.getText().toString()));

        dbHelper.update(lembreteManutencaoEdicao);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Alterações realizadas com sucesso!");
        builder.setPositiveButton("OK", null);
        builder.show();

        voltar();

    }

    public void btnVoltar(View view) {
        voltar();
    }
    private void voltar(){
        sectionGlobal.setLembreteManutencaoEdicao(null);

        Intent intent = new Intent(EdicaoActivity.this, ListarManutencaoEdicaoActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}