package Windows;

import java.awt.EventQueue;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Checkbox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

public class Book_insert extends JFrame {

	/**
	 * Create the application.
	 */
	public Book_insert() {
		super("Õº ÈÃÌº”");
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		JLabel label = new JLabel("\u56FE\u4E66\u540D\u5B57\uFF1A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(35, 78, 71, 15);
		getContentPane().add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setColumns(10);
		textArea.setBounds(114, 74, 83, 24);
		getContentPane().add(textArea);
		
		JLabel label_1 = new JLabel("\u56FE\u4E66\u4F5C\u8005\uFF1A");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(35, 122, 71, 15);
		getContentPane().add(label_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setColumns(10);
		textArea_1.setBounds(114, 118, 83, 24);
		getContentPane().add(textArea_1);
		
		JLabel label_2 = new JLabel("\u56FE\u4E66\u4EF7\u683C\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(35, 163, 71, 15);
		getContentPane().add(label_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setColumns(10);
		textArea_2.setBounds(114, 159, 83, 24);
		getContentPane().add(textArea_2);
		
		JLabel lblIsbn = new JLabel("\u4E66\u53F7\uFF08ISBN\uFF09\uFF1A");
		lblIsbn.setHorizontalAlignment(SwingConstants.CENTER);
		lblIsbn.setBounds(10, 36, 96, 15);
		getContentPane().add(lblIsbn);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setColumns(10);
		textArea_3.setBounds(114, 32, 83, 24);
		getContentPane().add(textArea_3);
		
		JLabel label_3 = new JLabel("\u51FA\u7248\u793E\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(47, 201, 59, 15);
		getContentPane().add(label_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setColumns(10);
		textArea_4.setBounds(114, 197, 83, 24);
		getContentPane().add(textArea_4);
		
		JLabel label_4 = new JLabel("\u5185\u5BB9\u7B80\u4ECB\uFF0850\u5B57\u5185\uFF09\uFF1A");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(219, 36, 146, 15);
		getContentPane().add(label_4);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setBounds(231, 197, 84, 23);
		getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.setBounds(332, 197, 77, 23);
		getContentPane().add(btnNewButton);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setRows(8);
		textArea_5.setBounds(227, 74, 161, 104);
		getContentPane().add(textArea_5);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);;
		} 
		 });
	}
}
