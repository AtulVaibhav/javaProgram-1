package com.manytomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpName("Harsh");
		
		Employee e2 = new Employee();
		e2.setEmpName("Vivek");
		
		Employee e3 = new Employee();
		e3.setEmpName("John");
		
		Project p1 =new Project();
		p1.setProjectName("p1");
		
		Project p2 =new Project();
		p2.setProjectName("p2");
		
		Project p3 =new Project();
		p3.setProjectName("p3");
		
		
		List<Project> list1 = Arrays.asList(p1,p2);
		List<Project> list2 = Arrays.asList(p2,p3);
		List<Project> list3 = Arrays.asList(p1,p3);
		
		
		e1.setProjects(list1);
		e2.setProjects(list2);
		e3.setProjects(list3);
		
		List<Employee> empList1 = Arrays.asList(e1,e2);
		List<Employee> empList2 = Arrays.asList(e2,e3);
		List<Employee> empList3 = Arrays.asList(e1,e3);
		
		p1.setEmployee(empList1);
		p2.setEmployee(empList2);
		p3.setEmployee(empList3);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee saved successfully");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
