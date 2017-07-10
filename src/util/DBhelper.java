package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBhelper {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/payingguest","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
