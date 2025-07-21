package RestAss;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

/*Different ways to create POST Request Body
 1)POST request body using Hash Map
 2)Post request body creation using Org.Json
 3)Post request body creation using POJO class
 4)Post request using external JSon file data
 */
public class DiffWaysToCreatePostRequesBody {
	
	
	int id;
	
	//POST request body using Hash Map
	//@Test(priority =1)
	void testPostusingHashMap()
	{
		HashMap data = new HashMap();
		data.put("name", "QA");
		data.put("location", "Karnataka");
		data.put("phone", "9876543210");
		
		String courseArr[] = {"C","C#"};
		data.put("courses", courseArr);
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("http://localhost:3000/Students/")
			//.jsonPath().getInt("id")
		
		.then()
			.statusCode(201)
			.body("name", equalTo("QA"))
			.body("location", equalTo("Karnataka"))
			.body("phone",equalTo("9876543210"))
			.body("courses[0]", equalTo("C"))
			.body("courses[1]", equalTo("C#"))
			.header("Content-Type","application/json")
			.log().all();
	}
	

	
	//POST request body using org.json library
		//@Test(priority =1)
		void testPostusingJSonLibrary()
		{
			JSONObject data = new JSONObject(); 
			data.put("name", "QA");
			data.put("location", "Karnataka");
			data.put("phone", "9876543210");
			
			String courseArr[] = {"C","C#"};
			data.put("courses", courseArr);
			
			given()
				.contentType("application/json")
				.body(data.toString())
			
			.when()
				.post("http://localhost:3000/Students/")
				//.jsonPath().getInt("id")
			
			.then()
				.statusCode(201)
				.body("name", equalTo("QA"))
				.body("location", equalTo("Karnataka"))
				.body("phone",equalTo("9876543210"))
				.body("courses[0]", equalTo("C"))
				.body("courses[1]", equalTo("C#"))
				.header("Content-Type","application/json")
				.log().all();
		}
		
		
		//POST request body using POJO class
				//@Test(priority =1)
				void testPostusingPOJO()
				{	
					Pojo_PostRequest data = new Pojo_PostRequest();
					data.setName("QA");
					data.setLocation("Karnataka");
					data.setPhone("9876543210");
					String coursesArr[] = {"C","C++"};
					
					data.setCourses(coursesArr);
					
					
					given()
						.contentType("application/json") 
						.body(data)
					
					.when()
						.post("http://localhost:3000/Students/")
						//.jsonPath().getInt("id")
					
					.then()
						.statusCode(201)
						.body("name", equalTo("QA"))
						.body("location", equalTo("Karnataka"))
						.body("phone",equalTo("9876543210"))
						.body("courses[0]", equalTo("C"))
						.body("courses[1]", equalTo("C++"))
						.header("Content-Type","application/json")
						.log().all();
				}		
				
				
				//Post request using external JSon file data
				@Test(priority =1)
				void testPostusingExternalJSonFile() throws FileNotFoundException
				{
					File f = new File(".\\body.json");
					
					FileReader fr = new FileReader(f);
					
					JSONTokener jt = new JSONTokener(fr);
					
					JSONObject data = new JSONObject(jt);
 
					
					given()
						.contentType("application/json")
						.body(data.toString())
					
					.when()
						.post("http://localhost:3000/Students/")
						//.jsonPath().getInt("id")
					
					.then()
						.statusCode(201)
						.body("name", equalTo("John"))
						.body("location", equalTo("India"))
						.body("phone",equalTo("1234567890"))
						.body("courses[0]", equalTo("Java"))
						.body("courses[1]", equalTo("Selenium"))
						.header("Content-Type","application/json")
						.log().all();
				}
				
		
		
		//deleting the student record
		//@Test(priority=2)
		void testDelete()
		{
			given()
			
			.when()
				.delete("http://localhost:3000/Students/6075")
			
			.then()
				.statusCode(200);		
		}
	
}
