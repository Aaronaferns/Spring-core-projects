package com.aaron.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcoreadvanced/stereotypeannotations/config.xml");
		
		Instructor instructor= (Instructor) context.getBean("inst");
		System.out.println(instructor.hashCode());
		System.out.println(instructor);
		Instructor instructor2= (Instructor) context.getBean("inst");
	
	}
}