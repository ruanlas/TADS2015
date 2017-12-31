package serialport;
import java.io.IOException;
import java.util.TooManyListenersException;

import javax.swing.JLabel;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ObterDadosSerial implements SerialPortEventListener{
	private ComunicacaoSerial com;
	private SerialPort serial;
	private JLabel lblStatusLed;
	
	public ObterDadosSerial(ComunicacaoSerial com, JLabel lblStatusLed) {
		this.com = com;
		this.serial = com.getSerialPort();
		try {
			serial.addEventListener(this);
			serial.notifyOnDataAvailable(true);
		} catch (TooManyListenersException e) {
			e.printStackTrace();
		}
		this.lblStatusLed = lblStatusLed;
	}
	
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
				lblStatusLed.setText(com.recebeDados());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
