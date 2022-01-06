package com.webdav.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

import com.webdav.dao.DavDaoImpli;
@MultipartConfig()
public class FileSaver extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");           
		                   DavDaoImpli mydav = new DavDaoImpli();
		              
		                   try {
							
						    	Part filePart = request.getPart("file"); 
						        String fileName = Paths.get(filePart.getSubmittedFileName()).toString(); 
						        
						        if(filePart != null)
						        {
						        System.out.println("FIle part found");	
						        InputStream is = filePart.getInputStream();
						        mydav.storeFile(fileName,is);
						   	   out.println("Saved the file");
		                       RequestDispatcher rd = request.getRequestDispatcher("fileshome.jsp");
		                       rd.include(request, response);
						        }
						        
						} catch (Exception e) {
							
							e.printStackTrace();
						}
		                   
		                   
		     
	}

}
