package app;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import others.Cronometro;
import others.CronometroPisca;
import serialport.ComunicacaoSerial;
import serialport.ObterDadosSerial;

public class TelaInicial extends JFrame {
	private JTextField txtTempMax;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblStatusLed;
	private JLabel lblNewLabel_2;
	private JLabel lblCronometro;
	private JLabel lblTempoQueO;
	private JButton btnLigarLed;
	private JButton btnAtualizarPorta;
	private JButton piscaLed;
	
	private ComunicacaoSerial com;
	private ObterDadosSerial obtDado;
	private JTextField msText;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setTitle("Interruptor sincronizado com Thread");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		getContentPane().setEnabled(false);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 365);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Interruptor Sincronizado");
		lblNewLabel.setBounds(45, 11, 480, 40);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD, 34));
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Status do Led: ");
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 17));
		lblNewLabel_1.setBounds(55, 72, 157, 32);
		getContentPane().add(lblNewLabel_1);
		
		lblStatusLed = new JLabel("");
		lblStatusLed.setFont(new Font("Courier New", Font.PLAIN, 17));
		lblStatusLed.setBounds(206, 72, 126, 32);
		getContentPane().add(lblStatusLed);
		
		lblNewLabel_2 = new JLabel("Cron\u00F4metro: ");
		lblNewLabel_2.setFont(new Font("Courier New", Font.BOLD, 17));
		lblNewLabel_2.setBounds(54, 118, 120, 21);
		getContentPane().add(lblNewLabel_2);
		
		lblCronometro = new JLabel("...");
		lblCronometro.setFont(new Font("Courier New", Font.PLAIN, 17));
		lblCronometro.setBounds(168, 118, 101, 21);
		getContentPane().add(lblCronometro);
		
		lblTempoQueO = new JLabel("Tempo que o Led ficar\u00E1 aceso (em segundos)\nvezes que pisca/intervalo do piscada ms:\r\n");
		lblTempoQueO.setToolTipText("");
		lblTempoQueO.setFont(new Font("Courier New", Font.BOLD, 13));
		lblTempoQueO.setBounds(10, 144, 543, 40);
		getContentPane().add(lblTempoQueO);
		
		txtTempMax = new JTextField();
		txtTempMax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyChar()== '\n'){
					ligarLed();
					txtTempMax.setText(null);
				}
			}
		});
		txtTempMax.setFont(new Font("Courier New", Font.PLAIN, 17));
		txtTempMax.setBounds(55, 183, 202, 32);
		getContentPane().add(txtTempMax);
		txtTempMax.setColumns(10);
		
		btnLigarLed = new JButton("Ligar LED");
		btnLigarLed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ligarLed();
				txtTempMax.setText(null);
			}
		});
		btnLigarLed.setFont(new Font("Courier New", Font.BOLD, 17));
		btnLigarLed.setBounds(50, 245, 147, 51);
		getContentPane().add(btnLigarLed);
		
		btnAtualizarPorta = new JButton("Atualizar Porta");
		btnAtualizarPorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
				txtTempMax.setText(null);
			}
		});
		btnAtualizarPorta.setFont(new Font("Courier New", Font.BOLD, 17));
		btnAtualizarPorta.setBounds(242, 245, 248, 51);
		getContentPane().add(btnAtualizarPorta);
		
		msText = new JTextField();
		msText.setFont(new Font("Courier New", Font.PLAIN, 17));
		msText.setColumns(10);
		msText.setBounds(292, 183, 202, 32);
		getContentPane().add(msText);
		
		piscaLed = new JButton("Piscar LED");
		piscaLed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				piscaLed();
				txtTempMax.setText(null);
				msText.setText(null);
				
			}
		});
		piscaLed.setFont(new Font("Courier New", Font.BOLD, 17));
		piscaLed.setBounds(321, 62, 147, 51);
		getContentPane().add(piscaLed);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, getContentPane()}));
		inicializar();
	}
	private void inicializar() {
		try {
			this.com = new ComunicacaoSerial("COM3");
			this.obtDado = new ObterDadosSerial(com, lblStatusLed);
		} catch (PortNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PortInUseException e) {
			e.printStackTrace();
		} catch (UnsupportedCommOperationException e) {
			e.printStackTrace();
		}
	}
	private void atualizar() {
		this.com.close();
		this.inicializar();
	}
	
	private void ligarLed() {
		int tempo = 0;
		try {
			tempo = Integer.parseInt(txtTempMax.getText());
			com.enviaDados('1');
			//Cronometro cronometro = new Cronometro(tempo, com, lblCronometro);
			Cronometro cronometro = new Cronometro(tempo, com, lblCronometro);
			cronometro.start();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Por favor, \nPressione um n�mero v�lido");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void piscaLed(){
		int tempo = 0;
		
		try {
			tempo = Integer.parseInt(txtTempMax.getText());
			com.enviaDados('1');
			CronometroPisca cronometro = new CronometroPisca(tempo, com, lblCronometro, Integer.parseInt(msText.getText()));
			cronometro.start();
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Por favor, \nPressione um n�mero v�lido");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
