package controlers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.TooManyListenersException;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import others.Cronometro;
import serialport.ComunicacaoSerial;
import serialport.ObterDadosSerial;

public class ControlerPainelInicial implements Initializable{
	private ComunicacaoSerial com;

	@FXML
	private Label lblStatusLed;
	@FXML
	private Label lblTimer;
	@FXML
	private TextField txFieldTime;
	private ObterDadosSerial obtDado;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			this.com = new ComunicacaoSerial("COM3");
			this.obtDado = new ObterDadosSerial(com, lblStatusLed);
		} catch (PortNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PortInUseException e) {
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void btnLigarLed() {
		System.out.println("ffffffffff");
		ligarLed();
	}
	private void ligarLed() {
		int tempo = 0;
		try {
			tempo = Integer.parseInt(txFieldTime.getText());
		} catch (NumberFormatException e) {
			Alert errorAlert = new Alert(AlertType.ERROR);
			errorAlert.setContentText("Por favor, insira um caractere válido!");
			errorAlert.setTitle("Atenção");
			errorAlert.show();
		}
		try {
			com.enviaDados('1');
			Cronometro cronometro = new Cronometro(tempo, com);
			cronometro.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void atualizar() {
		this.com.close();
		this.initialize(null, null);
	}
	
	@FXML
	public void btnAtualizarPorta(){
		this.atualizar();
	}

}
