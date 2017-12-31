package utils;

import java.util.ArrayList;

import javafx.scene.control.Label;

public class LabelMedicao implements CarregarElementoVisual{
	
	private Label lblMedicao;
	
	public LabelMedicao(Label lblMedicao) {
		this.lblMedicao = lblMedicao;
	}
	
	@Override
	public void carregarElemento(Object object) {
		String texto = (String)object;
		lblMedicao.setText(texto);		
	}

}
