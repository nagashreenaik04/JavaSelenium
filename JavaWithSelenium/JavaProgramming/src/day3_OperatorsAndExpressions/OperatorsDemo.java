package day3_OperatorsAndExpressions;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Arithmetic operators  + - * / %
		int a = 20, b=10;
		System.out.println(a+b); //30
		//System.out.println("Sum of a and b is : " + [a+b] ); //syatax error on token "+", Expression expected after this token
		
		int result = a + b;
		System.out.println("Sum of a and b is : " + result);
		
		System.out.println("Sum of a and b is : " + (a+b) ); //Sum of a and b is : 30
		System.out.println("Diff of a and b is : " + (a-b) ); //Diff of a and b is : 10
		System.out.println("Multiplication of a and b is : " + (a*b) ); //Multiplication of a and b is : 30
		System.out.println("Division of a and b is : " + (a/b) ); //Division of a and b is : 30
		System.out.println("Modulus(Modulo division) of a and b is : " + (a%b) ); //Modulus of a and b is : 30

		//2) Relational / Comparison operator > < >= <= == !=
		//return boolean value - true/false
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		b=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		//res = a>b; //res cannot be resolved to a variable
		boolean res = a>b;
		System.out.println(res); //false
		
		//3) Logical Operators && || !
		//return boolean value - true/false
		//works between 2 boolean values
		
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1= 10>20; 
		System.out.println(b1); //false
		
		boolean b2 = 20>10;
		System.out.println(b2); //true
		
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		System.out.println((10<20) && (20>10)); //true [It is a combination of relational and logical operator]
		
		
	}

}
