package RestAss;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreatedAPIHTTPRequests {
	
	String id;
	
	public CreatedAPIHTTPRequests() {
        RestAssured.baseURI = "http://localhost:3000/Students"; // Set the base URL
    }

	
	@Test(priority = 1)
	void getStudents() {
	    given()
	    .when()
	        .get("/")
	    .then()
	        .statusCode(200)
	        .log().all();
	}

	@Test(priority = 2)
	void createStudent() {
	    HashMap<String, Object> data = new HashMap<>();
	    data.put("name", "QA");
	    data.put("location", "Karnataka");
	    data.put("phone", "9876543210");

	    String[] courseArr = {"C", "C#"};
	    data.put("courses", courseArr);

	    id = given()
	        .contentType("application/json")
	        .body(data)
	    .when()
	        .post("/")
	        .jsonPath().getString("id");
	}

	@Test(priority = 3, dependsOnMethods = {"createStudent"})
	void updateStudent() {
	    HashMap<String, Object> data = new HashMap<>();
	    data.put("name", "AutomationTesting");
	    data.put("location", "India");
	    data.put("phone", "9876543210");

	    String[] courseArr = {"Java", "RestAssured"};
	    data.put("courses", courseArr);

	    given()
	        .contentType("application/json")
	        .body(data)
	    .when()
	        .put("/" + id)
	    .then()
	        .statusCode(200)
	        .log().all();
	}

	@Test(priority = 4, dependsOnMethods = {"createStudent"})
	void deleteStudent() {
	    given()
	    .when()
	        .delete("/" + id)
	    .then()
	        .statusCode(200)
	        .log().all();
	}

}

