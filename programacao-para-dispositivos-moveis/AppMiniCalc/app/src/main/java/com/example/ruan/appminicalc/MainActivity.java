package com.example.ruan.appminicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void somar(View view){
        EditText edtTxtNumero1 = (EditText) findViewById(R.id.edtTxtNumero1);
        EditText edtTxtNumero2 = (EditText) findViewById(R.id.edtTxtNumero2);
        EditText edtTxtResultado = (EditText) findViewById(R.id.edtTxtResultado);

        double numero1 = Double.parseDouble(edtTxtNumero1.getText().toString());
        double numero2 = Double.parseDouble(edtTxtNumero2.getText().toString());
        double resultado = numero1 + numero2;

        edtTxtResultado.setText(String.valueOf(resultado));
    }

}
