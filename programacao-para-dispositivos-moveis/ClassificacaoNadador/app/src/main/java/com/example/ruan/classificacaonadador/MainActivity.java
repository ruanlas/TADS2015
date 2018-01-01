package com.example.ruan.classificacaonadador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void classificar(View view){
        EditText edtTxtIdade = (EditText)findViewById(R.id.edtTxtIdade);
        TextView txtViewCategoria = (TextView)findViewById(R.id.txtViewCategoria);
        int idade = Integer.valueOf(edtTxtIdade.getText().toString());
        String categoria;

        if(idade >= 5 && idade <= 7){
            categoria = "INFANTIL A";
        }else if (idade >= 8 && idade <= 10){
            categoria = "INFANTIL B";
        }else if (idade >= 11 && idade <= 13){
            categoria = "JUVENIL A";
        }else if (idade >= 14 && idade <= 17){
            categoria = "JUVENIL B";
        }else if (idade >= 18){
            categoria = "ADULTO";
        }else {
            categoria = "";
        }
        txtViewCategoria.setText("Categoria: "+categoria);
    }
}
