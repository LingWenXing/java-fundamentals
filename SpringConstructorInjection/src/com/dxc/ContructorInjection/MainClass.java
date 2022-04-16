package com.dxc.ContructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
		
		Employee e = (Employee)ac.getBean("e");
		System.out.println(e);

		Employee e1 = (Employee)ac.getBean("e");
		System.out.println(e1);
	}

}
