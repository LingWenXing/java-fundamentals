package com.dxc.SpringMavenProj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        EmployeeData e = (EmployeeData)ac.getBean("emp1");
        System.out.println(e);
       
    }
}
