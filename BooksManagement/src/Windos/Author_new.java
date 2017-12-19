package Windos;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Author_new extends JFrame{
	private JTextArea textArea ;
	private JTextArea textArea_1 ;
	private JTextArea textArea_2 ;
	private JTextArea textArea_4 ;
	/**
	 * Create the application.
	 */
	public Author_new() {
		setTitle("Í¼Êé×÷ÕßÐÂÔö");
		setVisible(true);
		setBounds(100, 100, 450, 300);
		setLocation(800,720);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u4F5C\u8005\u63CF\u8FF0\uFF1A");
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(203, 88, 96, 15);
		getContentPane().add(label);
		
		textArea = new JTextArea();
		textArea.setColumns(10);
		textArea.setBounds(108, 35, 83, 24);
		getContentPane().add(textArea);
		
		JLabel label_1 = new JLabel("\u4F5C\u8005\u63CF\u8FF0\uFF1A");
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 129, 96, 15);
		getContentPane().add(label_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setColumns(10);
		textArea_1.setBounds(309, 84, 83, 24);
		getContentPane().add(textArea_1);
		
		
		JButton button = new JButton("\u767B\u8BB0");
		button.setIcon(new ImageIcon(IDcard_new.class.getResource("/images/modify.png")));
		button.setBounds(171, 218, 84, 23);
		getContentPane().add(button);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setText("\u5173\u4E8E\u4F5C\u8005\uFF0C50\u5B57\u4EE5\u5185\u3002");
		textArea_2.setBounds(33, 155, 359, 53);
		getContentPane().add(textArea_2);
		
		JLabel label_2 = new JLabel("\u4F5C\u8005\u6027\u522B\uFF1A");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_2.setBounds(10, 88, 96, 15);
		getContentPane().add(label_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setColumns(10);
		textArea_3.setBounds(108, 84, 83, 24);
		getContentPane().add(textArea_3);
		
		JLabel label_3 = new JLabel("\u4F5C\u8005\u59D3\u540D\uFF1A");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 12));
		label_3.setBounds(10, 39, 96, 15);
		getContentPane().add(label_3);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
		} 
		 });
	}

}
