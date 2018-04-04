package Pack;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class premiere {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					premiere window = new premiere();
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
	public premiere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 723, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnLancer = new JButton("Lancer");
		btnLancer.setBounds(58, 164, 89, 23);
		frame.getContentPane().add(btnLancer);

		JButton btnLancer_1 = new JButton("Lancer");
		btnLancer_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLancer_1.setBounds(551, 164, 89, 23);
		frame.getContentPane().add(btnLancer_1);

		JButton btnRestart = new JButton("Restart");
		btnRestart.setBounds(317, 312, 89, 23);
		frame.getContentPane().add(btnRestart);

		JList list = new JList();
		list.setBounds(148, 149, 51, -48);
		frame.getContentPane().add(list);

		textField = new JTextField();
		textField.setBounds(221, 146, 109, 106);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(374, 146, 109, 106);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(576, 81, 35, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(93, 81, 35, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);

		JLabel lblScore = new JLabel("  score 1:");
		lblScore.setBounds(25, 87, 46, 14);
		frame.getContentPane().add(lblScore);

		JLabel lblScore_1 = new JLabel("score2 :");
		lblScore_1.setBounds(509, 87, 46, 14);
		frame.getContentPane().add(lblScore_1);

		JLabel lblJoueur = new JLabel("Joueur 1");
		lblJoueur.setBounds(25, 38, 46, 14);
		frame.getContentPane().add(lblJoueur);

		JLabel lblJoueur_1 = new JLabel("Joueur 2");
		lblJoueur_1.setBounds(581, 38, 46, 14);
		frame.getContentPane().add(lblJoueur_1);

		JLabel lblDe = new JLabel("DE1");
		lblDe.setBounds(241, 120, 35, 14);
		frame.getContentPane().add(lblDe);

		JLabel lblDe_1 = new JLabel("DE2");
		lblDe_1.setBounds(401, 120, 27, 14);
		frame.getContentPane().add(lblDe_1);

		JLabel lblTour = new JLabel("Tour 3");
		lblTour.setBounds(315, 21, 46, 14);
		frame.getContentPane().add(lblTour);
	}
}
