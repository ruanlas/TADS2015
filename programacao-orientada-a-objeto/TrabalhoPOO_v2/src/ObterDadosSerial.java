import java.io.IOException;
import java.util.TooManyListenersException;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class ObterDadosSerial implements SerialPortEventListener{
	private ComunicacaoSerial com;
	private SerialPort serial;
	
	public ObterDadosSerial(ComunicacaoSerial com) {
		this.com = com;
		this.serial = com.getSerialPort();
		try {
			serial.addEventListener(this);
			serial.notifyOnDataAvailable(true);
		} catch (TooManyListenersException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void serialEvent(SerialPortEvent arg0) {
		if(arg0.getEventType() == SerialPortEvent.DATA_AVAILABLE){
			try {
				System.out.println(com.recebeDados());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
