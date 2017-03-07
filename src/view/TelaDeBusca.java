package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaDeBusca extends JFrame {

	private JPanel contentPane;
	private JTextField txtBusca;
	private JButton btnBusca;
	private JButton btnOk;
	private JButton btnCancela;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeBusca frame = new TelaDeBusca();
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
	public TelaDeBusca() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBusca = new JTextField();
		txtBusca.setBounds(150, 37, 251, 20);
		contentPane.add(txtBusca);
		txtBusca.setColumns(10);
		
		JButton btnBusca = new JButton("Busca");
		btnBusca.setBounds(312, 89, 89, 23);
		contentPane.add(btnBusca);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(166, 89, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnCancela = new JButton("Cancela");
		btnCancela.setBounds(20, 89, 89, 23);
		contentPane.add(btnCancela);
		
		JLabel lblDigiteAlgoPara = new JLabel("Digite algo para busca");
		lblDigiteAlgoPara.setBounds(20, 40, 120, 14);
		contentPane.add(lblDigiteAlgoPara);
	}

}
