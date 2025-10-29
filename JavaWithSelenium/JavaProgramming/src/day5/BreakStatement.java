package day5;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10; i++)
		{
			if(i==5) {
				break;
				//System.out.println(i); //Unreachable code [it is a java syntax error after break statement any other statement should not execute]
			}
			System.out.println(i);
		}

	}

}
