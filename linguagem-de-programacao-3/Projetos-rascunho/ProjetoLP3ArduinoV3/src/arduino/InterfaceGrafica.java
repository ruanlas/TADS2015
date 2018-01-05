package arduino;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import gnu.io.CommPortIdentifier; 
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent; 
import gnu.io.SerialPortEventListener; 

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class InterfaceGrafica{
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGrafica window = new InterfaceGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//	public synchronized void serialEvent(SerialPortEvent oEvent) {
//		Scanner in = new Scanner(System.in);
//		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
//			try {
//				
//				if(temperatura > 27){
//					enviaDados('a');
//				}else{
//					enviaDados('b');
//				}
//				
//				String temp;
//				temp = input.readLine();
//				temperatura = Float.parseFloat(temp);
//				System.out.println(temperatura);
////				int i = in.nextInt();
////				if(i==1)
////					output.write('1');
//////					enviaDados('1');
//////				output.write(in.nextInt());
//			} catch (Exception e) {
//				System.err.println(e.toString());
//			}
//		}
//		// Ignore all the other eventTypes, but you should consider the other ones.
//	}

	/**
	 * Create the application.
	 */
	public InterfaceGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LeituraSerial main = new LeituraSerial();
		main.initializar();
		Thread t=new Thread() {
			public void run() {
				//the following line will keep this app alive for 1000 seconds,
				//waiting for events to occur and responding to them (printing incoming messages to console).
				try {Thread.sleep(1000000);} catch (InterruptedException ie) {}
			}
		};
		t.start();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTemp = new JLabel("New label");
//		float x = main.temp();
		lblTemp.setText(LeituraSerial.temperaturaString);
		frame.getContentPane().add(lblTemp, BorderLayout.CENTER);
		
	}

}
