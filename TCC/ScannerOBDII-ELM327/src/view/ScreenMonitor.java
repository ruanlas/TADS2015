package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ScreenMonitor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenMonitor window = new ScreenMonitor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenMonitor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.setBounds(100, 100, 308, 221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScannerObdii = new JLabel("Scanner OBDII");
		lblScannerObdii.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblScannerObdii.setBounds(94, 0, 100, 20);
		frame.getContentPane().add(lblScannerObdii);
		
		JLabel lblSelecionarDispositivo = new JLabel("Selecionar Dispositivo:");
		lblSelecionarDispositivo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSelecionarDispositivo.setBounds(10, 21, 111, 14);
		frame.getContentPane().add(lblSelecionarDispositivo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(125, 18, 157, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnAtualizarConexo = new JButton("Atualizar Conex\u00E3o");
		btnAtualizarConexo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAtualizarConexo.setBounds(10, 44, 129, 23);
		frame.getContentPane().add(btnAtualizarConexo);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnConectar.setBounds(149, 44, 133, 23);
		frame.getContentPane().add(btnConectar);
		
		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblStatus.setBounds(10, 70, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		JButton btnRealizarLeitura = new JButton("Realizar Leitura");
		btnRealizarLeitura.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnRealizarLeitura.setBounds(81, 148, 123, 23);
		frame.getContentPane().add(btnRealizarLeitura);
		
		JLabel lblRpm = new JLabel("RPM:");
		lblRpm.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRpm.setBounds(10, 100, 123, 14);
		frame.getContentPane().add(lblRpm);
		
		JLabel lblTipoCumbustivel = new JLabel("Tipo Cumbustivel:");
		lblTipoCumbustivel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipoCumbustivel.setBounds(10, 85, 184, 14);
		frame.getContentPane().add(lblTipoCumbustivel);
		
		JLabel lblPressoMotor = new JLabel("Press\u00E3o Motor:");
		lblPressoMotor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPressoMotor.setBounds(10, 115, 129, 14);
		frame.getContentPane().add(lblPressoMotor);
		
		JLabel lblVelocidade = new JLabel("Velocidade:");
		lblVelocidade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblVelocidade.setBounds(10, 132, 129, 14);
		frame.getContentPane().add(lblVelocidade);
	}
}
