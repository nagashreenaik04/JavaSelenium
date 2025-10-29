package day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100, b =200;
		
		System.out.println("The value of a is : " + a);
		System.out.println("The value of b is : " + b);
		System.out.println(a+b); //300
		System.out.println("The sum of a and b is : "+a+b); //The sum of a and b is : 100200
		System.out.println("The sum of a and b is : "+ a+b); //The sum of a and b is : 100200
		
		System.out.println("The sum of a and b is :" +(a+b));
		
		byte by = 125;
		System.out.println(by);
		
		short sh = 3535;
		System.out.println(sh);
		
		//long l = 23648333393399; //The literal ..... of type int is out of range
		long l = 227844464746464l; //227844464746464L/l [lower or upper case L we need to enter at the end]
		System.out.println(l);
		
		//Decimal Numbers - float and double
		
		float item_price = 15.5f;
		System.out.println(item_price);
		
		double dbl = 1234.34748347;
		System.out.println(dbl);
		
		char grade = 'A';
		System.out.println(grade);
		
		String name ="John";
		System.out.println(name);
		
		//char ch = "a"; // Type mismatch: cannot convert from String to char
		//char ch= 'ABC'; //Invalid character constant
		//String s= 'ABC'; //Invalid character constant
		//String s = 'A'; // Type mismatch: cannot convert from char to String
		String s = "A";
		System.out.println(s);
		
		boolean bl = true; // allows only true/false
		System.out.println(bl);
		
		int x=100;
		//x = "xyz"; //Type mismatch :cannot convert from String to int
		x =200;
		System.out.println(x);
		
		//boolean b2 = "true"; //Type mismatch: cannot convert from String to boolean [because data  entered into double quote]
		//String b2 = true; //Type mismatch: cannot convert from boolean to String [because data is boolean values]
		
		String b2= "true"; 
		System.out.println(b2); //true
	}

}
