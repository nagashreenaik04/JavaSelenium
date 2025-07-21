package GoRestAPI_chaining;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CreateUser {
	
	@Test()
	void testCreateUser(ITestContext context)
	{
		
		Faker faker= new Faker();
		
		JSONObject data = new JSONObject();
		
		data.put("name", faker.name().fullName());
		data.put("gender", "Male");
		data.put("email", faker.internet().emailAddress());
		data.put("status", "inactive");
		
		
		String bearerToken = "20c4e74b62eb608c919fd098370099868e411f35d81cd92550c0e901b4404fc5";
		 Response res = given()
			.header("Authorization","Bearer " + bearerToken)
			.contentType("application/json")
			.body(data.toString())
		
		.when()
			.post("https://gorest.co.in/public/v2/users");
		
		// Debugging: Print response status code and body
        System.out.println("Response Status Code: " + res.getStatusCode());
        System.out.println("Response Body: " + res.asString());
        
        
        // Check if the status code is 201 (Created)
        res.then().statusCode(201);
      
        // Extract the 'id' directly from the response (not under 'data')
        int userId = res.jsonPath().getInt("id");
        System.out.println("User ID: " + userId);
        
        System.out.println("Generated id is : " + userId);
        
        //context.setAttribute("id", userId);
        context.getSuite().setAttribute("id", userId);
		
		
	}

}
