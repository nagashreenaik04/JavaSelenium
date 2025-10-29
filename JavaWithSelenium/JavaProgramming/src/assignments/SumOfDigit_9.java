package assignments;

public class SumOfDigit_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1234;
		int o_n=n;
		int sum =0;
		
		while(n>0)
		{
			int digit = n%10;
			sum+=digit;
			n/=10;
		}

		System.out.println("Sum of digit " + o_n + " is " + sum);
	}

}
