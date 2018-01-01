package com.example.ruan.minicalcv2;

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
        double numero1 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum1)).getText().toString());
        double numero2 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum2)).getText().toString());
        double resultado = numero1 + numero2;

        ((EditText) findViewById(R.id.edtTxtResultado)).setText(String.valueOf(resultado));
    }
    public void subtrair(View view){
        double numero1 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum1)).getText().toString());
        double numero2 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum2)).getText().toString());
        double resultado = numero1 - numero2;

        ((EditText) findViewById(R.id.edtTxtResultado)).setText(String.valueOf(resultado));
    }
    public void multiplicar(View view){
        double numero1 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum1)).getText().toString());
        double numero2 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum2)).getText().toString());
        double resultado = numero1 * numero2;

        ((EditText) findViewById(R.id.edtTxtResultado)).setText(String.valueOf(resultado));
    }
    public void dividir(View view){
        double numero1 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum1)).getText().toString());
        double numero2 = Double.parseDouble(((EditText) findViewById(R.id.edtTxtNum2)).getText().toString());
        double resultado = numero1 / numero2;

        ((EditText) findViewById(R.id.edtTxtResultado)).setText(String.valueOf(resultado));
    }

}
