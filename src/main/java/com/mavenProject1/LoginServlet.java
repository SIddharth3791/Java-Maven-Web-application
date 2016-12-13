package com.mavenProject1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Login.Do")
public class LoginServlet extends HttpServlet{
	
	
	 protected void doGet(HttpServletRequest Request, HttpServletResponse Response)
			 throws ServletException, IOException {
		 
		 String name = Request.getParameter("name");
	
		Request.setAttribute("name",name);
		Request.getRequestDispatcher("/WEB-INF/views/LoginView.jsp").forward(Request, Response);
	}
	  

}
