package RestAss;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class LoggingDemo {
	
	@Test()
	void testLogs()
	{
		 given()
		 
		 .when()
		 	.get("https://reqres.in/api/users?page=2")
		 
		 .then()
		 	//.log().body(); //It will print only response body
		 	//.log().cookies(); //It will print only cookies
		 	//.log().headers();//It will print only headers
		 	.log().all(); //It will print everything
		 
		 
	}

}
