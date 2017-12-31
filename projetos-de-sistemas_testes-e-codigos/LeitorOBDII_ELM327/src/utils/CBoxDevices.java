package utils;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CBoxDevices implements CarregarElementoVisual{
	//@FXML
	private ComboBox cBoxDeviceSelect;
	
	public CBoxDevices(ComboBox cBoxDeviceSelect) {
		this.cBoxDeviceSelect = cBoxDeviceSelect;
	}

	@Override
	public void carregarElemento(Object object) {
		ArrayList<String> list = (ArrayList<String>)object;
		cBoxDeviceSelect.setItems(FXCollections.observableArrayList(list));
	}

}
