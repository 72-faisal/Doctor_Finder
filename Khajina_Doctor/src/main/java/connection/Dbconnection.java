package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static Connection getconnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dockhajina", "root", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
