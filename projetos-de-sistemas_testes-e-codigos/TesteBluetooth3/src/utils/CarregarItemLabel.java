package utils;

import javax.swing.JLabel;

public class CarregarItemLabel implements PreencherElementoVisual{
	private JLabel label;
	
	public CarregarItemLabel(JLabel jLabel) {
		// TODO Auto-generated constructor stub
		this.label = jLabel;
	}
	
	@Override
	public void carregarElemento(String text) {
		// TODO Auto-generated method stub
		label.setText(text);
	}

}
