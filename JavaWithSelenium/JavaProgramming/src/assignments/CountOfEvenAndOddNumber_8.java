package assignments;

public class CountOfEvenAndOddNumber_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=23456;
		int even_count=0;
		int odd_count =0;
		
		while(n>0)
		{
			int digit=n%10;
			if(digit%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			n/=10;
		}
		System.out.println("Even count is : " + even_count);
		System.out.println("Odd count is : " + odd_count);

	}

}
