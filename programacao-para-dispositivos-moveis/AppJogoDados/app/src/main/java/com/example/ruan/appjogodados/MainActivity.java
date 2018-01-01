package com.example.ruan.appjogodados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View view){
        ImageView imageDado1 = (ImageView)findViewById(R.id.imgViewDado1);
        ImageView imageDado2 = (ImageView)findViewById(R.id.imgViewDado2);
        TextView txtViewResultado = (TextView)findViewById(R.id.txtViewResultado);
        EditText edtTxtNumero = (EditText)findViewById(R.id.edtTxtNumero);

        int dado1, dado2, somaDados, numeroDigitado;
        numeroDigitado = Integer.valueOf(edtTxtNumero.getText().toString());
        Random random = new Random();
        dado1 = random.nextInt(6);
        dado2 = random.nextInt(6);
        somaDados = dado1 + dado2;
        String resultado;
        if (somaDados == numeroDigitado){
            resultado = "Voce Acertou!!!";
        }else {
            resultado = "Voce Errou!!!";
        }
        txtViewResultado.setText(resultado);

        if (dado1 == 1){
            imageDado1.setImageResource(R.drawable.dado1);
        }
        if (dado1 == 2){
            imageDado1.setImageResource(R.drawable.dado2);
        }
        if (dado1 == 3){
            imageDado1.setImageResource(R.drawable.dado3);
        }
        if (dado1 == 4){
            imageDado1.setImageResource(R.drawable.dado4);
        }
        if (dado1 == 5){
            imageDado1.setImageResource(R.drawable.dado5);
        }
        if (dado1 == 6){
            imageDado1.setImageResource(R.drawable.dado6);
        }
        if (dado2 == 1){
            imageDado2.setImageResource(R.drawable.dado1);
        }
        if (dado2 == 2){
            imageDado2.setImageResource(R.drawable.dado2);
        }
        if (dado2 == 3){
            imageDado2.setImageResource(R.drawable.dado3);
        }
        if (dado2 == 4){
            imageDado2.setImageResource(R.drawable.dado4);
        }
        if (dado2 == 5){
            imageDado2.setImageResource(R.drawable.dado5);
        }
        if (dado2 == 6){
            imageDado2.setImageResource(R.drawable.dado6);
        }


    }
}
