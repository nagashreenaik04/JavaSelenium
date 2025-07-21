package GoRestAPI_chaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetUser {
	
	@Test()
	void test_getUser(ITestContext context) 
	{
		//int id = (Integer) context.getAttribute("id"); //this should come from createUser request
		int id = (Integer) context.getSuite().getAttribute("id");
		
		String bearerToken = "20c4e74b62eb608c919fd098370099868e411f35d81cd92550c0e901b4404fc5";
		
		given()
			.header("Authorization", "Bearer ", bearerToken)
			.pathParam("id", id)
		
		.when()
			.get("https://gorest.co.in/public/v2/users/{id}")
		
		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}
