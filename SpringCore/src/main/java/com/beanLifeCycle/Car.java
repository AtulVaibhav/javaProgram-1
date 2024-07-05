package com.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements InitializingBean,DisposableBean{
	String name;
    Car(){
    	System.out.println("default constructor called");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setter function called");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init() method called");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() called");
		
	}
	
	
}
