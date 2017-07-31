package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import messages.MessageAlerts;

public class TelaInicialController implements Initializable{
	
	@FXML
	private Button btnConsultaHistoricoMovimentacao, btnRegistrarOperacao, btnConsultarSaldo, btnSair;
	@FXML
	private AnchorPane ap;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void handleBtnConsultarHistoricoMovimentacao() throws IOException {
		this.fechar();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ConsultarHistoricoMovimentacaoController.class.getResource("/views/ConsultaHistoricoMovimentacao.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage nextStage = new Stage();
		nextStage.setTitle("Histórico de Movimentação");
		nextStage.setResizable(false);
		Scene scene = new Scene(page);
		nextStage.setScene(scene);

		nextStage.show();
	}
	@FXML
	private void handleBtnRegistrarOperacao() throws IOException {
		this.fechar();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(RegistroOperacaoController.class.getResource("/views/RegistroOperacao.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage nextStage = new Stage();
		nextStage.setTitle("Registrar Operação");
		nextStage.setResizable(false);
		Scene scene = new Scene(page);
		nextStage.setScene(scene);

		nextStage.show();
	}
	@FXML
	private void handleBtnConsultarSaldoTotal() throws IOException {
		this.fechar();
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ConsultaSaldoTotalController.class.getResource("/views/ConsultaSaldoTotal.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage nextStage = new Stage();
		nextStage.setTitle("Consulta de Saldo");
		nextStage.setResizable(false);
		Scene scene = new Scene(page);
		nextStage.setScene(scene);

		nextStage.show();
	}
	
	private void fechar() {
		Stage actual = (Stage) ap.getScene().getWindow();
		actual.close();
	}
	@FXML
	private void handleBtnSair() {
		if (MessageAlerts.sairDoSistema() == ButtonType.OK) {
			System.exit(0);
		}
	}
}
