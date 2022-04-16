package com.dxc.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppIOC {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		Trainer jt = (Trainer)context.getBean("javaTrainer");
		System.out.println(jt.getDailyTrainingSession());
		
		Trainer wt = (Trainer)context.getBean("webTechTrainer");
		System.out.println(wt.getDailyTrainingSession());
		
		Trainer sqlt = (Trainer)context.getBean("sqlTrainer");
		System.out.println(sqlt.getDailyTrainingSession());
	}

}
