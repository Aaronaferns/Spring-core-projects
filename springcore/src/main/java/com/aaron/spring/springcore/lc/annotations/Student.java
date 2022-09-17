package com.aaron.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Student{	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("This is inside setter");
		this.id = id;
	}
	
	
	@PostConstruct
	public void hi() {
		System.out.println("This is inside hi");
	}
	@PreDestroy
	public void kill() {
		System.out.println("This is inside kill");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}
