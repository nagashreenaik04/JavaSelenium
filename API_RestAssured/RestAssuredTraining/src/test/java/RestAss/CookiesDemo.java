package RestAss;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


public class CookiesDemo {
	
	@Test(priority =1)
	void testCookies() {
		
		given()
		
		.when()
			.get("https://www.google.com/")
		
		.then()
			//.cookie("cookie_name","cookie_value")
			.cookie("AEC","AVcja2d9zsROqN9-nrxOOxBjS0YFsil3hqYVfIYZyORjerKI_2minrCMYw")
			.log().all();
		
	}
	
	@Test(priority = 2)
	void getCookiesInfo() {
		
		Response res =given()
		
		.when()
			.get("https://www.google.com/");
		
		
		
		//get all cookies key info
		Map<String,String> cookies_keys = res.getCookies();
		System.out.println(cookies_keys.keySet());
		
		//get single cookie info
		String cookie_value1 = res.getCookie("AEC");
		System.out.println("Value of cookie1 is ====>" + cookie_value1);
		String cookie_value2 = res.getCookie("NID");
		System.out.println("Value of cookie2 is ====>" + cookie_value2);
		
		//get all cookies info
		for(String k:cookies_keys.keySet())
		{
			String cookies_value = res.getCookie(k);
			System.out.println(k +"	" + cookies_value );		
			
		}
		
		
	}

}
