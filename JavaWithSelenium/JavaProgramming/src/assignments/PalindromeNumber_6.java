package assignments;

public class PalindromeNumber_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=121;
		int i_value = i;
		int reversed_num = 0;
		
		while(i>0)
		{
			int digit= i%10;
			reversed_num = reversed_num * 10 + digit;
			//int num = System.out.print(res); //Type mismatch: cannot convert from void to int
			i/=10;
		}
		
		System.out.println(reversed_num);
		
		if(reversed_num==i_value)
		{
			System.out.println(i_value + " is a Palidrome Number.");
		}
		else
		{
			System.out.println(i_value + " is not a Palindrome Number.");
		}

	}

}
