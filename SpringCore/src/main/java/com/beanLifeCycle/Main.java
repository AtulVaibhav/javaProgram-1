package com.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = ctx.getBean("car",Car.class);
        System.out.println(c.getName());
        ctx.registerShutdownHook();
	}

}
