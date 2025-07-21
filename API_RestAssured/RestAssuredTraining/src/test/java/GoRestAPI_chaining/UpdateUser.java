package GoRestAPI_chaining;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

public class UpdateUser {
	
	@Test()
	void testUpdateUser(ITestContext context)
	{
		Faker faker = new Faker();
		
		JSONObject data = new JSONObject();
		
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status","active");
		
		
		//int id = (Integer) context.getAttribute("id"); //this should come from createUser request
		int id = (Integer) context.getSuite().getAttribute("id");
		
		String bearerToken = "20c4e74b62eb608c919fd098370099868e411f35d81cd92550c0e901b4404fc5";
		
		given()
			.header("Authorization", "Bearer ", bearerToken)
			.pathParam("id", id)
		
		.when()
			.put(".get(\"https://gorest.co.in/public/v2/users/{id}")
			
		.then()
			.statusCode(200)
			.log().all();
			
	
	}

}
