package View;
import java.sql.Connection;
 import java.sql.DriverManager;
public class Connect_SQL {
	
	 private static Connection conn = null;
	 
	      public static Connection getCon() {
	         try {
	             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //�������ݿ���������
	             String user = "sa";
	             String psw = "123";  //XXXΪ�Լ������ݿ������
	             String url = "jdbc:sqlserver://localhost:1433;DatabaseName=ͼ�����ϵͳ";       
	            conn = DriverManager.getConnection(url, user, psw);  //��ȡ����
	         } catch (Exception e) {
	             System.out.println("�������ݿ�ʧ��");
	             e.printStackTrace();
	        }
	         return conn;
	       }
}
