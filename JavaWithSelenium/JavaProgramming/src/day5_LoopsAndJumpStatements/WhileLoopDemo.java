package day5_LoopsAndJumpStatements;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1: print 1....10 numbers
		
		int i=1; //initialization
		
		while(i<=10) //Condition
		{
			System.out.println(i);
			i++; //inc
		}
		
		//Example 2: print Hello message 10 times
		
		int j=1;
		while(j<=10)
		{
			System.out.println("Hello");
			j++;
		}
		
		//Example 3: print Even number between 1 to 10
		
		//Approach 1
		/*
		int k=2;
		while(k<=10)
		{
			System.out.println(k);
			k+=2;
		}
		*/
		
		//Approach 2
		int k=2;
		while(k<=10)
		{
			if(k%2==0)
			{
				System.out.println(k);
			}
			k++;
		}
		
		//Example 4: Print 1 to 10 number is even or odd
		
		int l=1;
		while(l<=10)
		{
			if(l%2==0)
			{
				System.out.println(l + " Even");
			}
			else
			{
				System.out.println(l + " Odd");
			}
			l++;
		}
		
		//Example 5: Print the number decending order i.e. 10 to 1
		
		int m=10;
		while(m>0)
		{
			System.out.println(m);
			m--;
		}
		
		while(m>0); //This is a valid statement
		

	}

}
