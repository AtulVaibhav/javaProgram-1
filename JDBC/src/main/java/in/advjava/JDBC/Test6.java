package in.advjava.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test6 {
   public static String insertData(int id,String name,String dept,double salary) throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = 
			   con.prepareStatement("insert into employee values(?,?,?,?)");
	   
	   ps.setInt(1,id);
	   ps.setString(2,name);
	   ps.setString(3, dept);
	   ps.setDouble(4, salary);
	   
	   int i = ps.executeUpdate();
	   if(i>0) {
		   return "Records added";
	   }
	   return "Can't add records at this moment";
	   
	   
   }
   
   public static void readAll() throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = 
			   con.prepareStatement("select * from employee");
	   
	   ResultSet set =  ps.executeQuery();
	   while(set.next()) {
		   System.out.println("EmployeeId :"+set.getInt(1)
		   + " EmployeeName :"+set.getString(2)+
		     " EmployeeDept :"+set.getString(3)+
		     " EmployeeSalary :"+set.getDouble(4));
	   }
	   
   }
   
   public static void readById(int id) throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = 
			   con.prepareStatement("select * from employee where empId=?");
	   ps.setInt(1, id);
	   ResultSet set =  ps.executeQuery();
	   while(set.next()) {
		   System.out.println("EmployeeId :"+set.getInt(1)
		   + " EmployeeName :"+set.getString(2)+
		     " EmployeeDept :"+set.getString(3)+
		     " EmployeeSalary :"+set.getDouble(4));
	   }
   }
   
   public static String updated(int id,String dept,double salary) throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = 
	con.prepareStatement("update employee set empDept=? ,salary=? where empId=?");
       ps.setString(1, dept);
       ps.setDouble(2, salary);
       ps.setInt(3, id);
     int i =  ps.executeUpdate();
      if(i>0) {
    	  return "Updated successfully";
      }
      return "Can't update t this moment";
   }
   
   public static String deleteEmployee(int id) throws SQLException {
	   Connection con = ConnectionUtil.getConnection();
	   PreparedStatement ps = 
	con.prepareStatement("delete from employee where empId=?");
       ps.setInt(1, id);
       int i = ps.executeUpdate();
       if(i>0) {
    	   return "Row deleted successfully";
       }
       return "Can't delete row";
   }
   
	public static void main(String[] args) throws SQLException {
		//System.out.println(insertData(203, "Varun","accounts", 15000.78));
        // readAll();
		
//		readById(202);
//		System.out.println(updated(202, "Reserch", 67000.67));
//		readById(202);
		System.out.println(deleteEmployee(203));
		
	}

}
