package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCheckIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCheckIn frame = new TelaCheckIn();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public TelaCheckIn() {
		setTitle("Tela Efetuar Check-In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1448, 990);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Efetuar Check-In");
		lblNewLabel.setBounds(821, 213, 293, 36);
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 36));
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(1001, 482, 153, 23);
		textField.setForeground(new Color(0, 0, 0));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número da Reserva : ");
		lblNewLabel_1.setBounds(789, 483, 202, 14);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Hóspede(s) : ");
		lblNewLabel_2.setBounds(789, 549, 191, 20);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Confimar Check-In");
		btnNewButton.setBounds(903, 702, 191, 33);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(1001, 551, 153, 23);
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(721, 281, 433, 100);
		lblNewLabel_3.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/LogoHotel.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_4.setBounds(-615, 505, 1376, 435);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TelaCheckIn.class.getResource("/Imagens/Icon.png")));
		lblNewLabel_5.setBounds(663, -38, 1175, 463);
		contentPane.add(lblNewLabel_5);
	}
}
