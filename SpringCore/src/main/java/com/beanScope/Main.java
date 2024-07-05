package com.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Car bean = ctx.getBean("car",Car.class);
		Car bean2 = ctx.getBean("car",Car.class);
		
		if(bean==bean2) {
			System.out.println("Points to same object");
		}else {
			System.out.println("Points to different objects");
		}
		
		
	}

}
