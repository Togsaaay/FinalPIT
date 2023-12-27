package studentInfoSystem;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

public class StudentPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPage frame = new StudentPage();
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
	public StudentPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\logoCropped.JPG"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Student Information System");
		setSize(1349, 746);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\logoCropped.JPG"));
		lblNewLabel_1.setBounds(0, 0, 67, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\orangeCropped.JPG"));
		lblNewLabel_2.setBounds(989, 0, 344, 612);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("University of Science and Technology of Southern Philippines");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(77, 11, 596, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\bluecrop.JPG"));
		lblNewLabel.setBounds(66, 0, 1267, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\orangeCropped.JPG"));
		lblNewLabel_4.setBounds(989, 567, 344, 129);
		contentPane.add(lblNewLabel_4);
	}
}
