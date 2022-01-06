package com.webdav.dao;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

public class DavDaoImpli implements DavDao {
	   
					Sardine sardine;
					
	   
	public DavDaoImpli() {
					sardine = SardineFactory.begin();
					}

	@Override
	public List<DavResource> searchDav() throws IOException {
		
		             List<DavResource> resources = null;
	               
	                	 resources = sardine.list("http://localhost:8080/WebDav/webdav");
	                		                	  
	                
	                 return resources;
	}

	@Override
	public InputStream getFile(String pathurl) throws IOException {
		InputStream inputs = sardine.get(pathurl);
		
		return inputs;
	}

	@Override
	public void storeFile(String url, InputStream is) throws IOException {
		
		sardine.put("http://localhost:8080/WebDav/webdav/" +url, is);
		
	}

	@Override
	public void deleteFile(String url) throws IOException {
		sardine.delete(url);
		
	}

}
