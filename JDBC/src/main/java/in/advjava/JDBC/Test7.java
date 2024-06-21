package in.advjava.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test7 {
   public static  void getInfo() throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = con.prepareStatement("select * from employee"); 
	   ResultSet rs = ps.executeQuery();
	   ResultSetMetaData meta = rs.getMetaData();
	   System.out.println("Column Count "+meta.getColumnCount());
	   System.out.println("Table Name "+meta.getTableName(1));
	   System.out.println("Column names :"+meta.getColumnLabel(1)
	                        +" "+meta.getColumnLabel(2)
	                        +" "+meta.getColumnLabel(3)
	                        +" "+meta.getColumnLabel(4));
   
      
   }
	public static void main(String[] args) throws SQLException {
		getInfo();

	}

}
