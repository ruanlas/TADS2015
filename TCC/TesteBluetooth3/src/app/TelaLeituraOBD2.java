package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import device.DiscoveryDevices;
import utils.CarregarItemComboBox;
import utils.CarregarItemLabel;

import javax.swing.JComboBox;
import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;
import javax.microedition.io.Connector;
import javax.microedition.io.StreamConnection;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class TelaLeituraOBD2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JComboBox cBoxDevices;
	private JButton btnConectar;
	private JLabel lblStatus;
	private JLabel lblMedicao;
	private JButton btnRpm;
	private JButton btnAtualizar;
	private JButton btnPressaoMotor;
	private JButton btnOutrasMedicoes;
	private JButton btnVelocidade;
	
	
	int cont = 0;
	private DiscoveryDevices discovery;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLeituraOBD2 frame = new TelaLeituraOBD2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public TelaLeituraOBD2() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cBoxDevices = new JComboBox();
		cBoxDevices.setBounds(50, 63, 179, 20);
		contentPane.add(cBoxDevices);
		
		btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(this);
		btnConectar.setBounds(251, 62, 89, 23);
		contentPane.add(btnConectar);
		
		JLabel label1 = new JLabel("Comunica\u00E7\u00E3o OBDII");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label1.setBounds(139, 11, 136, 20);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("Status: ");
		label2.setBounds(50, 94, 46, 14);
		contentPane.add(label2);
		
		lblStatus = new JLabel("");
		lblStatus.setBounds(95, 94, 269, 14);
		contentPane.add(lblStatus);
		
		JLabel label3 = new JLabel("MEDI\u00C7\u00C3O");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label3.setBounds(182, 119, 62, 14);
		contentPane.add(label3);
		
		lblMedicao = new JLabel("");
		lblMedicao.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblMedicao.setBounds(95, 144, 123, 32);
		contentPane.add(lblMedicao);
		
		btnRpm = new JButton("RPM");
		btnRpm.addActionListener(this);
		btnRpm.setBounds(303, 132, 89, 23);
		contentPane.add(btnRpm);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(this);
		btnAtualizar.setBounds(350, 62, 89, 23);
		contentPane.add(btnAtualizar);
		discovery = new DiscoveryDevices();
		discovery.setComponentes(new CarregarItemComboBox(cBoxDevices), new CarregarItemLabel(lblStatus), new CarregarItemLabel(lblMedicao));
		
		btnPressaoMotor = new JButton("Press\u00E3o Motor");
		btnPressaoMotor.addActionListener(this);
		btnPressaoMotor.setBounds(298, 176, 143, 23);
		contentPane.add(btnPressaoMotor);
		
		btnOutrasMedicoes = new JButton("Outras Medi\u00E7\u00F5es");
		btnOutrasMedicoes.addActionListener(this);
		btnOutrasMedicoes.setBounds(95, 213, 163, 23);
		contentPane.add(btnOutrasMedicoes);
		
		btnVelocidade = new JButton("Velocidade");
		btnVelocidade.addActionListener(this);
		btnVelocidade.setBounds(275, 217, 163, 23);
		contentPane.add(btnVelocidade);
		discovery.run();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== btnRpm) {
			System.out.println("RPM");
			try {
				discovery.executeRPM();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btnAtualizar) {
			System.out.println("ATUALIZAR");
			cBoxDevices.removeAllItems();
//			cBoxDevices.addItem("Item" + ++cont);
			try {
				discovery.refreshList();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btnConectar) {
			System.out.println("CONECTAR");
			System.out.println(cBoxDevices.getSelectedIndex());
			int index = cBoxDevices.getSelectedIndex();
			try {
				discovery.connectToDevice(index);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btnPressaoMotor) {
			try {
				discovery.executeFuelPressure();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btnOutrasMedicoes) {
			try {
				discovery.outrasMedicoes();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btnVelocidade) {
			try {
				discovery.speed();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
