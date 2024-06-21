package in.advjava.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

class QueryExecution{
	public static void createTable() throws SQLException {
		Statement stmt = StatmentUtil.getStatement();
		String query ="create table employee(empId int(10) primary key,"
				+ "empName varchar(20) not null, empDept varchar(20),"
				+ "salary decimal(10,2) )";
		
		stmt.execute(query);
		System.out.println("Table created");
	}
}

public class Test3 {

	public static void main(String[] args) {
		try {
			QueryExecution.createTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
