package studentInfoSystem;


import java.awt.BorderLayout;
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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;
    private final String usernameDefaultText = "   Username";
    private final String passwordDefaultText = "   Password";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
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
		
		JLabel lblNewLabel_3 = new JLabel("University of Science and Technology of Southern Philippines");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(77, 7, 542, 38);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\bluecrop.JPG"));
		lblNewLabel.setBounds(66, 0, 882, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\gated.JPG"));
		lblNewLabel_2.setBounds(0, -57, 948, 764);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\origOrange.JPG"));
		lblNewLabel_4.setBounds(947, 0, 393, 57);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\USTPortal.JPG"));
		lblNewLabel_5.setBounds(1037, 100, 212, 95);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\humanIcon.JPG"));
		lblNewLabel_6.setBounds(998, 294, 31, 30);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Janith\\Desktop\\FDS\\PICS\\lockIcon.JPG"));
		lblNewLabel_7.setBounds(998, 373, 31, 30);
		contentPane.add(lblNewLabel_7);
		
		txtUsername = new JTextField("");
		txtUsername.setToolTipText("Username");
        txtUsername.setDropMode(DropMode.INSERT);
        txtUsername.setBackground(SystemColor.controlHighlight);
        txtUsername.setBounds(1032, 294, 253, 30);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);
        txtUsername.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
		
        passwordField = new JPasswordField();
        passwordField.setToolTipText("Password");
        passwordField.setBackground(SystemColor.controlHighlight);
        passwordField.setBounds(1032, 373, 253, 30);
        contentPane.add(passwordField);
        passwordField.setBorder(new LineBorder(SystemColor.activeCaptionBorder));
        
        addFocusListenerToDefaultTextField(txtUsername, usernameDefaultText);
        addFocusListenerToPasswordField(passwordField, passwordDefaultText);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
        btnLogin.setForeground(new Color(255, 165, 0));
        btnLogin.setBackground(new Color(0, 0, 139));
        btnLogin.setBounds(1034, 534, 215, 47);
        contentPane.add(btnLogin);
        btnLogin.setFocusPainted(false);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setIcon(null);
        lblNewLabel_8.setBounds(988, 288, 309, 47);
        contentPane.add(lblNewLabel_8);
        lblNewLabel_8.setOpaque(true);
        lblNewLabel_8.setBackground(SystemColor.controlHighlight);
        lblNewLabel_8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        JLabel lblNewLabel_8_1 = new JLabel("");
        lblNewLabel_8_1.setIcon(null);
        lblNewLabel_8_1.setBounds(988, 366, 309, 47);
        contentPane.add(lblNewLabel_8_1);
        lblNewLabel_8_1.setOpaque(true);
        lblNewLabel_8_1.setBackground(SystemColor.controlHighlight);
        lblNewLabel_8_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Username");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
        chckbxNewCheckBox.setBackground(SystemColor.control);
        chckbxNewCheckBox.setBounds(985, 420, 151, 30);
        contentPane.add(chckbxNewCheckBox);
        
        JButton btnForgotPassword = new JButton("<html><u>Forgot Password?</u></html>");
        btnForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnForgotPassword.setBackground(SystemColor.control);
        btnForgotPassword.setBorder(BorderFactory.createEmptyBorder());
        btnForgotPassword.setBounds(1178, 420, 145, 30);
        contentPane.add(btnForgotPassword);
        btnLogin.setFocusPainted(false);
        
        JLabel lblNewLabel_9 = new JLabel("University of Science and Technology Portal");
        lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_9.setForeground(new Color(0, 0, 139));
        lblNewLabel_9.setBounds(1001, 165, 309, 30);
        contentPane.add(lblNewLabel_9);
        
        JLabel lblContainer = new JLabel("");
        lblContainer.setBounds(958, 248, 365, 398);
        contentPane.add(lblContainer);
        lblContainer.setOpaque(true);
        lblContainer.setBackground(SystemColor.control);


	}
	
	private void addFocusListenerToDefaultTextField(JTextField textField, String defaultText) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(defaultText)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(defaultText);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    }

    private void addFocusListenerToPasswordField(JPasswordField passwordField, String defaultText) {
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals(defaultText)) {
                    passwordField.setText("");
                    passwordField.setEchoChar('*');
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setText(defaultText);
                    passwordField.setEchoChar((char) 0);
                    passwordField.setForeground(Color.GRAY);
                }
            }
        });
    }
}
