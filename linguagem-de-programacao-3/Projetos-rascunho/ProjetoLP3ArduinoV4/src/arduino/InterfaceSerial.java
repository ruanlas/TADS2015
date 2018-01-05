package arduino;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Scanner;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;

public class InterfaceSerial extends JFrame implements SerialPortEventListener{

	private JPanel contentPane;
	JLabel lblTemp;
	JSpinner spnTempMax;
////////////////////////////////////////////
	float temp;
	float tempMax = 25;
	SerialPort serialPort;
        /** The port we're normally going to use. */
	private static final String PORT_NAMES[] = { 
			"/dev/tty.usbserial-A9007UX1", // Mac OS X
                        "/dev/ttyACM0", // Raspberry Pi
			"/dev/ttyUSB0", // Linux
			"COM3", // Windows
	};
	/**
	* A BufferedReader which will be fed by a InputStreamReader 
	* converting the bytes into characters 
	* making the displayed results codepage independent
	*/
	private BufferedReader input;
	/** The output stream to the port */
	private OutputStream output;
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 2000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 9600;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblTemLimite;

	public void initialize() {
                // the next line is for Raspberry Pi and 
                // gets us into the while loop and was suggested here was suggested http://www.raspberrypi.org/phpBB3/viewtopic.php?f=81&t=32186
                //System.setProperty("gnu.io.rxtx.SerialPorts", "/dev/ttyACM0");

		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		//First, Find an instance of serial port as set in PORT_NAMES.
		while (portEnum.hasMoreElements()) {
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for (String portName : PORT_NAMES) {
				if (currPortId.getName().equals(portName)) {
					portId = currPortId;
					break;
				}
			}
		}
		if (portId == null) {
			System.out.println("Could not find COM port.");
			return;
		}

		try {
			// open serial port, and use class name for the appName.
			serialPort = (SerialPort) portId.open(this.getClass().getName(),
					TIME_OUT);

			// set port parameters
			serialPort.setSerialPortParams(DATA_RATE,
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);

			// open the streams
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();

			// add event listeners
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	/**
	 * This should be called when you stop using the port.
	 * This will prevent port locking on platforms like Linux.
	 */
	public synchronized void close() {
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
		}
	}

	/**
	 * Handle an event on the serial port. Read the data and print it.
	 */
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		Scanner in = new Scanner(System.in);
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				
				if(temp > tempMax){
					enviaDados('a');
				}else{
					enviaDados('b');
				}
				
				String temperatura;
				
				temperatura = input.readLine();
				temp = Float.parseFloat(temperatura);
				lblTemp.setText("Temperatura: " + temperatura+"°C");
				System.out.println(temp);
//				int i = in.nextInt();
//				if(i==1)
//					output.write('1');
////					enviaDados('1');
////				output.write(in.nextInt());
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		// Ignore all the other eventTypes, but you should consider the other ones.
	}
	public synchronized void enviaDados(char c) {
		try {
			output.write(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	////////////////////////////////////////////////
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceSerial frame = new InterfaceSerial();
					frame.setVisible(true);
					frame.initialize();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceSerial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	 	lblTemp = new JLabel("New label");
		lblTemp.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTemp.setText(String.valueOf(temp));
		
		JPanel panel = new JPanel();
		
		lblTemLimite = new JLabel("New label");
		lblTemLimite.setForeground(Color.RED);
		lblTemLimite.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTemLimite.setText("Temperatura Limite: " + String.valueOf(tempMax) + "°C");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(39))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(74)
					.addComponent(lblTemp, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(66, Short.MAX_VALUE)
					.addComponent(lblTemLimite, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addGap(59))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblTemp, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblTemLimite)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		btnNewButton = new JButton("Aplicar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tempMax = (float)spnTempMax.getValue();
//				lblNewLabel.setText(String.valueOf(tempMax));
				lblTemLimite.setText("Temperatura Limite: " + String.valueOf(tempMax) + "°C");
			}
		});
		
		spnTempMax = new JSpinner();
		spnTempMax.setModel(new SpinnerNumberModel(new Float(tempMax), null, null, new Float(1)));
		
		lblNewLabel = new JLabel("Selecione a temperatura m\u00E1xima");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(85)
							.addComponent(spnTempMax, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(spnTempMax, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
