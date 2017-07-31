package others;
import java.io.IOException;

import javax.swing.JLabel;

import serialport.ComunicacaoSerial;

public class Cronometro extends Thread{
	private int tempLimite;
	private int tempo;
	private ComunicacaoSerial com;
	private JLabel lblCronometro;
	
	public Cronometro(int tempLimite, ComunicacaoSerial com, JLabel lblCronometro) {
		this.tempLimite = tempLimite;
		this.com = com;
		this.tempo = 0;
		this.lblCronometro = lblCronometro;
	}
	
	public Cronometro(int tempLimite, ComunicacaoSerial com) {
		this.tempLimite = tempLimite;
		this.com = com;
		this.tempo = 0;
	}
	
	public Cronometro(ComunicacaoSerial com) {
		this.com = com;
	}
	
	public void setTimeLimite(int timeLimite) {
		this.tempLimite = timeLimite;
	}
	
	@Override
	public void run() {
		for (tempo = 0; tempo <= tempLimite; tempo++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("tempo: "+ tempo +" segundos");
			lblCronometro.setText(String.valueOf(tempo));
		}
		try {
			com.enviaDados('2');
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblCronometro.setText("...");
		return;
	}
	
}
