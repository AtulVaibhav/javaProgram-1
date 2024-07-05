package in.advjava.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//getBean
		
		Network bean = appContext.getBean("network",Network.class);
		System.out.println(bean.getTariff());
	}

}
