package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 */

/**
 * @author Rashika_Kowtikwar
 *
 */
public class TestBase {

	public static Properties prop;
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("C:\\Git_Project\\LearnRestApi\\src\\main\\java\\com\\qa\\config\\config.properties");
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
