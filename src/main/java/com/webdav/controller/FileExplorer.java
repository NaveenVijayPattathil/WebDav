package com.webdav.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileExplorer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public FileExplorer() {
     
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 String name = request.getParameter("uname");
		 String pass = request.getParameter("upass");
		 
		 if(name.equalsIgnoreCase("admin") && pass.contains("admin"))
		 {
			 RequestDispatcher dispatch  = request.getRequestDispatcher("fileshome.jsp");
			 dispatch.forward(request, response);
		 }
		 else
		 {
			 out.println("Invalid username or password");
			 RequestDispatcher dispatch  = request.getRequestDispatcher("index.jsp");
			 dispatch.include(request, response);
		 }
	}

}
