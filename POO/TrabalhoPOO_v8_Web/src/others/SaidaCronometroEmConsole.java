package others;

import java.io.IOException;

import interfaces.SaidaCronometro;
import serialport.ComunicacaoSerial;

public class SaidaCronometroEmConsole implements SaidaCronometro{
	private ComunicacaoSerial com;
	
	public SaidaCronometroEmConsole(ComunicacaoSerial com) {
		this.com = com;
	}
	
	@Override
	public void tique(int tempo) {
		System.out.println(tempo);
		
	}

	@Override
	public void tempoEncerrado() {
		try {
			this.com.desligaLed();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
