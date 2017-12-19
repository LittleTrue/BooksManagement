package Windos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Book_require extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public Book_require() {
		setTitle("Í¼Êé²éÑ¯");
		setVisible(true);
		setBounds(100, 100, 450, 501);
		setLocation(1270,400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(22, 30, 385, 73);
		getContentPane().add(panel);
		
		JLabel label = new JLabel("\u4E66\u540D\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label.setBounds(10, 27, 95, 15);
		panel.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(101, 24, 125, 21);
		panel.add(textField);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setIcon(new ImageIcon(Book_require.class.getResource("/images/search.png")));
		button.setBounds(268, 23, 93, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(21, 144, 388, 83);
		getContentPane().add(panel_1);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_1.setBounds(10, 37, 95, 15);
		panel_1.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 34, 125, 21);
		panel_1.add(textField_1);
		
		JButton button_1 = new JButton("\u67E5\u8BE2");
		button_1.setIcon(new ImageIcon(Book_require.class.getResource("/images/search.png")));
		button_1.setBounds(269, 33, 93, 23);
		panel_1.add(button_1);
		
		JLabel label_2 = new JLabel("\u6309\u4E66\u540D\u67E5\u8BE2");
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_2.setBounds(21, 10, 143, 15);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u6309\u4F5C\u8005\u67E5\u8BE2");
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_3.setBounds(21, 124, 143, 15);
		getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(22, 360, 385, 73);
		getContentPane().add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(23, 270, 385, 73);
		getContentPane().add(panel_2);
		
		JLabel label_4 = new JLabel("\u7C7B\u522B\uFF1A");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_4.setBounds(10, 27, 95, 15);
		panel_2.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 24, 125, 21);
		panel_2.add(textField_2);
		
		JButton button_2 = new JButton("\u67E5\u8BE2");
		button_2.setBounds(268, 23, 93, 23);
		panel_2.add(button_2);
		
		JLabel label_5 = new JLabel("\u6309\u5206\u7C7B\u67E5\u8BE2");
		label_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_5.setBounds(22, 250, 143, 15);
		getContentPane().add(label_5);
		
	}
}
