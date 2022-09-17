package com.aaron.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aaron.spring.springmvc.dto.Person;
@Controller
public class ListController {
	@RequestMapping("/list")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		ArrayList<Person> personList= new ArrayList<Person>();
		Person person1 = new Person();
		person1.setId(55);
		person1.setName("Aaron");
		person1.setHobby("Basketball");
		Person person2 = new Person();
		person2.setId(53);
		person2.setName("Baren");
		person2.setHobby("Football");
		Person person3 = new Person();
		person3.setId(65);
		person3.setName("Karen");
		person3.setHobby("Hockey");
		Person person4 = new Person();
		person4.setId(75);
		person4.setName("Taren");
		person4.setHobby("Rugby");
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);

		modelAndView.addObject("persons",personList);
		return modelAndView;
	}
}
