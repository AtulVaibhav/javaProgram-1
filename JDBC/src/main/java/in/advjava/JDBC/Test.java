package in.advjava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

class ConnectionUtil {
	// db url
	private static final String url = "jdbc:mysql://localhost:3306/jdbc";

	// username
	private static final String username = "root";

	// password
	private static final String password = "root";

	private static Connection con = null;

	public static Connection getConnection() {
		try {
			if (con == null) {
				// Getting Driver class for mysql
				Class.forName("com.mysql.cj.jdbc.Driver");

				con = DriverManager.getConnection(url, username, password);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

public class Test {

	public static void main(String[] args) {
		System.out.println(ConnectionUtil.getConnection());
	}

}
