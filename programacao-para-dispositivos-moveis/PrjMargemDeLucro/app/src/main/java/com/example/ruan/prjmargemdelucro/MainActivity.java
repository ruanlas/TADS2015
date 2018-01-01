package com.example.ruan.prjmargemdelucro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRB25(View v){
        this.realizarCalculo(v);
    }
    public void clickRB50(View v){
        this.realizarCalculo(v);
    }
    public void clickRB75(View v){
        this.realizarCalculo(v);
    }

    public void realizarCalculo(View v) {
        //recuperar os campos da tela - xml
        EditText edvalor = (EditText) findViewById(R.id.edvalor);
        RadioGroup rg = (RadioGroup) findViewById(R.id.rgopcoes);
        //variaveis locais
        double valor_digitado, new_value = 0;

        //recuperar o valor digitado na tela
        valor_digitado = Double.parseDouble(edvalor.getText().toString());

        //descobrir qual foi o radio button clicado
        int op = rg.getCheckedRadioButtonId();
        switch (op) {
            case R.id.rb25:
                new_value = valor_digitado + (valor_digitado * 0.25);
                break;
            case R.id.rb50:
                new_value = valor_digitado + (valor_digitado * 0.50);
                break;
            case R.id.rb75:
                new_value = valor_digitado + (valor_digitado * 0.75);
                break;
        }

        //exibir um alerta com o resultado do calculo
        AlertDialog.Builder mensagem = new AlertDialog.Builder(this);
        mensagem.setTitle("Resultado");
        mensagem.setMessage("Vender por R$: " + String.valueOf(new_value));
        mensagem.setNeutralButton("OK", null);
        mensagem.show();
    }

}
