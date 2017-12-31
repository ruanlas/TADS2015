package others;
import java.io.IOException;

import javax.swing.JLabel;

import serialport.ComunicacaoSerial;

public class CronometroPisca extends Thread{
	private int tempLimite;
	private int tempo;
	private ComunicacaoSerial com;
	private JLabel lblCronometro;
	private int ms;
	
	public CronometroPisca(int tempLimite, ComunicacaoSerial com, JLabel lblCronometro, int ms) {
		this.tempLimite = tempLimite;
		this.com = com;
		this.tempo = 0;
		this.lblCronometro = lblCronometro;
		this.ms = ms;
	}
	
	public CronometroPisca(int tempLimite, ComunicacaoSerial com) {
		this.tempLimite = tempLimite;
		this.com = com;
		this.tempo = 0;
	}
	
	public CronometroPisca(ComunicacaoSerial com) {
		this.com = com;
	}
	
	public void setTimeLimite(int timeLimite) {
		this.tempLimite = timeLimite;
	}
	
	@Override
	public void run() {
		
		char value = '1';
		
		for (tempo = 0; tempo <= tempLimite; tempo++) {
			try {
				sleep(ms);
				
				if (value == '1'){
					value = '2';
					com.enviaDados(value);
				} else {
					value = '1';
					com.enviaDados(value);
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e){
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
