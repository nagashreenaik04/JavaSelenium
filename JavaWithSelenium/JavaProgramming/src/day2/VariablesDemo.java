package day2;

public class VariablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a; //Declaration
		// int a =100; //Duplicate local variable
		//System.out.println(a); //The local variable a may not have been initialized
		a = 100; //Assignment
		// int a = 100; // A one single statement [declaration + assignment]
		
		System.out.println(a); // 100
		System.out.println("a"); // a
		
		a = 200;
		System.out.println(a); //200
		
		//Approach -1 Define 3 variable in 3 different line
		/*int b = 200; 
		int c = 300; 
		int d = 400; 
		*/
		
		//Approach 2 - Crate a variable in single line, and assign a variable in different line
		/*int b, c, d;
		b = 200;
		c = 300;
		d = 400;
		*/		
		
		//Approach 3 - Define variable once and along with the variable we also assign a data
		int b=200, c=300, d=400;
		
		//System.out.println(b c d); //Multiple markers at this line .....
		//System.out.println(b, c, d); //The method println(int) in the type of PrintStream is not applicable for the arguments(int, int, int)
		
		/*
		System.out.println(b); //200
		System.out.println(c); //300
		System.out.println(d); //400
		*/
		
		//Performed Concatanation
		System.out.println("The value of b is : " + b); //200
		System.out.println("The value of c is : " + c); //300
		System.out.println("The value of d is : " + d); //400
		  
		//System.out.println("The value of a is :" a); //Syntax error on token "a" delete this token [Concatenation missing]
		
		System.out.println(b+c+d); //900 [performed additional operation
		System.out.println(b + " " + c + " " + d); // 200 300 400 [concatenate with space]
		
		//String s = 'A'; // Type mismatch: cannot convert from char to String
		//char e = "a"; // Type mismatch: cannot convert from String to char
		
		
		
		
		
 
	}

}
