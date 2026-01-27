package day7_PracticalExampleOnArrays;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num=20; //hard coded value
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Given number is : " + num);
		
		System.out.println("Enter decimal number : ");
		double d = sc.nextDouble();
		System.out.println("Given number is : " + d);
		
		System.out.println("Enter your city : ");
		String s= sc.next();
		System.out.println("Your city is : " + s);

	}

}
