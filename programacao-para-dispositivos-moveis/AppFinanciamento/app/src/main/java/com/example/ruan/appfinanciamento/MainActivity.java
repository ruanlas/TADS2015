package com.example.ruan.appfinanciamento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSimular(View view){
        RadioButton rbFinanciamentoImovel = (RadioButton)findViewById(R.id.rb_financiamento_imovel);
        RadioButton rbFinanciamentoVeiculo = (RadioButton)findViewById(R.id.rb_financiamento_veiculo);

        if (rbFinanciamentoImovel.isChecked()){
            Intent intent = new Intent(MainActivity.this, ImovelActivity.class );
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);

        }
        if (rbFinanciamentoVeiculo.isChecked()){
            Intent intent = new Intent(MainActivity.this, VeiculoActivity.class );
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        }
    }

    public void btnSair(View view){
        finish();
    }
}
