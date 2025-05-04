package Model;
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/OnlineFoodOrderingSystem";
	private static String user = "root";
	private static String password = "";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			
			System.out.println("Database Connection Failed");
			
		}
		return con;
	}
	

}
