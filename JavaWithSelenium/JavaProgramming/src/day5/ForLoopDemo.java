package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print 1 to 10 numbers
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		//Print even number of 1 to 10
		for(int j=2; j<=10; j+=2)
		{
			System.out.println(j);
		}
		
		//Print 1 to 10 number is even or odd
		for(int k=1; k<=10; k++)
		{
			if(k%2==0)
			{
				System.out.println(k + " Even");
			}
			else
			{
				System.out.println(k + " Odd");
			}
		}
		
		//Print 10 to 1 desce
		for(int l=10; l>0; l--)
		{
			System.out.println(l);
		}

	}

}
