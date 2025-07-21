package api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints2;
import api.payloads.User;
import io.restassured.response.Response;

public class UserTestsUsingRouteProperties {
	
	Faker faker;
	User userPayload;
	
	public Logger logger; //for logs
	
	@BeforeClass()
	public void setupData()
	{
		faker = new Faker();
		userPayload = new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password());
		userPayload.setPhone(faker.phoneNumber().cellPhone());	
		
		//logs
		logger = LogManager.getLogger(this.getClass());
	}
	
	@Test(priority = 1)
	public void testCreateUser()
	{
		logger.info("***** Creating user *******");
		Response res = UserEndPoints2.createUser(userPayload);
		res.then().log().all();
		
		Assert.assertEquals(res.getStatusCode(), 200);
		logger.info("***** User is Created *******");
	}
	
	@Test(priority =2)
	public void testGetUser()
	{
		logger.info("***** Reading a User info *******");
		Response res = UserEndPoints2.readUser(this.userPayload.getUsername());
		res.then().log().all();
		
		Assert.assertEquals(res.getStatusCode(), 200);
		logger.info("***** User info is displayed *******");
	}
	
	@Test(priority = 3)
	public void testUpdateUser()
	{
		logger.info("***** Updating user *******");
		//Update data using payload
		userPayload.setFirstname(faker.name().firstName());
		userPayload.setLastname(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		
		Response res =UserEndPoints2.updateUser(this.userPayload.getUsername(), userPayload);
		res.then().log().all();
		
		Assert.assertEquals(res.getStatusCode(), 200);
		/*
		//checking data after update
		Response getres = UserEndPoints.readUser(this.userPayload.getUsername());
		getres.then().log().all();
		
		Assert.assertEquals(getres.getStatusCode(), 200);*/
		
		logger.info("***** User is updated *******");
	}
	 
	@Test(priority = 4)
	public void testDeleteUser()
	{
		logger.info("***** Deleting user *******");
		Response res = UserEndPoints2.deleteUser(this.userPayload.getUsername());
		res.then().log().all();
		
		Assert.assertEquals(res.statusCode(), 200);
		logger.info("***** User is deleted *******");
	}

}
