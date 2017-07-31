package serialport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.TooManyListenersException;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;
//classe que se comunicará com a porta serial
public class ComunicacaoSerial implements SerialPortEventListener{
	private SerialPort serialPort;
	private BufferedReader imput;
	private OutputStream output;
	private AcaoSerialEventListener acaoSerialEventListener;
	
	public ComunicacaoSerial(String portName, AcaoSerialEventListener acao) throws IOException, PortNotFoundException, PortInUseException, UnsupportedCommOperationException {
		serialPort = SerialConnection.getSerialPortConnection(portName);
		acaoSerialEventListener = acao;
		if(serialPort == null){
			throw new PortNotFoundException();
		}
		imput = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
		output = serialPort.getOutputStream();
		try {
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
		} catch (TooManyListenersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Serial iniciada com sucesso!!");
	}
	
	public SerialPort getSerialPort() {
		return this.serialPort;
	}
	
	private synchronized String leituraSerial() throws IOException {
		return this.imput.readLine();
	}
	
	public synchronized void enviaDados(char c) throws IOException {
		this.output.write(c);
	}
	
	public void desligaLed() throws IOException {
		this.enviaDados('2');
	}
	public void ligaLed() throws IOException {
		this.enviaDados('1');
	}
	
	public void close() {
		if (serialPort != null) {
			serialPort.close();
		}
	}
	

	@Override
	public void serialEvent(SerialPortEvent arg0) {
		if(arg0.getEventType() == SerialPortEvent.DATA_AVAILABLE){
			try {
				acaoSerialEventListener.acaoSerialListener(this.leituraSerial());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
