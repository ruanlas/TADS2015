package com.example.ruan.buscacep;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Ruan on 10/11/2017.
 */

public class BuscarCEP extends AsyncTask<Object, Object, Void> {
    public String cep;
    private String enderecoCEP;
    //um ponteiro para o layout
    private TextView edtTxtEnderecoCEP;

    //construtor recebe como parametros:
    //text: ponteiro para a caixa de saida no layout
    //cep: codigo do cep informado pelo usuario
    public BuscarCEP(TextView text, String cep) {
        this.edtTxtEnderecoCEP = text;
        this.cep = cep;
    }

    @Override
    protected void onPreExecute(){
        //executa este metodo antes de qualquer outro
        edtTxtEnderecoCEP.setText("Iniciando...");
    }

    @Override
    protected Void doInBackground(Object... objects) {
        //este eh o metodo de conexao com o webservices
        //trata-se de uma conexao normal via HttpURLConnection
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        try {
            //URL url = new URL("viacep.com.br/ws/01001000/xml/");
            //concateno o cep com a URL e peco um resultado em JSON
            URL url = new URL("https://viacep.com.br/ws/"+cep+"/json/");

            //inicio o processo de conexao
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");

            //este metodo serve para atualizar o metodo onProgressUpdate
            publishProgress("Conectando...");
            urlConnection.connect();
            publishProgress("Conectado!");

            //uma vez que a conexao estah estabilizada basta recuperar a informacao do servidor
            InputStream inputStream = urlConnection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String linha;
            StringBuffer buffer = new StringBuffer();
            while((linha = reader.readLine()) != null) {
                buffer.append(linha);
                buffer.append("\n");
            }

            //Mostrar no console a saida do endereco no formato JSON - opcional
            System.out.println(buffer.toString());
            //apenas atualizar a variavel
            enderecoCEP = buffer.toString();

        } catch (Exception e) {
            e.printStackTrace();
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        //ao termino de tudo, faz o ponteiro da caixa de texto no layuout ser atualizado
        edtTxtEnderecoCEP.setText(enderecoCEP);
    }

    @Override
    protected void onProgressUpdate(Object... values) {
        //eh executado toda vez que publishProgress eh executado
        edtTxtEnderecoCEP.setText(values[0].toString());
    }
}
