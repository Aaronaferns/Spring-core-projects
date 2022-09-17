package com.aaron.spring.springcoreadvanced.injecting.interfaces;

public class OrderBAOImpl implements OrderBAO {

	private OrderDAO dao;
	
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
	@Override
	public void placeOrder() {
		dao.createOrder();
		System.out.println("The order is placed");

	}

}
