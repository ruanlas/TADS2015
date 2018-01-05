package arduino.projetoSensor;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class Start implements SerialPortEventListener {
	static LeituraSerial lerSerial;// = new LeituraSerial("COM3", 9600);
	static EscritaSerial escreverSerial;// = new EscritaSerial("COM3", 9600);
	static private String leituraDados;
	
	@Override
	public void serialEvent(SerialPortEvent arg0) {
		if (arg0.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				leituraDados=lerSerial.getImput().readLine();
				System.out.println(leituraDados);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		
	}
	
	public static void main(String[] args) {
		escreverSerial = new EscritaSerial("COM3", 9600);
		escreverSerial.enviarDados(1);
	}

	
}
