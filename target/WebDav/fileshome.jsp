<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %> 
<%@ page import="com.webdav.dao.DavDaoImpli"  %>    
<%@ page import ="com.github.sardine.DavResource" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File Dav</title>
</head>
<body>
     <div style = "text-align: center">
     <h3> Files in WebDav </h3>
      <form action = "download" method = "post">
     <table>
      
     <%
              DavDaoImpli mydao = new DavDaoImpli();
     		  List <DavResource>  resource = mydao.searchDav(); 
     		  if(resource == null)
     		  {
     			  out.println("Couldnot find any File !!!");
     			  out.println("Please add files");
     		  }
     		  else {
     			 
     			  
     			 	  
     		    for (DavResource res : resource)
     		    {
     		    	
      %>
       
      <tr>
      <td style="text-align: center">
      <%=res %>
      </td>
     
            <td>
           <input type ="hidden"  name = "path"  value="<%= res.getName() %>">
          
              <input type="submit" value = "Download">
              </td> 
       
          </tr>
     	<% 
     	     }
     		  }
     		  
      %>
       
        </table>
        </form>
     
        <hr>
        
      <form action="savefile" method="post" enctype="multipart/form-data">
        <input type="file" name="file"> 
        <input type ="submit">
     </form>
    
     </div>
</body>
</html>