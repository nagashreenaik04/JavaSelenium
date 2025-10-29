package assignments;

public class SmallestNumber_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20, c=30;
		
		if(a<b && a<c)
		{
			System.out.println(a + " is a smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println(b + " is a smallest number");
		}
		else if(c<b && c<a)
		{
			System.out.println(c + " is a smallest number");
		}
		
		int x=5, y=20;
		
		int smallest_num = (x<y)?x:y;
		System.out.println(smallest_num + " is a smallest number");

	}

}
