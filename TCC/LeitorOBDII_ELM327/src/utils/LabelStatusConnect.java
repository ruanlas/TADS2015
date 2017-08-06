package utils;

import java.util.ArrayList;

import javafx.scene.control.Label;

public class LabelStatusConnect implements CarregarElementoVisual{

	private Label lblStConnect;
	
	public LabelStatusConnect(Label lblStConnect) {
		this.lblStConnect = lblStConnect;
	}
	@Override
	public void carregarElemento(Object object) {
		String texto = (String)object;
		lblStConnect.setText(texto);
	}

}
