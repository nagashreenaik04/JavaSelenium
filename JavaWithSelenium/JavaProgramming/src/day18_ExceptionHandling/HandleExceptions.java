package day18_ExceptionHandling;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started...");
		
		//Example 1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		try {
			System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data...");
		}
//		//how to handle if we don't know the exception
//		//1.Using multiple Exception and catch blocks
//		// One try block can have n number of catch blocks. [Go to the "MultipleCatchBlocks" class and obseve]
//		//2.Using the 'Exception'
//		catch(Exception e) {
//			System.out.println("Invalid data");
//		}
		
		System.out.println("Program is ended...");
		System.out.println("Program is exited...");
	}

}
