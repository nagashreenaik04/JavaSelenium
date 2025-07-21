package GoRestAPI_chaining;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetUsers {
	
	@Test(priority =1)
	void testGetUsers()
	{
		given()

		.when()
			.get("https://gorest.co.in/public/v2/users/")

		.then()
			.statusCode(200)
			.log().all();

	}

}
