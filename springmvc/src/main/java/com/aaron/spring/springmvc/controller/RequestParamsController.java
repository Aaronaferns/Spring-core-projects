package com.aaron.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aaron.spring.springmvc.dto.Person;
@Controller
public class RequestParamsController {
	@RequestMapping("/awesome")
	public ModelAndView getParams(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("hob") String hobby) {
		ModelAndView modelAndView = new ModelAndView();
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setHobby(hobby);
		modelAndView.addObject("someUser",person);
		System.out.println(person);
		modelAndView.setViewName("registeredUser");
		return modelAndView;
	}
}
