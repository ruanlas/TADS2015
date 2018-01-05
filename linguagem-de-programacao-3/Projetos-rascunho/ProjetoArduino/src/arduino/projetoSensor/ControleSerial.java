package arduino.projetoSensor;

import java.io.OutputStream;

public class ControleSerial {
	private int taxaDados;
	private String nomePorta;
	
	public ControleSerial(String nomePorta, int taxaDados) {
		this.taxaDados = taxaDados;
		this.nomePorta = nomePorta;
	}
	public int getTaxaDados(){
		return taxaDados;
	}
	public String getNomePorta() {
		return nomePorta;
	}
}
