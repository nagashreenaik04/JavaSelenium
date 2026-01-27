package day18_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Program started...");
		System.out.println("Program in progress.......");
		
		FileInputStream fis= new FileInputStream("C:\\TEXT.txt");
		
		//Thread.sleep(5000); //5 seconds // we are getting the 'InterruptedException
		
		//Using throws keyword
		Thread.sleep(5000);
		
		//Using try-catch block and handling
		try {
			Thread.sleep(5000); //5sec
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("Program finished...");
		System.out.println("Program exited...");
	}

}
