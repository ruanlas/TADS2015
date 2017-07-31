package controllers;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.OperacaoDAO;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Operacao;

public class ConsultaSaldoTotalController implements Initializable{
	@FXML
	private Button btnVoltar;
	@FXML
	private Label lblSaldoGeral, lblTotalSaidas, lblTotalEntradas;
	@FXML
	private AnchorPane ap;
	
	private ArrayList<Operacao> entradas, saidas;
	
	private OperacaoDAO dao;
	
	private DecimalFormat format;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		format = new DecimalFormat("0.00");
		dao = new OperacaoDAO();
		entradas = new ArrayList<Operacao>();
		saidas = new ArrayList<Operacao>();
		this.carregarOperacoesES();
		this.calcularDados();
	}
	@FXML
	private void handleBtnVoltar() throws IOException {
		this.fechar();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaInicialController.class.getResource("/views/TelaInicial.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage nextStage = new Stage();
		nextStage.setTitle("Controle Financeiro");
		nextStage.setResizable(false);
		Scene scene = new Scene(page);
		nextStage.setScene(scene);

		nextStage.show();
	}
	private void carregarOperacoesES() {
		for (Operacao operacao : dao.findAll()) {
			if (operacao.getTipoOperacao()== 'E') {
				entradas.add(operacao);
			}
			if (operacao.getTipoOperacao()== 'S') {
				saidas.add(operacao);
			}
		}
	}
	private void calcularDados() {
		double totalEntradas = 0;
		double totalSaidas = 0;
		double saldoGeral = 0;
		
		for (Operacao operacao : entradas) {
			totalEntradas = totalEntradas + operacao.getValorOperacao();
		}
		for (Operacao operacao : saidas) {
			totalSaidas = totalSaidas + operacao.getValorOperacao();
		}
		
		saldoGeral = totalEntradas - totalSaidas;
		
		this.lblTotalEntradas.setText("R$: " + format.format(totalEntradas));
		this.lblTotalSaidas.setText("R$: " + format.format(totalSaidas));
		this.lblSaldoGeral.setText("R$: " + format.format(saldoGeral));
	}
	private void fechar() {
		Stage actual = (Stage) ap.getScene().getWindow();
		actual.close();
	}
	
}
