package com.example.ruan.elementodinamico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.annotation.SuppressLint;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //utiliza o layout já existente
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
//instancia o botao dinâmico
        Button b2 = new Button(this);
//passa para o botão as mesmas propriedaes do layout
        b2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
//define o texto do botão
        b2.setText("Botão");
//definie as posições X e Y na qual o botão ficará posicionado no layout
        b2.setX(100);
        b2.setY(100);
//tamanho do texto e cor
        b2.setTextSize(30);
        b2.setTextColor(Color.BLACK);
//adiciona e exibe o botão no layout
        rl.addView(b2);

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //aqui entra o código para o evento onclick no botao b2
            }
        });

    }
}
