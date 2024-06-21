package in.advjava.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Test8 {
     public static void getDBInfo() throws SQLException {
    	 Connection con = ConnectionUtil.getConnection();
    	 DatabaseMetaData db = con.getMetaData();
    	 System.out.println(db.getDatabaseProductName());
    	 System.out.println(db.getDriverName());
    	 System.out.println(db.getURL());
    	 System.out.println(db.getUserName());
     }
	public static void main(String[] args) throws SQLException {
		getDBInfo();

	}

}
