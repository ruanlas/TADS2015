import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
//classe que se comunicará com a porta serial
public class ComunicacaoSerial {
	private SerialPort serialPort;
	private BufferedReader imput;
	private OutputStream output;
	
	public ComunicacaoSerial(String portName){
		serialPort = SerialConnection.getSerialPortConnection(portName);
		if(serialPort == null){
			System.out.println("Porta não encontrada!!");
			return;
		}
		try {
			imput = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Serial iniciada com sucesso!!");
	}
	
	public SerialPort getSerialPort() {
		return this.serialPort;
	}
	
	public synchronized String recebeDados() throws IOException {
		return this.imput.readLine();
	}
	
	public synchronized void enviaDados(char c) throws IOException {
		this.output.write(c);
	}
	
	public void close() {
		if (serialPort != null) {
			serialPort.close();
		}
	}
	
	public void finalize() {
		if (serialPort != null) {
			serialPort.close();
		}
	}
}
