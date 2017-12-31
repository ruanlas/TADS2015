import java.io.IOException;
import java.util.Scanner;
import java.util.TooManyListenersException;

import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class Teste implements SerialPortEventListener{
	ComunicacaoSerial com = new ComunicacaoSerial();
	SerialPort serial;
	
	public Teste() {
		try {
			serial = com.getSerialPort();
			serial.addEventListener(this);
			serial.notifyOnDataAvailable(true);
		} catch (TooManyListenersException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Teste teste = new Teste();

//		Scanner scan = new Scanner(System.in);
//		char menu = '0';
//		while (menu != 's') {
//			menu = scan.nextLine().charAt(0);
//			
//			try {
//				com.enviaDados(menu);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		com.close();
//		
	}

	@Override
	public void serialEvent(SerialPortEvent arg0) {

		if (arg0.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				String a = com.recebeDados();
				System.out.println(a);
				int x = Integer.parseInt(a);
				if(x == 0){
					com.enviaDados('1');
				}else {
					com.enviaDados('2');
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
