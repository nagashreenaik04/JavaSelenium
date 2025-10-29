package assignments;

public class LargestNumber_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//largest Number using if-else ladder
		int a= 10, b=20, c =30;
		
		if(a>b && a>c)
		{
			System.out.println(a + " is a largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is a largest number");
		}
		else if(c>a && c>b)
		{
			System.out.println(c + " is a largest number");
		}
		
		int x=10, y=20;
		int largest_num = (x>y)?x:y;
		System.out.println(largest_num + " is a largest number");

	}

}
