package RestAss;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	
	@Test()
	void testGenerateDummyData()
	{
		Faker faker = new Faker();
		
		String fullname = faker.name().fullName();
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		
		String username = faker.name().username();
		String password = faker.internet().password();
		
		String phonenumber = faker.phoneNumber().cellPhone();
		
		String email = faker.internet().safeEmailAddress();
		
		System.out.println("FullName : "+fullname);
		System.out.println("FirstName : "+firstname);
		System.out.println("LastName : "+lastname);
		System.out.println("UserName : "+username);
		System.out.println("Password : "+password);
		System.out.println("PhoneNumber : "+phonenumber);
		
	}

}
