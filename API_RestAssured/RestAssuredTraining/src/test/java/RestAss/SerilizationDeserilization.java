package RestAss;

//POJO --- serilize ---> JSON Object --- de-serilize ---> POJO

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class SerilizationDeserilization {
	
	// @Test(priority =1)
	void convertPOJO2JSON() throws JsonProcessingException
	{
		//created java object using POJO class
		Pojo_PostRequest stupojo = new Pojo_PostRequest();
		stupojo.setName("QA");
		stupojo.setLocation("Karnataka");
		stupojo.setPhone("9876543210");
		String coursesArr[] = {"C","C++"};
		stupojo.setCourses(coursesArr);
		
		//convert java object ----> json object (serialization)
		ObjectMapper objMapper = new ObjectMapper();
		
		String jsonData = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(stupojo);
		
		System.out.println(jsonData);
		
	}
	
	//JSON---> POJO (Deserilization)
	@Test(priority =2)
	void convertJSON2POJO() throws JsonMappingException, JsonProcessingException
	{
		
		String jsondata ="{\r\n"
				+ " \"name\":\"Scott\",\r\n"
				+ " \"location\":\"France\",\r\n"
				+ " \"phone\":\"123456\",\r\n"
				+ " \"courses\": [\"c\",\"c++\"],\r\n"
				+ "}";
		
		//convert json data ---> POJO object
		ObjectMapper objMapper = new ObjectMapper();
		
		Pojo_PostRequest stupojo = objMapper.readValue(jsondata, Pojo_PostRequest.class);
		
		System.out.println("Name : " + stupojo.getName());
		System.out.println("Location : " + stupojo.getLocation());
		System.out.println("Phone : " + stupojo.getPhone());
		System.out.println("Course 1: " + stupojo.getCourses()[0]);
		System.out.println("Course 2: " + stupojo.getCourses()[1]);
		
				
	}
	

}
