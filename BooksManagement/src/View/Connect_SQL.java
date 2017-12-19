package View;
import java.sql.Connection;
 import java.sql.DriverManager;
public class Connect_SQL {
	
	 private static Connection conn = null;
	 
	      public static Connection getCon() {
	         try {
	             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //加载数据库连接驱动
	             String user = "sa";
	             String psw = "123";  //XXX为自己的数据库的密码
	             String url = "jdbc:sqlserver://localhost:1433;DatabaseName=图书管理系统";       
	            conn = DriverManager.getConnection(url, user, psw);  //获取连接
	         } catch (Exception e) {
	             System.out.println("连接数据库失败");
	             e.printStackTrace();
	        }
	         return conn;
	       }
}
