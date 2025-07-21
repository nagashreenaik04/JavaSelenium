package RestAss;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class ParsingXMLResponse {
	
	@Test(priority =1)
	void testXMLResponse()
	{
		//Approach 1
		/*
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1")
			
		.then()
			.statusCode(200)
			.header("Content-Type", "application/xml; charset = utf-8")
			.body("TravelerinformationResponse.page", equalTo(1))
			.body("TravelerinformationResponsetTravelers.Travelerinformation[0].name",equalTo("Vijay Bharath Reddy"))*/
		
		//Approach 2
		
		Response res=
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		Assert.assertEquals(res.statusCode(), 200);
		Assert.assertEquals(res.header("Content-Type"), "application/xml; charset = utf-8");
		
		String pageNO = res.xmlPath().get("TravelerinformationResponse.page").toString();
		Assert.assertEquals(pageNO, "1");
		
		String travelName = res.xmlPath().get("TravelerinformationResponsetTravelers.Travelerinformation[0].name").toString();
		Assert.assertEquals(travelName, "Vijay Bharath Reddy");
		
			
	}
	
	void testXMLResponseBody()
	{
		Response res=
		given()
		
		.when()
			.get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlobj = new XmlPath(res.asString());
		
		//verify total number of travelers
		List<String> travelers = xmlobj.getList("TeavelerinformationResponse.travelers.Travelerinformation");
		Assert.assertEquals(travelers.size(), 10);
		
		//verify traveler name is present in response
		List<String> traveler_names = xmlobj.getList("TeavelerinformationResponse.travelers.Travelerinformation");
		
		boolean status = false;
		for(String travelername:traveler_names)
		{
			if(travelername.equals("Vijay Bharath Reddy"))
			{
				status = true;
				break;
				
			}
		}
		Assert.assertEquals(status, true);
		
	}

}
