package day7_PracticalExampleOnArrays;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number : ");
		int a = sc.nextInt();
		System.out.println("Enter a second numbe : ");
		int b = sc.nextInt();
		
		System.out.println("Addition of 2 numbers : " + (a+b));
		
		System.out.println("Enter name :");
		String name= sc.next();
		System.out.println("Your name is :" + name);
		
		System.out.println("Ente age : ");
		int age = sc.nextInt();
		System.out.println("your age is : " + age);
		
		System.out.println("Enter unknown value : ");
		Object value= sc.next();
		System.out.println("Unknown value is : " + value);
		
		System.out.println("Enter any Letter : ");
		char c = sc.next().charAt(0);
		System.out.println("Entered letter is : " +c);

	}

}
