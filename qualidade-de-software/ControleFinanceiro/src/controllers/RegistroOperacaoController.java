package controllers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.OperacaoDAO;
import exceptions.DataInvalidaException;
import exceptions.DescricaoNulaException;
import exceptions.OperacaoNaoSelecionadaException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import messages.MessageAlerts;
import models.Operacao;

public class RegistroOperacaoController implements Initializable{
	@FXML
	private DatePicker datePickerDataOperacao;
	@FXML
	private TextField txtDescricao, txtValor;
	@FXML
	private RadioButton rdBtnEntrada, rdBtnSaida;
	@FXML
	private Button btnRegistrar, btnVoltar;
	@FXML
	private AnchorPane ap;
	
	private OperacaoDAO dao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		this.rdBtnEntrada.setSelected(true);
		datePickerDataOperacao.setValue(LocalDate.now());
		dao = new OperacaoDAO();
		
	}
	@FXML
	private void handleBtnRegistrar() {
		try {
			if (!(this.rdBtnEntrada.isSelected()) && !(this.rdBtnSaida.isSelected())) {
				throw new OperacaoNaoSelecionadaException();
			}
			if (this.datePickerDataOperacao.getValue() == null) {
				throw new DataInvalidaException();
			}
			if (this.txtDescricao.getText().isEmpty()) {
				throw new DescricaoNulaException();
			}
			this.registrar();
			this.limparCampos();
		} catch (OperacaoNaoSelecionadaException e) {
			// TODO: handle exception
			System.out.println("Selecione uma operação");
			MessageAlerts.operacaoNaoSelecionada();
		} catch (DataInvalidaException e) {
			// TODO Auto-generated catch block
			System.out.println("Insira uma data válida");
			MessageAlerts.dataInvalida();
		} catch (DescricaoNulaException e) {
			// TODO Auto-generated catch block
			System.out.println("Insira uma descrição");
			MessageAlerts.descricaoNula();
		}catch (NumberFormatException e) {
			// TODO: handle exception
			MessageAlerts.valorInvalido();
			System.out.println("Valor Inválido");
			this.txtValor.clear();
		}
		
	}
	private void registrar() {
		Operacao operacao = new Operacao();
		LocalDate dataOperacao = this.datePickerDataOperacao.getValue();
		String descricao = this.txtDescricao.getText();
		double valorOperacao = Double.parseDouble(this.txtValor.getText());
		char tipoOperacao = 0;
		if(this.rdBtnEntrada.isSelected()){
			tipoOperacao = 'E';
		}
		if(this.rdBtnSaida.isSelected()){
			tipoOperacao = 'S';
		}
		operacao.setDataOperacao(dataOperacao);
		operacao.setDescricao(descricao);
		operacao.setTipoOperacao(tipoOperacao);
		operacao.setValorOperacao(valorOperacao);
		dao.insert(operacao);
	}
	@FXML
	private void handleBtnVoltar() throws IOException {
		if (MessageAlerts.sairECancelar() == ButtonType.OK) {
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
	}
	
	private void fechar() {
		Stage actual = (Stage) ap.getScene().getWindow();
		actual.close();
	}
	@FXML
	private void rdBtnAction() {
		if(this.rdBtnEntrada.isArmed()){
			this.rdBtnSaida.setSelected(false);
		}
		if(this.rdBtnSaida.isArmed()){
			this.rdBtnEntrada.setSelected(false);
		}
	}
	private void limparCampos() {
		this.txtDescricao.clear();
		this.txtValor.clear();
		this.rdBtnEntrada.setSelected(true);
		this.rdBtnSaida.setSelected(false);
	}
}
