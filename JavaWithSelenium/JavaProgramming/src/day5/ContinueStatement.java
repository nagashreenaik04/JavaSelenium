package day5;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++)
		{
			if(i==5) {
				continue; //once execute the continue statement it will jump into the incre/dec statement
			}
			System.out.println(i);
		}
		
		//Skip the 3, 5 and 9 number
		for(int j=1; j<=10; j++)
		{
			if(j==3 || j==5 || j==9) {
				continue; //once execute the continue statement it will jump into the incre/dec statement
			}
			System.out.println(j);
		}

	}

}

