package com.webdav.dao;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.github.sardine.DavResource;

public interface DavDao {
	
	//Search the repository 
	
	public List<DavResource> searchDav() throws IOException;
    public InputStream getFile(String pathurl) throws IOException;
    public void storeFile(String url, InputStream is) throws IOException;
    public void deleteFile(String url) throws IOException;
	
}
