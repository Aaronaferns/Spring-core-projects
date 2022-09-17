package com.aaron.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main (String[] args) {
	ClassPathXmlApplicationContext ctx = 
			new ClassPathXmlApplicationContext("com/aaron/spring/springcore/config.xml");
			Employee emp =(Employee)ctx.getBean("emp");
			System.out.println("Employee Id is "+ emp.getId() );
			System.out.println("Employee name is "+ emp.getName() );
	}
}
