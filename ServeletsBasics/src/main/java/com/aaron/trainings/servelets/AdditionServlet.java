package com.aaron.trainings.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if(request.getParameter("number1")!=null && request.getParameter("number2")!= null) {
			long number1 = Long.parseLong(request.getParameter("number1"));
			long number2 = Long.parseLong(request.getParameter("number2"));
			
			PrintWriter out = response.getWriter();
	    	out.println("The result is"+ (number1 + number2));
	
		}	
	}

}
