package Windos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.io.*;
import javax.swing.*;

public class Login extends JFrame {
	//��¼����
	private JButton jb1=new JButton("��¼");
	private JButton jb2=new JButton("�˳�");
	private JPasswordField passwordTxt=new JPasswordField(20);
	private JTextField textField = new JTextField(20);
	
	public Login() {
		super("����Ա��¼");

		JPanel p1=new JPanel();
		JPanel p1_1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JLabel label1 = new JLabel("ͼ�����ϵͳ",JLabel.CENTER);
		label1.setFont(new Font("����", Font.BOLD, 25));
		label1.setIcon(new ImageIcon(Login.class.getResource("/images/login_logo1.png")));
		
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(p1,BorderLayout.NORTH);
		cp.add(p2,BorderLayout.CENTER);
		cp.add(p3,BorderLayout.SOUTH);
		p1.setLayout(new BorderLayout());
		p1.add(label1,BorderLayout.CENTER);
		p1.add(p1_1,BorderLayout.SOUTH);
		p1_1.setLayout(new FlowLayout());
		p1_1.add(new JLabel("��¼��:"));
		p1_1.add(textField);
		p2.setLayout(new FlowLayout());
		p2.add(new JLabel("��    ��:"));
		p2.add(passwordTxt);
		p3.setLayout(new FlowLayout());
		jb1.setIcon(new ImageIcon(Login.class.getResource("/images/login.png")));
	    p3.add(jb1);
	    jb2.setIcon(new ImageIcon(Login.class.getResource("/images/reset.png")));
		p3.add(jb2);
		
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								MainJF mjf= new MainJF();

							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					}

		});
		
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.exit(0);
		} 
		 });
		
		setSize(450,280);
		setVisible(true);
		setLocation(800,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String arg[]) {
		 Login jf=new Login();
	}
}
