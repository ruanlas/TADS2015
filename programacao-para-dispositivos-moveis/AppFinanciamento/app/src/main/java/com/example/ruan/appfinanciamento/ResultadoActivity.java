package com.example.ruan.appfinanciamento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        EditText edtValorFinal = (EditText)findViewById(R.id.edt_valor_final_financiamento);
        EditText edtValorParcela = (EditText)findViewById(R.id.edt_valor_parcela);
        EditText edtObs = (EditText)findViewById(R.id.edt_obs);

        //deixa os campos desabilitados para edição
        edtObs.setEnabled(false);
        edtValorFinal.setEnabled(false);
        edtValorParcela.setEnabled(false);

        Intent thisIntent = getIntent();
        double valorFinalFinanciamento = thisIntent.getDoubleExtra("valorFinal",0);
        double valorParcelaFinanciamento = thisIntent.getDoubleExtra("valorDaParcela",0);
        double rendaLiquidaMensal = thisIntent.getDoubleExtra("rendaLiquidaMensal",0);

        edtValorFinal.setText("R$ " + String.format("%.2f",valorFinalFinanciamento));
        edtValorParcela.setText("R$ " + String.format("%.2f",valorParcelaFinanciamento));

        //realiza o calculo para analisar se o valor da parcela atinge 30% da renda mensal
        double limiteParcela = (rendaLiquidaMensal * 0.3) + rendaLiquidaMensal;

        if (valorParcelaFinanciamento > limiteParcela){
            edtObs.setText("Sem Requisitos!");
        }else {
            edtObs.setText("Financiamento Aprovado!");
        }

    }

    public void novaSimulacao(View view){
        Intent intent = new Intent(ResultadoActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }
}
