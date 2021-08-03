package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtility {

	String strResult;
	
	public String getPropValue(String property) throws IOException {
		Properties prop = new Properties();

		try {
			//load a properties file
			prop.load(new FileInputStream("./config.properties"));
			strResult  = prop.getProperty(property).trim();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return strResult;
	
	}
}
