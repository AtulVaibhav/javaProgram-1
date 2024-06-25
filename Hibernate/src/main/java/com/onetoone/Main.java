package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpId("emp01");
		emp.setEmpName("Harsh");
		
		Account a1= new Account();
		a1.setAccountNumber("SBI001");
		a1.setBankName("SBI");
        
		
		emp.setAccount(a1);
		a1.setEmp(emp);
		
		
		
		Employee e2 = new Employee();
		e2.setEmpId("emp02");
        e2.setEmpName("Varun");
        
        
        Account a2 = new Account();
        a2.setAccountNumber("PNB001");
        a2.setBankName("PNB");
        
        e2.setAccount(a2);
        a2.setEmp(e2);
        
        SessionFactory factory = new Configuration()
        		    .configure().buildSessionFactory();
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(emp);
       
        session.save(e2);
       
        session.getTransaction().commit();
        session.close();
        
        System.out.println("Objects saved");
        
        
        
        
		
	}

}
