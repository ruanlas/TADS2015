package com.example.ruan.prjconstruindomenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.AlertDialog;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;


public class MainActivity extends AppCompatActivity {

    //a construcao do menu segue uma ordem
    protected static final int MENU1 = 1;
    protected static final int MENU2 = 2;
    protected static final int SUBMENU = 3;
    protected static final int SUBMENU1 = 31;
    protected static final int SUBMENU2 = 32;
    protected static final int SUBMENU3 = 33;
    protected static final int MENU4 = 4;

    //cria uma caixa de dialogo para interacao com o usuario
    protected AlertDialog.Builder mensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagem = new AlertDialog.Builder(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // cria uma opção para o menu
        // menu.add(grupo para o item de menu, indice do item do menu, ordem de exibicao, titulo para o menu)
        menu.add(0, MENU1, 0, "Menu 1");
        menu.add(0, MENU2, 1, "Menu 2");

        // cria um sub menu
        SubMenu sub = menu.addSubMenu(0,0,SUBMENU,"Menu 3 - Sub");
        sub.add(0, SUBMENU1, 0, "Sub Menu 1");
        sub.add(0, SUBMENU2, 1, "Sub Menu 2");
        sub.add(0, SUBMENU3, 2, "Sub Menu 3");

        menu.add(0, MENU4, 4, "Menu 4 - Sair");

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int i = item.getItemId();

        switch (i) {
            case MENU1:
                mensagem.setTitle("Menu Item - 1");
                mensagem.setMessage("Clicou: MENU 1");
                mensagem.setNeutralButton("OK", null);
                break;
            case MENU2:
                mensagem.setTitle("Menu Item - 2");
                mensagem.setMessage("Clicou: MENU 2");
                mensagem.setNeutralButton("OK", null);
                break;

//inicio: SUBMENU ITENS ----------------------------
            case SUBMENU1:
                mensagem.setTitle("SUB Menu Item");
                mensagem.setMessage("Clicou: SUBMENU 1");
                mensagem.setNeutralButton("OK", null);
                break;
            case SUBMENU2:
                mensagem.setTitle("SUB Menu Item");
                mensagem.setMessage("Clicou: SUBMENU 2");
                mensagem.setNeutralButton("OK", null);
                break;
            case SUBMENU3:
                mensagem.setTitle("SUB Menu Item");
                mensagem.setMessage("Clicou: SUBMENU 3");
                mensagem.setNeutralButton("OK", null);
                break;
//fim: SUBMENU ITENS ----------------------------

            case MENU4:
                System.exit(0);
                break;
        }

        mensagem.show();

        return false;

    }

}
