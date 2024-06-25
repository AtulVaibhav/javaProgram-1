package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
    		    .configure().buildSessionFactory();
    
         Session session = factory.openSession();
         
         //fetching employee details
         Employee e = session.get(Employee.class, "emp01");
         System.out.println(e.getEmpName()+" "+e.getAccount().getBankName());

         System.out.println("__________________________");
         Account a = session.get(Account.class, "SBI001");
         System.out.println(a.getBankName()+" "+a.getEmp().getEmpName());
	
	
	
	}

}
