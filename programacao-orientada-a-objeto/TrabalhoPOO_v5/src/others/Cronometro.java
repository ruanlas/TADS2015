package others;
import java.io.IOException;

import javax.swing.JLabel;

import serialport.ComunicacaoSerial;

public class Cronometro extends Thread{
	private SaidaCronometro saidaCronometro;
	private int tempLimite;
	private int tempo;
	
	public Cronometro(int tempLimite, SaidaCronometro saidaCronometro) {
		this.tempLimite = tempLimite;
		this.tempo = 0;
		this.saidaCronometro = saidaCronometro;
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
			saidaCronometro.tique(tempo);
		}
		saidaCronometro.tempoEncerrado();
	}
	
}
