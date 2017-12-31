package others;

import javax.swing.JLabel;

import interfaces.AcaoSerialEventListener;

public class MostrarStatusLedNoLabel implements AcaoSerialEventListener{
	private JLabel lblStatusLed;
	
	public MostrarStatusLedNoLabel(JLabel lblStatusLed) {
		this.lblStatusLed = lblStatusLed;
	}
	@Override
	public void acaoSerialListener(String dadoLido) {
		lblStatusLed.setText(dadoLido);
	}

}
