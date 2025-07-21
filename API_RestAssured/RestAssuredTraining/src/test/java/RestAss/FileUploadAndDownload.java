package RestAss;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.annotations.Test;

public class FileUploadAndDownload {
	
	@Test
	void singleFileUpload()
	{
		File myfile = new File("");
		
		given()
			.multiPart("file", myfile)
			.contentType("multipart/form-data")
		
		.when()
			.post("http://localhost:8080/uploadFile")
		
		.then()
			.statusCode(200)
			.body("fileName", equalTo(""))
			.log().all();
	}
	
	@Test
	void multipleFilesUpload()		//wont work for all kinds API
	{
		File myfile1 = new File("");
		File myfile2 = new File("");
		
		File filearr[]= {myfile1,myfile2};
		
		given()
			.multiPart("files", filearr)
			//.multiPart("files", myfile1)
			//.multiPart("files", myfile2)
			.contentType("multipart/form-data")
		
		.when()
			.post("http://localhost:8080/uploadFile")
		
		.then()
			.statusCode(200)
			.body("[0].fileName", equalTo(""))
			.body("[1].fileName", equalTo(""))
			.log().all();
	}
	
	void fileDownload()
	{
		given()
		
		.when()
		.get("http://localhost:8080/downloadFile/Test.txt")

		.then()
			.statusCode(200)
			.log().all();
		
		
	}

}
