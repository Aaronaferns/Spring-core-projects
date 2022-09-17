package com.aaron.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aaron.spring.springmvc.dto.User;
//by default the method used is get
@Controller
public class UserController {
	@RequestMapping("registerationPage")
	public ModelAndView showRegisterationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegisteration");
		return modelAndView;
		
	}
	@RequestMapping(value="registerUser", method=RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("someUser") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registeredUser");
		return modelAndView;
		
	}
}
