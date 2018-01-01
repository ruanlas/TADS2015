package com.example.ruan.agendademanutencaoautomotiva.utils;

        import android.os.AsyncTask;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;

        import com.example.ruan.agendademanutencaoautomotiva.controller.ConsultarMedicoesActivity;
        import com.example.ruan.agendademanutencaoautomotiva.controller.ConsultarMedicoesChassiActivity;

        import org.json.JSONArray;
        import org.json.JSONObject;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.net.URL;
        import java.util.ArrayList;

/**
 * Created by Ruan on 24/11/2017.
 */

public class ConsultarMedicoesChassi extends AsyncTask<Object, Object, Void> {
    private ListView lstViewMedicoesChassi;
    private String listaJsonString;
    private ArrayList<JSONObject> listJsonObjects;
    private ArrayAdapter<JSONObject> adapter = null;
    private ConsultarMedicoesChassiActivity consultarMedicoesChassiActivity;
    private TextView txtStatus;
    private String chassi;

    //construtor recebe como parametros:
    //text: ponteiro para a caixa de saida no layout
    //cep: codigo do cep informado pelo usuario
    public ConsultarMedicoesChassi(ListView lstViewMedicoesChassi, TextView txtStatus, ConsultarMedicoesChassiActivity consultarMedicoesChassiActivity, String chassi) {
        this.lstViewMedicoesChassi = lstViewMedicoesChassi;
        this.consultarMedicoesChassiActivity = consultarMedicoesChassiActivity;
        this.txtStatus = txtStatus;
        this.chassi = chassi;
    }

    @Override
    protected void onPreExecute(){
        //executa este metodo antes de qualquer outro
        txtStatus.setText("Iniciando...");
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
            URL url = new URL("http://18.231.62.135:5000/collection/"+chassi);

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
            listaJsonString = buffer.toString();

            listJsonObjects = new ArrayList<JSONObject>();

            JSONArray jsonArray = new JSONArray(listaJsonString);

            for (int index = 0; index < jsonArray.length(); index++) {
//                JSONObject jsonObject = jsonArray.getJSONObject(index);
                JSONObject jsonObject = jsonArray.optJSONObject(index);
                listJsonObjects.add(jsonObject);
            }


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
//        edtTxtEnderecoCEP.setText(enderecoCEP);
        adapter = new ArrayAdapter<JSONObject>(consultarMedicoesChassiActivity, android.R.layout.simple_list_item_1, listJsonObjects);
        lstViewMedicoesChassi.setAdapter(adapter);
        txtStatus.setText("Listagem das medições do chassi "+chassi+" completa!");
    }

    @Override
    protected void onProgressUpdate(Object... values) {
        //eh executado toda vez que publishProgress eh executado
        txtStatus.setText(values[0].toString());
    }
}

