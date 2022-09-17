package com.aaron.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcore/lc/interfaces/config.xml");
		
		Student student= (Student) context.getBean("student");
		System.out.println(student.toString());
		context.registerShutdownHook();
	}
}