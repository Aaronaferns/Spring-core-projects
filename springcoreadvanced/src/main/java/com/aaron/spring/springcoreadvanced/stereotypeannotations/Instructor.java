package com.aaron.spring.springcoreadvanced.stereotypeannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	@Value("#{T(java.lang.Math).abs(-42)}")
	private int id;
	@Value("#{'Aaron'.toUpperCase()}")
	private String name;
	@Autowired
	private Birds pets;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public Birds getPets() {
		return pets;
	}
	public void setPets(Birds pets) {
		this.pets = pets;
	}
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", pets=" + pets + "]";
	}
	
	
	
}
