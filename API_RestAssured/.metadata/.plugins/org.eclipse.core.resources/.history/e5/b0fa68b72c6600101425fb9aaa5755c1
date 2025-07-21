package api.endpoints;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.ResourceBundle;

import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//created for perform CRUD operation (Create, Read, Update and Delete Request) to the user API
public class UserEndPoints2 {
	
	//method created for getting URL's from properties file
	static ResourceBundle getURL()
	{
		ResourceBundle routes= ResourceBundle.getBundle("routes");//load properties file  // name of the properties file
		return routes;
	}
	
	public static Response createUser(User payload)
	{
		String post_url = getURL().getString("post_url");
		
		Response res = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(post_url);
		
		return res;
	}
	
	public static Response readUser(String userName)
	{
		String get_url = getURL().getString("get_url");
		
		Response res = given()
			.pathParam("username", userName)
		.when()
			.get(get_url);
		
		return res;
	}
	
	public static Response updateUser(String userName, User payload)
	{		
		String put_url = getURL().getString("put_url");
		
		Response res = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.pathParam("username", userName)
			.body(payload)
		.when()
			.put(put_url);
		
		return res;
	}
	
	public static Response deleteUser(String userName)
	{
		String delete_url = getURL().getString("delete_url");
		Response res = given()
			.pathParam("username", userName)
		.when()
			.delete(delete_url);
		
		return res;
	}

}
