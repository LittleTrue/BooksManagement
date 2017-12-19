package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Book_borrow extends JFrame {
	private JTextField textField;

	/**
	 * Initialize the contents of the frame.
	 */
	public Book_borrow() {
		setTitle("Í¼Êé½è³ö");
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setLocation(1270,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 10, 387, 47);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u501F\u4E66\u4E66\u53F7\uFF08ISBN\uFF09\uFF1A");
		lblNewLabel.setBounds(10, 10, 156, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(176, 13, 156, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u770B");
		btnNewButton.setIcon(new ImageIcon(Book_borrow.class.getResource("/images/search.png")));
		btnNewButton.setBounds(313, 151, 93, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(21, 81, 387, 60);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\u501F\u51FA");
		btnNewButton_1.setIcon(new ImageIcon(Book_borrow.class.getResource("/images/about.png")));
		btnNewButton_1.setBounds(313, 184, 93, 23);
		getContentPane().add(btnNewButton_1);
		
	}
}
