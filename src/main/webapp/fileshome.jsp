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
      <form action = "http://localhost:8080/WebDav/webdav" method = "post">
         Click to see file in WebDAV
         <input type="submit" value="View Files">
         
         
        </form>
     
        <hr>
        
      <form action="savefile" method="post" enctype="multipart/form-data">
      Add Files to WebDAV
        <input type="file" name="file"> 
        <input type ="submit"  value = "Upload">
     </form>
    
     </div>
</body>
</html>