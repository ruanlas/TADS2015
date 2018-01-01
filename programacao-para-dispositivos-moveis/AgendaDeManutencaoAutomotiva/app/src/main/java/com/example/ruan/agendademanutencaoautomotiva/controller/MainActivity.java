package com.example.ruan.agendademanutencaoautomotiva.controller;

import android.content.DialogInterface;
import android.content.Intent;;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

import com.example.ruan.agendademanutencaoautomotiva.R;
import com.example.ruan.agendademanutencaoautomotiva.utils.ConsultarMedicoesChassi;


public class MainActivity extends AppCompatActivity {
    protected static final int MENU1 = 1;
    protected static final int MENU1_SUBMENU1 = 11;
    protected static final int MENU1_SUBMENU2 = 12;
    protected static final int MENU2 = 2;
    protected static final int MENU2_SUBMENU1 = 21;
    protected static final int MENU2_SUBMENU2 = 22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnListarManutencao(View view){
        Intent intent = new Intent(MainActivity.this, ListarManutencoesActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    public void btnAgendarManutencao(View view){
        Intent intent = new Intent(MainActivity.this, AgendarManutencaoActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

    public void btnSair(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Você está prestes a sair");
        builder.setMessage("Você deseja realmente sair do sistema?");
        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });
        builder.setNegativeButton("NÃO", null);
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // cria um sub menu
        SubMenu sub1 = menu.addSubMenu(0,0,MENU1,"Consultar monitoramento");
        sub1.add(0, MENU1_SUBMENU1, 0, "Consultar todos os monitoramentos");
        sub1.add(0, MENU1_SUBMENU2, 1, "Consultar monitoramento por chassi");

        SubMenu sub2 = menu.addSubMenu(0,0,MENU2,"Gerenciamento de manutenção");
        sub2.add(0, MENU2_SUBMENU1, 0, "Editar manutenção");
        sub2.add(0, MENU2_SUBMENU2, 1, "Confirmar realização da manutenção");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();

        switch (i) {
            case MENU1_SUBMENU1:
                Intent intent = new Intent(MainActivity.this, ConsultarMedicoesActivity.class );
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
                finish();
                break;
            case MENU1_SUBMENU2:
                Intent intent2 = new Intent(MainActivity.this, ConsultarMedicoesChassiActivity.class );
                intent2.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent2);
                finish();
                break;

            case MENU2_SUBMENU1:
                Intent intent3 = new Intent(MainActivity.this, ListarManutencaoEdicaoActivity.class );
                intent3.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent3);
                finish();
                break;
            case MENU2_SUBMENU2:
                Intent intent4 = new Intent(MainActivity.this, ConfirmacaoRealizacaoManutencaoActivity.class);
                intent4.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent4);
                finish();
                break;
        }
        return false;

    }
}
