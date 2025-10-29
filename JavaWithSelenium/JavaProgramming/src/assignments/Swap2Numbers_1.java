package assignments;

public class Swap2Numbers_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Temporary Variable
		int a=10;
		int b=20;
		System.out.println("a intial value is : " + a);
		System.out.println("b intial value is : " + b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("a swapped value is : " + a);
		System.out.println("b swapped value is : " + b);
		
		//Without using temporary variable
		
		//Approach 1
		int x= 10;
		int y= 20;
		System.out.println("x intial value is : " + x);
		System.out.println("y intial value is : " + y);
		
		y=y-x;
		x=y+x;
		System.out.println("x swapped value is : " + x);
		System.out.println("y swapped value is : " + y);
		
		
		

	}

}
