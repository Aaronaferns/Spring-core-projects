package com.aaron.servlet.interserveletcommunications;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "aaron");
			Statement statement = conn.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from user where email='" +email+ "' "
					+ "and password = '"+password+"'");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("HomeServlet");
			if(resultSet.next()) {
				request.setAttribute("message", "Welcome to InterServletCommunication "+email);
				requestDispatcher.forward(request, response);
			}else {
				requestDispatcher=request.getRequestDispatcher("login.html");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	  
	}

}
