package com.aaron.spring.springcore.assignment2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	AbstractApplicationContext context =  new ClassPathXmlApplicationContext("com/aaron/spring/springcore/assignment2/config.xml");
	University university1 =(University)context.getBean("university");
	System.out.println(university1.toString());
	System.out.println(university1.hashCode());
	
	University university2 =(University)context.getBean("university");
	System.out.println(university2.toString());
	System.out.println(university2.hashCode());
	
	context.registerShutdownHook();
	
	}
}
