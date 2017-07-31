package others;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import serialport.ComunicacaoSerial;

public class Cronometro extends Thread{
	private int tempLimite;
	private int tempo;
	private ComunicacaoSerial com;
	
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
		for (tempo = 0; tempo < tempLimite; tempo++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("tempo: "+ tempo +" segundos");
		}
		try {
			com.enviaDados('2');
		} catch (IOException e) {
			e.printStackTrace();
		}
		return;
	}
	
}
