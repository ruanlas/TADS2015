package arduino.projetoSensor;

import java.io.IOException;
import java.io.OutputStream;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;

public class EscritaSerial extends ControleSerial{
	private OutputStream serialOut;
	public EscritaSerial(String nomePorta, int taxaDados) {
		super(nomePorta, taxaDados);
		this.inicializacao();
		// TODO Auto-generated constructor stub
	}
	
	private void inicializacao() {
		CommPortIdentifier portaId = null;
		try {
			portaId = CommPortIdentifier.getPortIdentifier(this.getNomePorta());
		} catch (NoSuchPortException e) {
			System.out.println("Erro: "+e);
		}
		try {
			SerialPort portaSerial = (SerialPort)portaId.open("Comunicação", this.getTaxaDados());
			serialOut = portaSerial.getOutputStream();
			//passagem de parâmetros
			portaSerial.setSerialPortParams(this.getTaxaDados(), SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro: "+e);
			return;
		}
	}
	
	public void close() {
		try {
			serialOut.close();
		} catch (IOException e) {
			System.out.println("Erro: "+e);
		}
	}
	
	public void enviarDados(int op) {
		try {
			serialOut.write(op);//escreve na porta serial
		} catch (IOException e) {
			System.out.println("Erro: "+ e);
		}
	}

}
