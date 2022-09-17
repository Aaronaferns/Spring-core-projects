package com.aaron.spring.springcore.propertyplaceholder;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcore/propertyplaceholder/config.xml");
		MyDAO myDAO = (MyDAO) context.getBean("myDAO");
		System.out.println(myDAO);
		
		
	
	}
}
