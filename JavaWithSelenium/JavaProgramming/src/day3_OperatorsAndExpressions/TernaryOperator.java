package day3_OperatorsAndExpressions;

public class TernaryOperator {
	
	public static void main(String[] args) {
		
		//Conditional Operator/ Ternary Operator
		
		//var = exp ? result1 : result2 ;
		
		//Example 1
		int a =20, b=10;
		int x=(a>b)? a: b;
		System.out.println(x); //20
		int y=(a<b)? a:b;
		System.out.println(y); //10
		
		//Example2
		int z = (1==1)?100:200;
		System.out.println(z); //100
		int w = (1==2)?100:200;
		System.out.println(w); //200
		
		//Example3
		int person_age =30;
		String res =(person_age >18) ? "Eligible" : "Not eligible";
		System.out.println(res); //Eligible
		
		
	}

}
