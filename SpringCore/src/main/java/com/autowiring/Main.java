package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("applicationContext.xml");
      
      System.out.println(context.getBean("customer",Customer.class));
	}

}
