package com.aaron.spring.springcore.maps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcore/maps/mapconfig.xml");
		
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.toString());
		
	}
}
