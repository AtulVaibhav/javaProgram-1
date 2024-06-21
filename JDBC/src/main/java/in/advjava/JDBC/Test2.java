package in.advjava.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

class StatmentUtil{
	private static Statement stmt = null;
	
	public static Statement getStatement() throws SQLException {
		if(stmt == null) {
			stmt = ConnectionUtil.getConnection().createStatement();
		}
		return stmt;
	}
}

public class Test2 {

	public static void main(String[] args) throws SQLException {
		System.out.println(StatmentUtil.getStatement());

	}

}
