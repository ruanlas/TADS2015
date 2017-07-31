package others;

import java.io.IOException;

import javax.swing.JLabel;

import interfaces.SaidaCronometro;
import serialport.ComunicacaoSerial;

public class SaidaCronometroEmJLabelEPortaCom implements SaidaCronometro{
	private ComunicacaoSerial com;
	private JLabel lblCronometro;
	
	public SaidaCronometroEmJLabelEPortaCom(ComunicacaoSerial com, JLabel lblCronometro) {
		this.com = com;
		this.lblCronometro = lblCronometro;
	}

	@Override
	public void tique(int tempo) {
		this.lblCronometro.setText(String.valueOf(tempo));
	}

	@Override
	public void tempoEncerrado() {
		try {
//			this.com.enviaDados('2');
			this.com.desligaLed();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
