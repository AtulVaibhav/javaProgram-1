package in.advjava.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

class InsertQuery{
	public static void insertData() throws SQLException {
		Statement stmt = StatmentUtil.getStatement();
		String query = "insert into employee values(101,'Harsh','dev',67000)"
				+ ",(102,'Ankit','testing',57000),(103,'Varun','account',32000)";
		int i = stmt.executeUpdate(query);
		if(i>0)System.out.println(i+" rows affected");
	}
}

public class Test4 {

	public static void main(String[] args) {
		try {
			InsertQuery.insertData();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
