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
	private JButton btnAplicar;
	private JLabel lblNewLabel;
	private JLabel lblTemLimite;
////////////////////////////////////////////
	
	float temp; //Temperatura que ser� lida pelo arduino
	float tempMax = 25; //temperatura m�xima que far� com que o led seja ligado
	SerialPort serialPort;
        /** As portas que normalmente s�o utilizadas nos sistemas operacionais. */
	private static final String PORT_NAMES[] = { 
			"/dev/tty.usbserial-A9007UX1", // Mac OS X
                        "/dev/ttyACM0", // Raspberry Pi
			"/dev/ttyUSB0", // Linux
			"COM3", // Windows
	};
	/**
	* O objeto BufferedReader ser� instanciado mais adiante por um ImputStreamReader
	* que converter� os bytes recebidos pela serial em caracteres
	*/
	private BufferedReader input;
	/** The output stream to the port */
	private OutputStream output;
	/** Milliseconds to block while waiting for port open */
	private static final int TIME_OUT = 2000;
	/** Default bits per second for COM port. */
	private static final int DATA_RATE = 9600;
	private JButton btnAtualizar;
	private JButton btnFechar;

	public void initialize() {
                //M�todo que realiza a inicializa��o dos componentes 

		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

		//O trexo abaixo ir� encontrar uma inst�ncia de porta serial, conforme especificado no vetor PORT_NAMES[]
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
			// Abre a porta serial e usa o nome da classe para o appName
			serialPort = (SerialPort) portId.open(this.getClass().getName(),
					TIME_OUT);

			// Passa os par�metros para a porta
			serialPort.setSerialPortParams(DATA_RATE,
					SerialPort.DATABITS_8,
					SerialPort.STOPBITS_1,
					SerialPort.PARITY_NONE);

			// Inicializa o objeto imput alimentando-o com um InputStreamReader conforme comentado no inicio
			//InputSteamReader = Leitor de entrada de fluxos
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();

			// Adicionando o evento Listener para ficar "monitorando" a serial
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}


	public synchronized void close() {
		//Este m�todo ir� parar de utilizar a porta serial
		if (serialPort != null) {
			serialPort.removeEventListener();
			serialPort.close();
		}
	}


	public synchronized void serialEvent(SerialPortEvent oEvent) {
		//m�todo que ir� lidar com os enentos da porta serial
		if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
			try {
				//Controle da temperatura
				if(temp > tempMax){
					enviaDados('a');
				}else{
					enviaDados('b');
				}
				
				String temperatura;
				//Leitura dos dados vindos da serial
				temperatura = input.readLine();
				temp = Float.parseFloat(temperatura);
				//Exibe os valores que a serial est� enviando no label
				lblTemp.setText("Temperatura: " + temperatura+"�C");
				System.out.println(temp);
			} catch (Exception e) {
				System.err.println(e.toString());
			}
		}
		
	}
	public synchronized void enviaDados(char c) {
		//M�todo que faz o envio de dados para a serial
		try {
			output.write(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public synchronized void atualizar(){
		//m�todo que faz a atualiza��o dos dados
		this.close();
		this.initialize();
	}
	
	////////////////////////////////////////////////

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
	 * Cria��o da interface
	 */
	public InterfaceSerial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 320);
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
		lblTemLimite.setText("Temperatura Limite: " + String.valueOf(tempMax) + "�C");
		
		btnAtualizar = new JButton("Atualizar Porta");
		btnAtualizar.addActionListener(new ActionListener() {
			//Evento do bot�o atualizar
			public void actionPerformed(ActionEvent arg0) {
				atualizar();
			}
		});
		
		btnFechar = new JButton("Fechar Porta");
		btnFechar.addActionListener(new ActionListener() {
			//evento do bot�o fechar
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(85, Short.MAX_VALUE)
					.addComponent(lblTemp, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
					.addGap(77))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(67, Short.MAX_VALUE)
					.addComponent(lblTemLimite, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnAtualizar, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnFechar, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
					.addGap(37))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTemp, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTemLimite)
					.addGap(26)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFechar, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addComponent(btnAtualizar, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
					.addGap(7))
		);
		
		btnAplicar = new JButton("Aplicar");
		btnAplicar.addActionListener(new ActionListener() {
			//Evento do click do bot�o 
			public void actionPerformed(ActionEvent arg0) {
				tempMax = (float)spnTempMax.getValue(); //ir� dar um set na vari�vel tempMax com o valor escolhido no spinner
				lblTemLimite.setText("Temperatura Limite: " + String.valueOf(tempMax) + "�C"); //ir� mostrar no label a temperatura limite da vari�vel tempMax
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
							.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(spnTempMax, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAplicar, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
