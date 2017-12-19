package Windos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Book_return extends JFrame{
	private JTextField textField;

	public Book_return() {
		setTitle("Õº ÈπÈªπ");
		setVisible(true);
		setBounds(100, 100, 450, 200);
		setLocation(1270,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(20, 21, 387, 47);
		getContentPane().add(panel);
		
		JLabel lblisbn = new JLabel("\u8BF7\u8F93\u5165\u8FD8\u4E66\u4E66\u53F7\uFF08ISBN\uFF09\uFF1A");
		lblisbn.setFont(new Font("Œ¢»Ì—≈∫⁄", Font.PLAIN, 12));
		lblisbn.setBounds(10, 10, 156, 27);
		panel.add(lblisbn);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(176, 13, 156, 21);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("\u5F52\u8FD8");
		btnNewButton.setIcon(new ImageIcon(Book_return.class.getResource("/images/reset.png")));
		btnNewButton.setBounds(314, 107, 93, 23);
		getContentPane().add(btnNewButton);
		
		
	}
}
