package day8_WorkingWithJavaStrings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome";
		//String s=new String("Welcome");
		
		System.out.println(s); // Welcome
		
		//length() of String - returns length of a String (number of characters)
		int l = s.length();
		System.out.println("Length of a String is : " + l); //7
		System.out.println("Hello".length()); //5
		
		//concat() - joining Strings
		String s1="Welcome ";
		String s2="to java ";
		String s3="automation";
		
		System.out.println(s1+s2); //Welcome to java
		System.out.println(s1.concat(s2)); //Welcome to java
		
		System.out.println(s1+s2+s3); //Welcome to java automation
		System.out.println(s1.concat(s2).concat(s3)); //Welcome to java automation
		System.out.println(s1.concat(s2+s3)); //Welcome to java automation
		
		System.out.println("Welcome "+"to java"); //Welcome to java
		System.out.println("Welcome ".concat("to java")); //Welcome to java
		
		//trim() -remove spaces right and left side
		s= "   Welcome   ";
		System.out.println("Before trimming " +s.length()); //13
		System.out.println(s); //   Welcome   
		System.out.println(s.trim()); //Welcome
		System.out.println("After trimming "+s.trim().length()); //7
		
		//charAt()-returns a character from a String based on index
		s="Welcome";
		System.out.println("3rd index character is : " +s.charAt(3)); //c
		System.out.println("0th index character is : " +s.charAt(0)); //W
		
		//contains() - returns true/false
		//check String is a part of main String or not
		boolean b =s.contains("Wel");
		System.out.println(b); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("wel")); //false
		System.out.println(s.contains("COME")); //false
		System.out.println(s.contains("Welme")); //false
		
		//equals() , equalsIgnoreCase() - compare Strings
		s1="Welcome";
		s2="Welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("Welcome")); //true
		System.out.println(s1.equals("welcome")); //false
		System.out.println(s1.equalsIgnoreCase("welcome")); //true
		
		//replace() - replace single/multiple(sequence) of characters in String
		s= "Welcome to selenium java selenium python selenium C#";
		System.out.println(s.replace('e', 'X')); //WXlcomX to sXlXnimu java sXlXnium python sXlXnium C#
		System.out.println(s.replace("selenium", "playwright"));
		
		//substring() - extract the sub String from the main String
		//starting index - 0
		//ending index -1
		System.out.println(s.substring(0, 3)); //Wel
		s="Selenium";
		System.out.println(s.substring(1, 5)); //elen
		
		//toUpperCase() toLowerCase()
		s= "Welcome";
		System.out.println(s.toUpperCase()); //WELCOOME
		System.out.println(s.toLowerCase()); //welcome
		
		//split() - split the String into multiple parts based on delimeter
		s= "abc@gmail.com";
		System.out.println(s.substring(0, 3)); //abc
		String a[]= s.split("@");
		//String s[]= s.split("@"); //duplicate local variable s
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		System.out.println(Arrays.toString(a)); //[abc, gmail.com]
		
		//Ex 1
		String amount = "$15,20,25"; //152025
		//System.out.println(amount.replace('$', '')); //invalid charcter constant
		System.out.println(amount.replace("$", " ")); // 15,20,25
		System.out.println(amount.replace("$ ", " ")); //15,20,25
		System.out.println(amount.replace("$", " ").replace(",", "")); // 152025
		
		//EX 2
		s = "abc,123@xyz"; //abc 123 xyz
		String arr1[]=s.split(","); //abc 123@xyz
		System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
		String arr2[]=arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[123, xyz]
		System.out.println(arr1[0]); //abc
		System.out.println(arr2[0]); //123
		System.out.println(arr2[1]); //xyz
		
		//Ex 3
		s= "abc 123";
		String arr[] = s.split(" ");
		System.out.println(Arrays.toString(arr)); //[abc, 123]
		
		// * % ^ & ( ) - you cannot use as delimeter
		String name = "John Kenedy";
		System.out.println(name.contains("john")); //false
		System.out.println(name.replace('J', 'j').contains("john")); //true
		System.out.println(name.toLowerCase().contains("john")); //true
		
 		

	}

}
