/**
 * 
 */
package com.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

/**
 * @author Rashika_Kowtikwar
 *
 */
public class GetAPITest extends TestBase {

	public GetAPITest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	TestBase testbase;
	String apiurl;
	String serviceurl;
	String url;
	RestClient restclient;
	
	@BeforeMethod
	public void setUp() throws IOException{
	
			testbase = new TestBase();
			 apiurl=prop.getProperty("url");
			 serviceurl=prop.getProperty("serviceurl");
			
			 url=apiurl+serviceurl;
			
			
			
		
	}
	
	@Test
	public void getAPITest() throws IOException{
		 restclient=new RestClient();
		restclient.get(url);
	}

}
