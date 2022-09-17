package com.aaron.spring.springcoreadvanced.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcoreadvanced/collections/config.xml");
		
		PhoneBook employee= (PhoneBook) context.getBean("phoneBook");
		System.out.println(employee);
		
	}
}