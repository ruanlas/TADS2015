package controllers;

import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;

import org.hibernate.boot.jaxb.internal.stax.LocalSchema;

import dao.OperacaoDAO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import models.Operacao;

public class ConsultarHistoricoMovimentacaoController implements Initializable{
	@FXML
	private AnchorPane ap;
	@FXML
	private Button btnVoltar;
	@FXML
	private Label lblTotalEntradas,lblTotalSaidas, lblLucroMes, lblSaldoGeral;
	@FXML
	private TableView<Operacao> tableViewEntradas, tableViewSaidas;
	@FXML
	private TableColumn<Operacao, LocalDate> columDataEntrada, columDataSaida;
	@FXML
	private TableColumn<Operacao, String> columDescricaoEntrada, columDescricaoSaida;
	@FXML
	private TableColumn<Operacao, Double> columValorEntrada, columValorSaida;
	@FXML
	private ChoiceBox<Month> choiceBoxMes;
	
	private OperacaoDAO dao;
	private ArrayList<Operacao> saidas, entradas;
	private ObservableList<Operacao> observableListSaidas, observableListEntradas;
	
	private DecimalFormat format;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		format = new DecimalFormat("0.00");
		choiceBoxMes.setItems(FXCollections.observableArrayList(Month.values()));
		choiceBoxMes.setValue(LocalDate.now().getMonth());
		//Evento que "escuta" a seleção de um item do choiceBox
		choiceBoxMes.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
			@Override
			public void changed(ObservableValue observable, Object oldValue, Object newValue) {
				escolhaDoMesChoiceBox();
			}
		});
		
		dao = new OperacaoDAO();
		saidas = new ArrayList<Operacao>();
		entradas = new ArrayList<Operacao>();
		
		this.atualizarArrayEntradasESaidas();
		this.atualizarDadosNaTabela();
		this.calcularCampos();
	}
	private void atualizarArrayEntradasESaidas() {
		saidas.clear();
		entradas.clear();
		for (Operacao operacao : dao.findAll()) {
			if(operacao.getTipoOperacao()=='S' && operacao.getDataOperacao().getMonth().equals(this.choiceBoxMes.getValue())){
				saidas.add(operacao);
			}
		}
		
		for (Operacao operacao : dao.findAll()) {
			if(operacao.getTipoOperacao()=='E' && operacao.getDataOperacao().getMonth().equals(this.choiceBoxMes.getValue())){
				entradas.add(operacao);
			}
		}
	}
	private void atualizarDadosNaTabela() {
		this.columDataEntrada.setCellValueFactory(new PropertyValueFactory<>("dataOperacao"));
		this.columDescricaoEntrada.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		this.columValorEntrada.setCellValueFactory(new PropertyValueFactory<>("valorOperacao"));
		
		this.observableListEntradas = FXCollections.observableArrayList(entradas);
		this.tableViewEntradas.setItems(this.observableListEntradas);
		
		this.columDataSaida.setCellValueFactory(new PropertyValueFactory<>("dataOperacao"));
		this.columDescricaoSaida.setCellValueFactory(new PropertyValueFactory<>("descricao"));
		this.columValorSaida.setCellValueFactory(new PropertyValueFactory<>("valorOperacao"));
		
		this.observableListSaidas = FXCollections.observableArrayList(saidas);
		this.tableViewSaidas.setItems(this.observableListSaidas);
	}
	private void calcularCampos() {
		double lucroMes = 0;
		double somaEntradas = 0;
		double somaSaidas = 0;
		double entradasTotais = 0;
		double saidasTotais = 0;
		double saldoGeral = 0;
		
		for (Operacao operacao : entradas) {
			somaEntradas += operacao.getValorOperacao();
		}
		for (Operacao operacao : saidas) {
			somaSaidas += operacao.getValorOperacao();
		}
		//faz o cálculo do saldo geral
		for (Operacao operacao : dao.findAll()) {
			if (operacao.getTipoOperacao() == 'E') {
				entradasTotais = entradasTotais + operacao.getValorOperacao();
			}
			if (operacao.getTipoOperacao() == 'S') {
				saidasTotais = saidasTotais + operacao.getValorOperacao();
			}
		}
		saldoGeral = entradasTotais - saidasTotais;
		lucroMes = somaEntradas - somaSaidas;
		
		this.lblTotalEntradas.setText("R$: " + format.format(somaEntradas));
		this.lblTotalSaidas.setText("R$: " + format.format(somaSaidas));
		this.lblLucroMes.setText("R$: " + format.format(lucroMes));
		this.lblSaldoGeral.setText("R$: " + format.format(saldoGeral));
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
	
	private void fechar() {
		Stage actual = (Stage) ap.getScene().getWindow();
		actual.close();
	}
	
	private void escolhaDoMesChoiceBox() {
		this.atualizarArrayEntradasESaidas();
		this.atualizarDadosNaTabela();
		this.calcularCampos();
	}

}
