package RestAss;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Authentications {
	
	@Test(priority =1)
	void testBasicAuthentication()
	{
		given()
			.auth().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();	
	}
	
	@Test(priority =2)
	void testDigestAuthentication()
	{
		given()
			.auth().digest("postman", "password")
		
		.when()
			.get("https://postman-echo.com/digest-auth")
		
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();	
	}
	
	@Test(priority =3)
	void testPreemptiveAuthentication()
	{
		given()
			.auth().preemptive().basic("postman", "password")
		
		.when()
			.get("https://postman-echo.com/basic-auth")
		
		.then()
			.statusCode(200)
			.body("authenticated", equalTo(true))
			.log().all();	
	}
	
	//@Test(priority =4)
	void testBearerTokenAuthentication()
	{
		String bearerToken = "4c50261a3f0267192f86857db9ba73f72cd81e6bf96d90170656db09ecf7f8bd"	;
		given()
			.headers("Authorization","Bearer " + bearerToken) //after "Bearer " space must be there. else we will get the error
		
		.when()
			.get("https://simple-books-api.glitch.me/orders")
		
		.then()
			.statusCode(200)
			.log().all();	
	}
	
	//@Test(priority =5)
	void testOAuth1Authentication()
	{
		given()
			.auth().oauth("consumerKey", "consumerSecrat", "accessToken", "tokenSecrat") //this is for OAuth1.0 authentication
		
		.when()
			.get("url")
		
		.then()
			.statusCode(200)
			.log().all();	
	}
	
	@Test(priority =6)
	void testOAuth2Authentication()
	{
		given()
			.auth().oauth2("4c50261a3f0267192f86857db9ba73f72cd81e6bf96d90170656db09ecf7f8bd")
		
		.when()
			.get("https://simple-books-api.glitch.me/orders")
		
		.then()
			.statusCode(200)
			.log().all();	
	}
	
	@Test(priority =7)
	void testAPIKeyAuthentication()
	{
		//Method 1
		/*
		given()
			.queryParam("appid", "fe9c5cddb7e01d747b4611c3fc9eaf2c") //appid is APIKey
		
		.when()
			.get("https://api.openweathermap.org/data/2.5/forecast/daily?q=London&units=metric&cnt=7")
		
		.then()
			.statusCode(200)
			.log().all();	
			
			*/
		
		//Method 2
		
		given()
			.queryParam("appid", "fe9c5cddb7e01d747b4611c3fc9eaf2c")
			.pathParam("mypath", "data/2.5/forecast/daily")
			.queryParam("q", "London")
			.queryParam("units", "metric")
			.queryParam("cnt", "7")
		
		.when()
			.get("https://api.openweathermap.org/{mypath}")
		
		.then()
			.statusCode(200)
			.log().all();
		
	}

}
