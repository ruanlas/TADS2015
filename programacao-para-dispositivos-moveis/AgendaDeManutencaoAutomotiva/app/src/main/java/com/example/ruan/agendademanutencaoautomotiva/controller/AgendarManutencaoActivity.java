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


/**
 * Created by Ruan on 23/11/2017.
 */

public class AgendarManutencaoActivity extends AppCompatActivity {
    private EditText edtDataAgendamento, edtHorarioAgendamento, edtNotasObs, edtValor;
    private DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_manutencao);
        this.dbHelper = new DBHelper(this);

    }
    public void btnSalvar(View view){
        edtDataAgendamento = (EditText)findViewById(R.id.edt_data_agendamento);
        edtHorarioAgendamento = (EditText)findViewById(R.id.edt_horario_agendamento);
        edtNotasObs = (EditText)findViewById(R.id.edt_notas_obs);
        edtValor = (EditText)findViewById(R.id.edt_valor);

        LembreteManutencao lembreteManutencao = new LembreteManutencao();
        lembreteManutencao.setDataAgendamento(edtDataAgendamento.getText().toString());
        lembreteManutencao.setHorarioAgendamento(edtHorarioAgendamento.getText().toString());
        lembreteManutencao.setNotas(edtNotasObs.getText().toString());
        lembreteManutencao.setValor(Double.parseDouble(edtValor.getText().toString()));

        dbHelper.insert(lembreteManutencao);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Cadastro efetuado com sucesso!");
        builder.setPositiveButton("OK", null);
        builder.show();

        limparCampos();
    }

    public void btnVoltar(View view){
        Intent intent = new Intent(AgendarManutencaoActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    private void limparCampos(){
        edtDataAgendamento.getText().clear();
        edtHorarioAgendamento.getText().clear();
        edtNotasObs.getText().clear();
        edtValor.getText().clear();
        edtDataAgendamento.requestFocus();
    }
}