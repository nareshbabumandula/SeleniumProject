package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utility {

	Properties prop = new Properties();

	public String getProperty(String PropertyName) {
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(".\\Config.properties")) {
			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty(PropertyName));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return prop.getProperty(PropertyName);
	}

}
