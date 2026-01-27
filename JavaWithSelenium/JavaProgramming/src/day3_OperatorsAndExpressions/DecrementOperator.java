package day3_OperatorsAndExpressions;

public class DecrementOperator {
	
	public static void main(String[] args)
	{
		// -- is called decrement operator
		
		int a = 10;
		System.out.println(a); //10
		
		a--; // a = a - 1;
		System.out.println(a); // 9
		
		//Post decrement operator "VariableName--"
		int b= 100;
		int res = b--;
		System.out.println(res); //100
		System.out.println(b); //99
		
		//Pre-decrement operator "--VariableName"
		int c= 100;
		int reslt = --c;
		System.out.println(reslt); //99
		System.out.println(c); //99
		
	}

}
