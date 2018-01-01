package com.example.ruan.medianotas;

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

    public void calcularMedia(View view){
        EditText edtNome = (EditText)findViewById(R.id.edtTxtNomeAluno);
        EditText edtP1 = (EditText)findViewById(R.id.edtTxtP1);
        EditText edtP2 = (EditText)findViewById(R.id.edtTxtP2);
        EditText edtP3 = (EditText)findViewById(R.id.edtTxtP3);
        TextView txtViewAluno = (TextView)findViewById(R.id.txtViewNomeAluno);
        TextView txtViewMedia = (TextView)findViewById(R.id.txtViewMedia);
        TextView txtViewSituacao = (TextView)findViewById(R.id.txtViewSituacao);

        double p1, p2, p3, media;
        String situacao;
        p1 = Double.parseDouble(edtP1.getText().toString());
        p2 = Double.parseDouble(edtP2.getText().toString());
        p3 = Double.parseDouble(edtP3.getText().toString());

        media = (p1 + p2 + p3) / 3;
        if (media >= 6){
            situacao = "Aprovado!";
        }else {
            situacao = "Reprovado!";
        }
        txtViewAluno.setText(edtNome.getText().toString());
        txtViewMedia.setText(String.valueOf(media));
        txtViewSituacao.setText(situacao);
    }


}
