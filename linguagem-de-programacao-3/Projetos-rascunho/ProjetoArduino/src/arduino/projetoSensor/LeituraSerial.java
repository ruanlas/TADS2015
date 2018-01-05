package arduino.projetoSensor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class LeituraSerial extends ControleSerial implements SerialPortEventListener{
	private SerialPort portaSerial; //A porta que normalmente utilizamos
	private BufferedReader input; //Será alimentada por um InputStreamReader, convertendo os bytes em caracteres
	private OutputStream serialOut;
	private final int time_out = 2000;
	
	public LeituraSerial(String nomePorta, int taxaDados) {
		super(nomePorta, taxaDados);
		this.inicializacao();
	}
	public BufferedReader getImput() {
		return input;
	}
	
	private void inicializacao(){
		//Define uma variável portId do tipo CommPortIdentifier para realizar a comunicação serial
		CommPortIdentifier portaId = null;
		try {
			//Verifica se o nome da porta informada existe
			portaId = CommPortIdentifier.getPortIdentifier(this.getNomePorta());
		} catch (NoSuchPortException e) {
			//caso a porta nao exista
			System.out.println("Erro: "+ e);
			return;
		}
		
		try {
			//abre a porta serial e usa o nome da classe para o appName
			portaSerial = (SerialPort)portaId.open(this.getClass().getName(), time_out);
			//parâmetros da porta serial
			portaSerial.setSerialPortParams(this.getTaxaDados(), SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			//abertura de fluxos (Stream)
			input = new BufferedReader(new InputStreamReader(portaSerial.getInputStream()));
			//output
			serialOut = portaSerial.getOutputStream();
			
			//adição eventos Listeners
			portaSerial.addEventListener(this);//outra opção para solucionar seria a implementação da interface listener
			portaSerial.notifyOnDataAvailable(true);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.toString());
		}
		
	}
	public synchronized void close() {
		if(portaSerial != null){
			portaSerial.removeEventListener();
			portaSerial.close();
		}
	}
	@Override
	public void serialEvent(SerialPortEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
