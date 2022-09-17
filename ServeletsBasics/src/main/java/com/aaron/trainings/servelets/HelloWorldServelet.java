package com.aaron.trainings.servelets;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

public class HelloWorldServelet extends GenericServlet {
    
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1> Hello Servelets World </h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
