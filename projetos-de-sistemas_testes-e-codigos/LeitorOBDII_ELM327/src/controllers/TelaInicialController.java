package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import device.DiscoveryDevices;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import utils.CBoxDevices;
import utils.LabelMedicao;
import utils.LabelStatusConnect;

public class TelaInicialController implements Initializable{
	
	@FXML
	private Button btnConnect, btnRefresh, btnRpm, btnPressaoMotor, btnVelocidade, btnTIpoComb, btnTempOleo, btnNivelComb;
	@FXML
	private Label lblMedicao, lblStConnect;
	@FXML
	private ComboBox cBoxDeviceSelect;
	
	private DiscoveryDevices discovery;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		discovery = new DiscoveryDevices();
		discovery.carregarComponentes(new CBoxDevices(cBoxDeviceSelect) , 
				new LabelMedicao(lblMedicao), new LabelStatusConnect(lblStConnect));
		try {
			discovery.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@FXML
	public void handleBtnConnectar() {
		int index = cBoxDeviceSelect.getSelectionModel().getSelectedIndex();
		if (index != -1) {
			try {
				discovery.connectToDevice(index);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("isso => "+index);
	}
	@FXML
	public void handleBtnAtualizar() {
		if (!cBoxDeviceSelect.getItems().isEmpty()) {
			cBoxDeviceSelect.getItems().clear();
		}
		try {
			discovery.refreshList();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void handleBtnRpm() {
		try {
			discovery.executeRpm();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void handleBtnPressaoMotor() {
		try {
			discovery.executeFuelPressure();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void handleBtnVelocidade() {
		try {
			discovery.executeSpeed();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void habdleBtnOilTemp() {
		try {
			discovery.executeOilTemp();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void handleBtnFindFuelType() {
		try {
			discovery.executeFindFuelType();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@FXML
	public void handleBtnFuelLevel() {
		try {
			discovery.executeFuelLevel();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
