package day18_ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String []args)
	{
		System.out.println("Program is started...");
		
		//Example 1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		
		System.out.println(100/num);
		//if we given the num = 0 then we will get the 
			//Exception in thread "main" java.lang.ArithmeticException: / by zero
			//at day18_ExceptionHandling.ExceptionDemo.main(ExceptionDemo.java:16)
		
		//Example 2
		int a[] = new int[5];
		System.out.println("Enter the position(0-4):");
		int pos = sc.nextInt();
		
		System.out.println("Enter a value:");
		int value = sc.nextInt();
		
		a[pos]=value;
		System.out.println(a[pos]);
		//if we enter the pos = 5 and enter the value something then we will get the 
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
			//at day18_ExceptionHandling.ExceptionDemo.main(ExceptionDemo.java:26)
		
		//Example 3
		String s= "12345";
		int num1 = Integer.parseInt(s);
		System.out.println(num1);
		s= "welcome";
//		int s1 = Integer.parseInt(s);
//		System.out.println(s1);
		//if we entering the string value and trying to convert as a int then we will get the 
			//Exception in thread "main" java.lang.NumberFormatException: For input string: "welcome"
			//at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		
		//Example 4
		String str= "Welcome";
		System.out.println(str.length());
		str=null;
		System.out.println(str.length());
		//if we are expecting the string value 'null' length then we will get the 
			//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
			//at day18_ExceptionHandling.ExceptionDemo.main(ExceptionDemo.java:50)

		
		
		System.out.println("Program is ended...");
		System.out.println("Program is exited...");
	}

}
