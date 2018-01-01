package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.utils.ConsultarMedicoesChassi;

/**
 * Created by Ruan on 27/11/2017.
 */

public class ConsultarMedicoesChassiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_medicoes_chassi);

    }

    public void btnBuscar(View view){
        ListView lstViewMedicoesChassi = (ListView)findViewById(R.id.lstView_medicoes_chassi);
        TextView txtStatus = (TextView)findViewById(R.id.txt_status);
        EditText edtChassi = (EditText)findViewById(R.id.edt_chassi);

        String chassi = edtChassi.getText().toString();

        ConsultarMedicoesChassi consultaMedicoesDados = new ConsultarMedicoesChassi(lstViewMedicoesChassi, txtStatus, this, chassi);
        consultaMedicoesDados.execute();
    }

    public void btnVoltar(View view){
        Intent intent = new Intent(ConsultarMedicoesChassiActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}
