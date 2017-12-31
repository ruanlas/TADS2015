package app;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import others.Cronometro;
import others.SaidaCronometroEmJLabelEPortaCom;
import serialport.ComunicacaoSerial;
import serialport.MostrarStatusLedNoLabel;

public class SaidaAplicativo {
	private ComunicacaoSerial com;
	
	public void	inicializar(JLabel lblStatusLed) {
		try {
			this.com = new ComunicacaoSerial("COM3", new MostrarStatusLedNoLabel(lblStatusLed));
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
	
	public void atualizar(JLabel lblStatusLed) {
		this.com.close();
		this.inicializar(lblStatusLed);
	}
	public void ligarLed(JTextField txtTempMax, JLabel lblCronometro) {
		int tempo = 0;
		try {
			tempo = Integer.parseInt(txtTempMax.getText());
//			com.enviaDados('1');
			com.ligaLed();
			Cronometro cronometro = new Cronometro(tempo, new SaidaCronometroEmJLabelEPortaCom(com, lblCronometro));
			//Cronometro cronometro = new Cronometro(tempo, new MinhasAcoes());
			cronometro.start();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"Por favor, \nPressione um número válido");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
