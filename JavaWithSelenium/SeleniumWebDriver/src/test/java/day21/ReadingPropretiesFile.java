package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropretiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. create object of the Properties file
		Properties propertiesobj = new Properties();
		
		//location of the properties file
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//loading properties file
		propertiesobj.load(file);
		
		//Reading data from properties file
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String pwd = propertiesobj.getProperty("password");
		String ordid = propertiesobj.getProperty("orderid");
		String custid = propertiesobj.getProperty("customerid");
		
		//print the data
		System.out.println(url + " " + email  + " " + pwd  + " " + ordid  + " " + custid);
		
		//reading all the keys from the properties file
//		Set<String> keys = propertiesobj.stringPropertyNames();
////		System.out.println(keys); //[password, orderid, customerid, appurl, email]
//		
//		for(String key:keys) {
//			System.out.println(key);
//		}
//		
		//Another way to capture the keys
		Set<Object> keys = propertiesobj.keySet();
//		System.out.println(keys); //[password, orderid, customerid, appurl, email]
		
		for(Object key: keys) {
			System.out.println(key);
		}
		
		//Reading all the values
		Collection<Object> values = propertiesobj.values();
		System.out.println(values); //[abcxyz, 123, 234, https://www.opencart.com/, abc@gmail.com]

		for(Object val: values) {
			System.out.println(val);
		}
		
		file.close();
	}

}
