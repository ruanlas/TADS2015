package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class TelaInicialController implements Initializable{
	
	@FXML
	private Button btnConnect, btnRefresh, btnRpm, btnPressaoMotor, btnVelocidade;
	@FXML
	private Label lblMedicao, lblStConnect;
	@FXML
	private ComboBox cBoxDeviceSelect;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}