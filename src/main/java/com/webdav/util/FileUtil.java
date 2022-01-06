package com.webdav.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.github.sardine.DavResource;
import com.webdav.dao.DavDaoImpli;

public class FileUtil {
	
	             List <DavResource> filelist ;
                 String path;      
                 String pathurl;
                 DavDaoImpli mydav;
                 InputStream input;
                 File f;
	             public FileUtil() {
	            	 mydav = new DavDaoImpli(); 
	             
				 try {
                		             
	        
	               filelist = mydav.searchDav();
	               input = mydav.getFile(pathurl);
	               mydav.storeFile(f);
	               mydav.deleteFile(path);
				 }
				 catch(IOException e) 
				 {
					 e.printStackTrace();
				 }
	             }
}     

