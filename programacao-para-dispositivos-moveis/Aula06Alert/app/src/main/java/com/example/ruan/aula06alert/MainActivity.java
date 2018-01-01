package com.example.ruan.aula06alert;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert Dialog");
        builder.setMessage("This is the alert's body");

    }

    public void alerta1(View view) {
        builder.setIcon(android.R.drawable.ic_dialog_info);

        builder.setPositiveButton("OK", new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView txt = (TextView) findViewById(R.id.edtTxtCaixaTexto);
                txt.setText("You clicked Ok");
            }
        });
        builder.show();
    }

    public void alerta2(View view) {
        builder.setIcon(android.R.drawable.ic_dialog_dialer);
        builder.setNegativeButton("Cancel", new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView txt = (TextView) findViewById(R.id.edtTxtCaixaTexto);
                txt.setText("You clicked Cancel");
            }
        });
        builder.show();
    }

    public void alerta3(View view) {
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setNeutralButton("Do something", new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView txt = (TextView) findViewById(R.id.edtTxtCaixaTexto);
                txt.setText("Neutral Button Clicked");
                AlertDialog ad = builder.create();
                ad.cancel();
            }
        });
        builder.show();
    }


}
