package com.aaron.user.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/readServlet")
public class ReadUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection connection;   
    public void init() {
    	try {
        Class.forName("com.mysql.cj.jdbc.Driver");

		 connection =DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","aaron");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}catch (ClassNotFoundException e) {
		e.printStackTrace();
       }
    	
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
			PrintWriter out = response.getWriter();
			
			out.println("<table>");
			out.println("<tr>");
			
			out.println("<th>");
			out.println("First Name");
			out.println("</th>");
			
			
			
			out.println("<th>");
			out.println("Last Name");
			out.println("</th>");
			
			
			out.println("<th>");
			out.println("Email");
			out.println("</th>");
			out.println("</tr>");
			
			while(resultSet.next()){
				out.println("<tr>");
				
				out.println("<td>");
				out.println(resultSet.getString(1));
				out.println("</td>");
				
				
				
				out.println("<td>");
				out.println(resultSet.getString(2));
				out.println("</td>");
				
				
				out.println("<td>");
				out.println(resultSet.getString(3));
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
