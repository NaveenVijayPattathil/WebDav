package com.webdav.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import com.webdav.dao.DavDaoImpli;


public class FileDowloder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		                      DavDaoImpli mydav = new DavDaoImpli();
		                      //method to delete and get File
		                      // path = res.getName = Downloads
		                      		                                           
		                      
	}

}
