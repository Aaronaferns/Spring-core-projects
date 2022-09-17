package com.aaron.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id",454);
		modelAndView.addObject("name", "aaron");
		modelAndView.addObject("hobby","painting");
		return modelAndView;
	}
}
