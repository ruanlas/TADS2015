import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEventListener;

public class ComunicacaoSerial {
	private SerialPort serialPort;
	private BufferedReader imput;
	private OutputStream output;
	private static final int TIME_OUT = 2000;
	private static final int DATA_RATE = 9600;
	private final String PORT_NAMES[] = {
			"/dev/tty.usbserial-A9007UX1", // Mac OS X
            "/dev/ttyACM0", // Raspberry Pi
            "/dev/ttyUSB0", // Linux
            "COM3", // Windows
	};
	
	public ComunicacaoSerial() {
		//inicializa a porta serial
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier portIdTemp = (CommPortIdentifier)portEnum.nextElement();
			for (String portName : PORT_NAMES) {
				if (portIdTemp.getName().equals(portName)) {
					portId = portIdTemp;
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Porta não encontrada!!");
			return;
		}
		
		try {
			serialPort = (SerialPort) portId.open(this.getClass().getName(), TIME_OUT);
			serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			
			imput = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();
			System.out.println("Serial iniciada com sucesso!!");
		} catch (Exception e) {
			
		}
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
			serialPort.removeEventListener();
			serialPort.close();
		}
	}
}
