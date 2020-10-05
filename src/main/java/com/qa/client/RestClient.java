/**
 * 
 */
package com.qa.client;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

/**
 * @author Rashika_Kowtikwar
 *
 */
public class RestClient {
	
	public void get(String url)
	
	{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget=new HttpGet(url);
		
		try {
			
			CloseableHttpResponse closeableHttpResponse=httpClient.execute(httpget);
			int statuscode=closeableHttpResponse.getStatusLine().getStatusCode();
			System.out.println("Status code::"+statuscode);
			 String responseString=EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
			 JSONObject responseJSON=new JSONObject(responseString);
			 System.out.println("Response JSON from api"+responseJSON);
			Header[] headerArray= closeableHttpResponse.getAllHeaders();
			
			HashMap<String, String> allheaders=new HashMap<String, String>();
			for(Header header:headerArray)
			{
				allheaders.put(header.getName(), header.getValue());
			}
			 System.out.println("Headers Array"+allheaders);
			 
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
