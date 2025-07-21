package RestAss;

import org.testng.annotations.Test;

import io.restassured.matcher.RestAssuredMatchers;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class XMLSchemValidator {
	
	@Test()
	void testXMLSchema() {
		
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler")
		
		.then()
			.assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("travelers.xsd"));
	}

}
