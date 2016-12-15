package com.mavenProject1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Login.Do")
public class LoginServlet extends HttpServlet{
	
	
	ValidateUserDetails service = new ValidateUserDetails();
// Marks ----> Login Page <----------------	
	 protected void doGet(HttpServletRequest Request, HttpServletResponse Response)
			 throws ServletException, IOException {
		
		Request.getRequestDispatcher("/WEB-INF/views/LoginView.jsp").forward(Request, Response);
	}
	 
	 
	// Marks ----> Welcome Page <----------------	
	 protected void doPost(HttpServletRequest Request, HttpServletResponse Response)
			 throws ServletException, IOException {
		String name = Request.getParameter("name");
		String password = Request.getParameter("password");
		
		boolean uservalidation = service.validateUser(name, password);
		
		if (uservalidation){
			
		Request.setAttribute("name", name);
		Request.setAttribute("password", password);
		Request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp").forward(Request, Response);
		}
		else
		{
			Request.setAttribute("ErrorMessage", "Invalid User Details");
			Request.getRequestDispatcher("/WEB-INF/views/LoginView.jsp").forward(Request, Response);
		}
	}
	 
	 
	  

}
