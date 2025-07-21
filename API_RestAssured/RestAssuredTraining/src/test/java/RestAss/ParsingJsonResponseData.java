package RestAss;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class ParsingJsonResponseData {
	
	//@Test(priority =1)
	void testJsonResponse() {
		
		//Approach 1
		
		given()
			.contentType("ContentType.JSON")
		
		.when()
			.get("http://localhost:3000/school")
		
		.then()
			.statusCode(200)
			.body("Students[1].location", equalTo("USA")); // Check if the value is correct
		
	

		//Approach 2		
		
		/*
		Response res = given()
			.contentType(ContentType.JSON)
			
		.when()
			.get("http://localhost:3000/Students");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Content-Type"), "application/json");
		
		//String location = res.jsonPath().get("Students[3].location").toString();
		//String location = res.jsonPath().get("Students[3].location");
		//Assert.assertEquals(location, "Karnataka"); */
		
	}

	@Test(priority =2)
	void testJsonResponseBodyData() {
		Response res = given()
				.contentType("ContentType.JSON")
				
			//.when()
				.get("http://localhost:3000/school");//
		
		//using Json object class
		JSONObject jo = new JSONObject(res.toString()); //converting response to json object type
		
		//print all titles of books
		/*for(int i=0;i<jo.getJSONArray("Students").length();i++)
		{
			String studentLocation = jo.getJSONArray("Students").getJSONObject(i).get("location").toString();
			System.out.println(studentLocation);	
		}*/
		
		//search for title of the book in json - validation
		boolean status = false;
		
		for(int i=0;i<jo.getJSONArray("Students").length();i++)
		{
			String studentLocation = jo.getJSONArray("Students").getJSONObject(i).get("location").toString();
			
			if(studentLocation.equals("Karnataka"))
			{
				status =true;
				break;
			}
		}
		Assert.assertEquals(status, true);
	}
}
