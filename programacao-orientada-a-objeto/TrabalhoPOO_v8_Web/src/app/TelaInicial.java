package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import exceptions.PortNotFoundException;
import gnu.io.PortInUseException;
import gnu.io.UnsupportedCommOperationException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import others.SaidaCronometroEmJLabelEPortaCom;
import others.Cronometro;
import others.MostrarStatusLedNoLabel;
import serialport.ComunicacaoSerial;

import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dialog;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
	
	private SaidaAplicativo saida;
	
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
		saida = new SaidaAplicativo();

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
		
		lblTempoQueO = new JLabel("Tempo que o Led ficar\u00E1 aceso (em segundos):\r\n");
		lblTempoQueO.setToolTipText("");
		lblTempoQueO.setFont(new Font("Courier New", Font.BOLD, 17));
		lblTempoQueO.setBounds(64, 144, 430, 40);
		getContentPane().add(lblTempoQueO);
		
		txtTempMax = new JTextField();
		txtTempMax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyChar()== '\n'){
					saida.ligarLed(txtTempMax, lblCronometro);
					txtTempMax.setText(null);
				}
			}
		});
		txtTempMax.setFont(new Font("Courier New", Font.PLAIN, 17));
		txtTempMax.setBounds(168, 183, 202, 32);
		getContentPane().add(txtTempMax);
		txtTempMax.setColumns(10);
		
		btnLigarLed = new JButton("Ligar LED");
		btnLigarLed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saida.ligarLed(txtTempMax, lblCronometro);
				txtTempMax.setText(null);
			}
		});
		btnLigarLed.setFont(new Font("Courier New", Font.BOLD, 17));
		btnLigarLed.setBounds(50, 245, 147, 51);
		getContentPane().add(btnLigarLed);
		
		btnAtualizarPorta = new JButton("Atualizar Porta");
		btnAtualizarPorta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saida.atualizar(lblStatusLed);
				txtTempMax.setText(null);
			}
		});
		btnAtualizarPorta.setFont(new Font("Courier New", Font.BOLD, 17));
		btnAtualizarPorta.setBounds(242, 245, 248, 51);
		getContentPane().add(btnAtualizarPorta);
		getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, getContentPane()}));
		
		saida.inicializar(lblStatusLed);
	}
	
}
