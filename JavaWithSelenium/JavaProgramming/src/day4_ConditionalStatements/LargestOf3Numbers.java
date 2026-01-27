package day4_ConditionalStatements;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50, b=40, c=30;
		
		if(a>b && a>c)
		{
			System.out.println(a + " is a largest number.");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is a largest number.");
		}
		else
		{
			System.out.println(c + " is a largest number.");
		}

	}

}
