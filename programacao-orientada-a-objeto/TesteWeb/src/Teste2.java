import java.io.IOException;

import javax.swing.JButton;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import others.Cronometro;
import serialport.ComunicacaoSerial;

public class Teste2 {
	private ComunicacaoSerial com;
	public Teste2() {
		try {
			com = new ComunicacaoSerial("COM3");
		} catch (PortNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortInUseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void testeT(int tempo) {
		try {
			com.enviaDados('1');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Cronometro cro = new Cronometro(tempo, com);
//		cro.start();
	}
}
