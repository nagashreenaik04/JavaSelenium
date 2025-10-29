package assignments;

public class ReverseNumber_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1234;
		int res =0;
		
		
		while(i>0)
		{
			res=i%10;
			System.out.print(res);
			i/=10;
		}
		
		/*
		while(i>0)
		{
			int digit= i%10;
			res = res * 10 + digit;
			i/=10;
		}
		System.out.println(res);*/
	}

}
