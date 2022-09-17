package com.aaron.spring.springcore.lifecycle;

public class Student {	
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
}
