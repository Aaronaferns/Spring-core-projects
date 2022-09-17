package com.aaron.spring.springcore.shoppingcart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aaron.spring.springcore.test.Hospital;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aaron/spring/springcore/shoppingcart/config.xml"); 
		ShoppingCart cart =(ShoppingCart) context.getBean("cart");
		System.out.println(cart.toString());
	}
}

