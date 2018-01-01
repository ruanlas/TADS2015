package com.example.ruan.appfinanciamento;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.ruan.exceptions.ExceptionEntradaInsuficiente;
import com.example.ruan.regranegocio.Financiamento;
import com.example.ruan.regranegocio.FinanciamentoCarro;
import com.example.ruan.regranegocio.FinanciamentoImovel;

public class VeiculoActivity extends AppCompatActivity {
    private EditText edtValorVeiculo, edtValorEntrada, edtQtdParcela, edtRendaLiquidaMensal;
    private CheckBox cbox_novo;

    private Financiamento financiamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veiculo);

        edtValorVeiculo = (EditText)findViewById(R.id.edt_valor_veiculo);
        edtValorEntrada = (EditText)findViewById(R.id.edt_valor_entrada);
        edtQtdParcela = (EditText)findViewById(R.id.edt_qtd_parcelas);
        edtRendaLiquidaMensal = (EditText)findViewById(R.id.edt_renda_liquida_mensal);
        cbox_novo = (CheckBox)findViewById(R.id.cbox_novo);

    }

    public void btnCalcular(View view){

        if (edtValorVeiculo.getText().toString().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //define o titulo
            builder.setTitle("Campos em Branco");
            //define a mensagem
            builder.setMessage("O campo Valor Veículo está vazio.\n Insira um valor para prosseguir");
            //define um botão como positivo
            builder.setNeutralButton("Ok", null);
            builder.show();

            edtValorVeiculo.requestFocus();
        }else if (edtValorEntrada.getText().toString().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //define o titulo
            builder.setTitle("Campos em Branco");
            //define a mensagem
            builder.setMessage("O campo Valor Entrada está vazio.\n Insira um valor para prosseguir");
            //define um botão como positivo
            builder.setNeutralButton("Ok", null);
            builder.show();

            edtValorEntrada.requestFocus();
        }else if (edtQtdParcela.getText().toString().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //define o titulo
            builder.setTitle("Campos em Branco");
            //define a mensagem
            builder.setMessage("O campo Quantidade de parcela está vazio.\n Insira um valor para prosseguir");
            //define um botão como positivo
            builder.setNeutralButton("Ok", null);
            builder.show();

            edtQtdParcela.requestFocus();
        }else if (edtRendaLiquidaMensal.getText().toString().isEmpty()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //define o titulo
            builder.setTitle("Campos em Branco");
            //define a mensagem
            builder.setMessage("O campo Renda Líquida Mensal está vazio.\n Insira um valor para prosseguir");
            //define um botão como positivo
            builder.setNeutralButton("Ok", null);
            builder.show();

            edtRendaLiquidaMensal.requestFocus();
        }else {

            financiamento = new FinanciamentoCarro();
            try {
                financiamento.inserirValorDoBem(Double.parseDouble(edtValorVeiculo.getText().toString()));
                financiamento.inserirValorEntrada(Double.parseDouble(edtValorEntrada.getText().toString()));
                financiamento.inserirQuantidadeDeParcelas(Integer.parseInt(edtQtdParcela.getText().toString()));
                financiamento.inserirRendaLiquidaMensal(Double.parseDouble(edtRendaLiquidaMensal.getText().toString()));
                financiamento.setNovo(cbox_novo.isChecked());

                financiamento.calcular();
                //chamar outra tela


                Intent intent = new Intent(VeiculoActivity.this, ResultadoActivity.class );
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT); //verificar se este método é necessário ou nao
                intent.putExtra("valorFinal", financiamento.getValorFinalBem());
                intent.putExtra("valorDaParcela", financiamento.getValorFinalCadaParcela());
                intent.putExtra("rendaLiquidaMensal", financiamento.getRendaLiquidaMensal());
//            financiamento = null;
                startActivity(intent);
                finish();
            } catch (ExceptionEntradaInsuficiente exceptionEntradaInsuficiente) {
                exceptionEntradaInsuficiente.printStackTrace();
                //tratamento aqui
                //Cria o gerador do AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                //define o titulo
                builder.setTitle("Atenção");
                //define a mensagem
                builder.setMessage("Você deve dar uma entrada de no mínimo 5% do valor do veículo");
                //define um botão como positivo
                builder.setNeutralButton("Ok", null);
                builder.show();
                edtValorEntrada.getText().clear();
                edtValorEntrada.requestFocus();
            }
        }


    }

    public void btnVoltar(View view){
        Intent intent = new Intent(VeiculoActivity.this, MainActivity.class );
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
        finish();
    }

}
