package assignments;

public class PrimeNumber_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=3;
		int count=0;
		
		if(num<=1)
		{
			System.out.println(num + " is not a Prime number.");
		}
		else
		{
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
				
			}
			if(count==0)
			{
				System.out.println(num + " is a Prime Number.");
			}
			else
			{
				System.out.println(num + "is not a Prime Number.");
			}
		}


	}

}
