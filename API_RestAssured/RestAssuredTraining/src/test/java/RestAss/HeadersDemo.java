package RestAss;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeadersDemo {
	
	//@Test(priority =1)
	void testHeader() {
		
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			//.header("header_name","header_value")
			.header("Content-Type", "text/html; charset=ISO-8859-1 ")
			.and()
			.header("Content-Encoding", "gzip")
			.and()
			.header("Server", "gws");
		
	}
	
	@Test(priority =2)
	void getHeaderInfo()
	{
		
		Response res = given()
		
		.when()
			.get("https://www.google.com/");
		
		//get single header information
		String hv_contentType = res.getHeader("Content-Type");
		System.out.println("The value of Content-Type header is: "+hv_contentType);
		String hv_contentEncoding = res.getHeader("Content-Encoding");
		System.out.println("The value of Content-Encoding header is: "+hv_contentEncoding);
		String hv_server = res.getHeader("Server");
		System.out.println("The value of Server header is: "+hv_server);
		
		//get all header info
		Headers headers_values =res.getHeaders();
 
		for(Header hd : headers_values)
		{
			System.out.println(hd.getName()+ "		"+hd.getValue());
		}
		
		
		
		
	}
	

}
