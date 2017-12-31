package serialport;
import java.util.Enumeration;

import gnu.io.CommPortIdentifier;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

//Classe que fará a conexão da porta serial.
public class SerialConnection {
	private static final int TIME_OUT = 2000;
	private static final int DATA_RATE = 9600;
	
	public static SerialPort getSerialPortConnection(String portName) throws PortInUseException, UnsupportedCommOperationException {
		SerialPort serialPort = null;
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier temp = (CommPortIdentifier) portEnum.nextElement();
			
			if (temp.getName().equals(portName)) {
				portId = temp;
				break;
			}
		}
		if (portId == null) {
			return null;
		}
		
		serialPort = (SerialPort)portId.open(portName, TIME_OUT);
		serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

		return serialPort;
	}
}
