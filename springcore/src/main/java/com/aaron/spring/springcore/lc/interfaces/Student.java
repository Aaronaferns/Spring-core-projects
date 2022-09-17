package com.aaron.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("This is inside setter");
		this.id = id;
	}
	
	

	public void hi() {
		System.out.println("This is inside hi");
	}
	public void kill() {
		System.out.println("This is inside kill");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is inside after properties");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("This is inside Destroy");
		
	}
}
