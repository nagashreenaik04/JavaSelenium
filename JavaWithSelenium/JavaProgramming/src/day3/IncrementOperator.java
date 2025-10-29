package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ++ is called increment operator
		
		int a = 10;
		System.out.println(a); //10
		
		a++; // a = a +1;
		System.out.println(a); // 11 
		
		//Post increment operator "VariableName++"
		int b= 10;
		int res = b++;
		System.out.println(res); //10
		System.out.println(b); //11
		
		//Pre increment operator "++VariableName"
		int c= 10;
		int reslt = ++c;
		System.out.println(reslt); //11
		System.out.println(c); //11
		

	}
	
	

}
