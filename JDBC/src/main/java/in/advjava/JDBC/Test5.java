package in.advjava.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ReadQuery{
	public static void readAll() throws SQLException {
		Statement stmt = StatmentUtil.getStatement();
		
		String query = "select * from employee";
		
		ResultSet executeQuery = stmt.executeQuery(query);
		System.out.println("Employee details");
		while(executeQuery.next()) {
			System.out.println("Employee Id:    "+executeQuery.getInt(1));
			System.out.println("Employee Name:  "+executeQuery.getString(2));
			System.out.println("Employee Dept:  "+executeQuery.getString(3));
			System.out.println("Employee Salary:"+executeQuery.getDouble(4));
			System.out.println("_______________________________________________");
		}
		
		
	}
	
	public static void readById(int id) throws SQLException {
		Statement stmt = StatmentUtil.getStatement();
		String query = "select * from employee where empId ="+id;
		ResultSet executeQuery = stmt.executeQuery(query);
		
		System.out.println("Employee details");
		while(executeQuery.next()) {
			System.out.println("Employee Id:    "+executeQuery.getInt(1));
			System.out.println("Employee Name:  "+executeQuery.getString(2));
			System.out.println("Employee Dept:  "+executeQuery.getString(3));
			System.out.println("Employee Salary:"+executeQuery.getDouble(4));
			System.out.println("_______________________________________________");
		}
	}
}
public class Test5 {

	public static void main(String[] args) throws SQLException {
		ReadQuery.readAll();
		System.out.println("____________________________");
		System.out.println("Based on id:");
		ReadQuery.readById(102);

	}

}
