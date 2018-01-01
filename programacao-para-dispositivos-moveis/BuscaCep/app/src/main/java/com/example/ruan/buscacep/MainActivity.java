package com.example.ruan.buscacep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void consumir(View view){
        TextView txtEnderecoCEP = (TextView) findViewById(R.id.edtTxtEnderecoCEP);
        TextView txtCep = (TextView)findViewById(R.id.edtTxtCEP);
        BuscarCEP downloadDados = new BuscarCEP(txtEnderecoCEP, txtCep.getText().toString());

        downloadDados.cep = ((TextView) findViewById(R.id.edtTxtCEP)).getText().toString();
        downloadDados.execute();
    }

}
