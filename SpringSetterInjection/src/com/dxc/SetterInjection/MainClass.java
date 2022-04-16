package com.dxc.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
		
		Employee e = (Employee)ac.getBean("e");
		System.out.println(e);

		Employee e1 = (Employee)ac.getBean("e");
		System.out.println(e1);
		
//		((AbstractApplicationContext)ac).close();
		ac.close();
	}

}
